package Project_9;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Exercise_9 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Exercise_9 frame = new Exercise_9();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Exercise_9() {
        setTitle("BMI Calculator");
        setBounds(100, 100, 400, 250);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblHeight = new JLabel("Height (m):");
        lblHeight.setFont(new Font("Verdana Pro", Font.BOLD, 14));
        lblHeight.setBounds(10, 30, 120, 25);
        contentPane.add(lblHeight);

        JTextField txtHeight = new JTextField();
        txtHeight.setBounds(140, 30, 200, 25);
        contentPane.add(txtHeight);

        JLabel lblWeight = new JLabel("Weight (kg):");
        lblWeight.setFont(new Font("Verdana Pro", Font.BOLD, 14));
        lblWeight.setBounds(10, 70, 120, 25);
        contentPane.add(lblWeight);

        JTextField txtWeight = new JTextField();
        txtWeight.setBounds(140, 70, 200, 25);
        contentPane.add(txtWeight);

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setBackground(Color.ORANGE);
        btnCalculate.setFont(new Font("Verdana Pro", Font.PLAIN, 14));
        btnCalculate.setBounds(150, 110, 100, 30);
        contentPane.add(btnCalculate);

        JLabel lblResult = new JLabel("BMI:");
        lblResult.setFont(new Font("Verdana Pro", Font.BOLD, 14));
        lblResult.setBounds(30, 160, 50, 25);
        contentPane.add(lblResult);

        JLabel lblBMI = new JLabel("0");
        lblBMI.setBounds(120, 160, 200, 25);
        lblBMI.setFont(new Font("Arial", Font.BOLD, 14));
        contentPane.add(lblBMI);

        btnCalculate.addActionListener(e -> {
            try {
                double height = Double.parseDouble(txtHeight.getText());
                double weight = Double.parseDouble(txtWeight.getText());
                double bmi = weight / (height * height);
                lblBMI.setText(String.format("%.2f", bmi));
            } catch (NumberFormatException ex) {
                lblBMI.setText("Invalid input");
            }
        });
    }
}
