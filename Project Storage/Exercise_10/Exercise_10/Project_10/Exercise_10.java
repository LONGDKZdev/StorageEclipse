package Project_10;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Exercise_10 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Exercise_10 frame = new Exercise_10();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Exercise_10() {
        setTitle("Prime Checker");
        setBounds(100, 100, 400, 200);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.desktop);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNumber = new JLabel("Enter Number:");
        lblNumber.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblNumber.setBounds(30, 30, 100, 25);
        contentPane.add(lblNumber);

        JTextField txtNumber = new JTextField();
        txtNumber.setFont(new Font("Times New Roman", Font.BOLD, 12));
        txtNumber.setBounds(140, 30, 200, 25);
        contentPane.add(txtNumber);

        JButton btnCheck = new JButton("Check");
        btnCheck.setBackground(new Color(128, 255, 128));
        btnCheck.setFont(new Font("Times New Roman", Font.BOLD, 12));
        btnCheck.setBounds(150, 80, 100, 30);
        contentPane.add(btnCheck);

        JLabel lblResult = new JLabel("Result:");
        lblResult.setFont(new Font("Times New Roman", Font.BOLD, 12));
        lblResult.setBounds(30, 130, 50, 25);
        contentPane.add(lblResult);

        JLabel lblPrime = new JLabel("");
        lblPrime.setBounds(140, 130, 200, 25);
        lblPrime.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblPrime);

        btnCheck.addActionListener(e -> {
            try {
                int number = Integer.parseInt(txtNumber.getText());
                lblPrime.setText(isPrime(number) ? "Prime Number" : "Not Prime");
            } catch (NumberFormatException ex) {
                lblPrime.setText("Invalid input");
            }
        });
}

	private boolean isPrime(int number) {
		return false;
	}

	private boolean isPrime1(int number) {
		return false;
	}
	
}