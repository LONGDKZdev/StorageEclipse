package cinema_Seller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import connection.SQLServerConnection;

public class CinemaSeller extends JPanel {

    private static final long serialVersionUID = 1L;
    private JPanel ticketPanel;
    private JTextArea receiptArea;

    public CinemaSeller() {
        setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("Cinema Seller Panel");
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        add(lblTitle, BorderLayout.NORTH);

        JPanel controlPanel = new JPanel();
        add(controlPanel, BorderLayout.CENTER);

        JButton btnPrintReceipt = new JButton("Print Receipt");
        btnPrintReceipt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                printReceipt();
            }
        });

        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetFields();
            }
        });

        JButton btnSelectUser = new JButton("Select User");
        btnSelectUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openUserSelectionDialog();
            }
        });

        controlPanel.add(btnPrintReceipt);
        controlPanel.add(btnReset);
        controlPanel.add(btnSelectUser);

        receiptArea = new JTextArea();
        receiptArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
        receiptArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(receiptArea);
        add(scrollPane, BorderLayout.SOUTH);
    }

    private void printReceipt() {
        JOptionPane.showMessageDialog(this, "Printing receipt...", "Info", JOptionPane.INFORMATION_MESSAGE);
        
    }

    private void resetFields() {
        receiptArea.setText("");
        JOptionPane.showMessageDialog(this, "Fields have been reset.", "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void openUserSelectionDialog() {
        JFrame userFrame = new JFrame("Select User");
        userFrame.setSize(400, 300);
        userFrame.setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        DefaultListModel<String> userModel = new DefaultListModel<>();
        JList<String> userList = new JList<>(userModel);
        JScrollPane scrollPane = new JScrollPane(userList);

        try (Connection connection = SQLServerConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement("SELECT Username FROM Users")) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                userModel.addElement(rs.getString("Username"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading users: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        JButton btnSelectUser = new JButton("Select User");
        btnSelectUser.addActionListener(e -> {
            String selectedUser = userList.getSelectedValue();
            if (selectedUser != null) {
                JOptionPane.showMessageDialog(userFrame, "Selected user: " + selectedUser, "Info", JOptionPane.INFORMATION_MESSAGE);
                saveUserPurchase(selectedUser);
                userFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(userFrame, "Please select a user!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        });

        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(btnSelectUser, BorderLayout.SOUTH);

        userFrame.add(panel);
        userFrame.setVisible(true);
    }

    private void saveUserPurchase(String userName) {
        try (Connection connection = SQLServerConnection.getConnection();
             PreparedStatement ps = connection.prepareStatement(
                     "INSERT INTO UserPurchases (Username, PurchaseDetails, PurchaseTime) VALUES (?, ?, GETDATE())")) {

            ps.setString(1, userName);
            ps.setString(2, receiptArea.getText());
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Purchase saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error saving purchase: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
