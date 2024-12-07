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
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNumber = new JLabel("Enter Number:");
        lblNumber.setBounds(30, 30, 100, 25);
        contentPane.add(lblNumber);

        JTextField txtNumber = new JTextField();
        txtNumber.setBounds(140, 30, 200, 25);
        contentPane.add(txtNumber);

        JButton btnCheck = new JButton("Check");
        btnCheck.setBounds(150, 80, 100, 30);
        contentPane.add(btnCheck);

        JLabel lblResult = new JLabel("Result:");
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