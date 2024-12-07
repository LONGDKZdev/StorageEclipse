package Project_7;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Exercise_7 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Exercise_7 frame = new Exercise_7();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Exercise_7() {
        setTitle("Temperature Converter");
        setBounds(100, 100, 400, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblCelsius = new JLabel("Độ C:");
        lblCelsius.setBounds(30, 30, 80, 25);
        contentPane.add(lblCelsius);

        JTextField txtCelsius = new JTextField();
        txtCelsius.setBounds(120, 30, 120, 25);
        contentPane.add(txtCelsius);

        JButton btnConvert = new JButton("Convert");
        btnConvert.setBounds(260, 30, 100, 25);
        contentPane.add(btnConvert);

        JLabel lblFahrenheit = new JLabel("Độ F:");
        lblFahrenheit.setBounds(30, 80, 80, 25);
        contentPane.add(lblFahrenheit);

        JTextField txtFahrenheit = new JTextField();
        txtFahrenheit.setBounds(120, 80, 120, 25);
        txtFahrenheit.setEditable(false);
        contentPane.add(txtFahrenheit);

        btnConvert.addActionListener(e -> {
            try {
                double celsius = Double.parseDouble(txtCelsius.getText());
                double fahrenheit = celsius * 9 / 5 + 32;
                txtFahrenheit.setText(String.format("%.2f", fahrenheit));
            } catch (NumberFormatException ex) {
                txtFahrenheit.setText("Invalid input");
            }
        });
    }
}
