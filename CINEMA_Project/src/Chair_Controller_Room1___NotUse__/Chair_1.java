package Chair_Controller_Room1___NotUse__;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Chair_1 extends JPanel {

    private static final long serialVersionUID = 1L;
    private boolean isBooked = false; 

    /**
     * Create the panel.
     */
    public Chair_1() {
        setLayout(null);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new ImageIcon(Chair_1.class.getResource("/Icon/Chair.png")));
        lblNewLabel.setBounds(10, 11, 125, 59);
        add(lblNewLabel);
        
        JButton btnNewButton = new JButton("Booked");
        btnNewButton.setBounds(29, 121, 89, 23);
        btnNewButton.setBackground(Color.RED);
        btnNewButton.setOpaque(true);
        btnNewButton.setBorderPainted(false); 
        add(btnNewButton);
        
        JLabel JLCHAIR_1 = new JLabel("CHAIR 1");
        JLCHAIR_1.setHorizontalAlignment(SwingConstants.CENTER);
        JLCHAIR_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        JLCHAIR_1.setBounds(10, 68, 130, 50);
        add(JLCHAIR_1);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isBooked) {
                    btnNewButton.setBackground(Color.GREEN);
                    isBooked = true;
                } else {
                    btnNewButton.setBackground(Color.RED);
                    isBooked = false;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Cinema Seats");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel productContainer = new JPanel();
        productContainer.setLayout(new GridLayout(4, 5, 10, 10));  // 5 cột x 4 hàng
        
        for (int i = 1; i <= 20; i++) {
            productContainer.add(new Chair_1());
        }

        JScrollPane productScrollPane = new JScrollPane(productContainer);
        productScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        productScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        frame.add(productScrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}

