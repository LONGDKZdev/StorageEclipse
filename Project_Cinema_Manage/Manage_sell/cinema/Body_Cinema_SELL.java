package cinema;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Body_Cinema_SELL extends JPanel implements Method_For_Button {
    private static final long serialVersionUID = 1L;
    private JTextArea receiptArea;
    private JTextField totalField;
    private JCheckBox chkAdultTicket, chkChildTicket, chkPopcorn, chkDrink;
    private JSpinner spnAdultTicket, spnChildTicket, spnPopcorn, spnDrink;

//  dùng implement kế thừ Method_For_Button(trung gian)
	//    để lấy các phương thức chính từ CinemaMethod
	@Override
	public void calculateTotal(ActionEvent e) {}
	@Override
	public void resetFields() {}
	@Override
	public void saveReceipt(ActionEvent e) {}
	//                                             //
    
    
    public Body_Cinema_SELL() {
        setLayout(new BorderLayout());

        JPanel receiptPanel = new JPanel();
        receiptPanel.setPreferredSize(new Dimension(450, 600));
        receiptPanel.setBorder(new LineBorder(Color.BLACK));
        receiptPanel.setLayout(null);

        receiptArea = new JTextArea("      *****************************************************************************\n"
            + "      ************************ CINEMA RECEIPT ********************************\n"
            + "      *****************************************************************************\n");
        receiptArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(receiptArea);
        scrollPane.setBounds(10, 10, 430, 450);
        receiptPanel.add(scrollPane);

        JLabel lblTotal = new JLabel("TOTAL :");
        lblTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 18));
        lblTotal.setBounds(10, 470, 80, 30);
        receiptPanel.add(lblTotal);

        totalField = new JTextField("0 VND");
        totalField.setFont(new Font("Segoe UI", Font.BOLD, 16));
        totalField.setBounds(100, 470, 300, 30);
        totalField.setEditable(false);
        receiptPanel.add(totalField);

        add(receiptPanel, BorderLayout.WEST);

        JPanel productPanel = new JPanel();
        productPanel.setLayout(new GridLayout(2, 2, 10, 10));
        add(productPanel, BorderLayout.CENTER);

        addProduct(productPanel, "adult ticket (Vé người lớn)", "100,000 VND", true, 10);
        addProduct(productPanel, "child ticket (Vé trẻ em)", "65,000 VND", true, 10);
        addProduct(productPanel, "Popcorn (Bắp rang)", "40,000 VND", true, 10);
        addProduct(productPanel, "drink (Nước uống)", "25,000 VND", true, 10);

        
        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setFont(new Font("Times New Roman", Font.BOLD, 30));
        btnCalculate.setBounds(100, 500, 300, 64);
        btnCalculate.setBackground(Color.GREEN);
        btnCalculate.setFocusPainted(false);
        btnCalculate.setCursor(new Cursor(Cursor.HAND_CURSOR));

        // Thêm hiệu ứng khi đưa chuột tới
        btnCalculate.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnCalculate.setBackground(Color.LIGHT_GRAY); // Đổi màu khi chuột vào
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnCalculate.setBackground(Color.GREEN); // Đổi lại màu khi chuột ra
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                CinemaMethods.calculateTotal(receiptArea, totalField, chkAdultTicket, spnAdultTicket,
                        chkChildTicket, spnChildTicket, chkPopcorn, spnPopcorn, chkDrink, spnDrink);
            }
        });

        JButton btnReset = new JButton("RESET");
        btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnReset.setBounds(100, 575, 145, 85);
        btnReset.setBackground(Color.YELLOW);
        btnReset.setFocusPainted(false);
        btnReset.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnReset.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnReset.setBackground(Color.LIGHT_GRAY); // Đổi màu khi chuột vào
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnReset.setBackground(Color.YELLOW); // Đổi lại màu khi chuột ra
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                CinemaMethods.resetFields(receiptArea, totalField, chkAdultTicket, chkChildTicket,
                        chkPopcorn, chkDrink, spnAdultTicket, spnChildTicket, spnPopcorn, spnDrink);
            }
        });

        JButton btnSave = new JButton("PRINT RECEIPT");
        btnSave.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        btnSave.setBounds(255, 575, 145, 85);
        btnSave.setBackground(Color.CYAN);
        btnSave.setFocusPainted(false);
        btnSave.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSave.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSave.setBackground(Color.LIGHT_GRAY); // Đổi màu khi chuột vào
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSave.setBackground(Color.CYAN); // Đổi lại màu khi chuột ra
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                CinemaMethods.saveReceipt(receiptArea, Body_Cinema_SELL.this);
            }
        });

        receiptPanel.add(btnCalculate);
        receiptPanel.add(btnReset);
        receiptPanel.add(btnSave);
    }

    private void addProduct(JPanel panel, String name, String price, boolean isSelectable, int maxQty) {
        JPanel product = new JPanel();
        product.setLayout(null);
        product.setBorder(new LineBorder(Color.GRAY));
        panel.add(product);

        JLabel lblName = new JLabel(name);
        lblName.setBounds(10, 10, 200, 20);
        product.add(lblName);

        JLabel lblPrice = new JLabel("Price: " + price);
        lblPrice.setBounds(10, 40, 200, 20);
        product.add(lblPrice);

        JCheckBox checkBox = new JCheckBox("Select");
        checkBox.setBounds(10, 70, 80, 20);
        product.add(checkBox);

        JSpinner spinner = new JSpinner(new SpinnerNumberModel(0, 0, maxQty, 1));
        spinner.setBounds(95, 71, 50, 20);
        product.add(spinner);

        if (name.contains("người lớn")) {
            chkAdultTicket = checkBox;
            spnAdultTicket = spinner;
        } else if (name.contains("trẻ em")) {
            chkChildTicket = checkBox;
            spnChildTicket = spinner;
        } else if (name.contains("Bắp")) {
            chkPopcorn = checkBox;
            spnPopcorn = spinner;
        } else if (name.contains("Nước")) {
            chkDrink = checkBox;
            spnDrink = spinner;
        }
    }
}

