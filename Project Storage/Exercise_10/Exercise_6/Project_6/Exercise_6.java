package Project_6;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise_6 extends JFrame {

    private JTextField inputField1, inputField2, resultField;

    public Exercise_6() {
        setTitle("Window 1");
        setSize(550, 400);
        
        getContentPane().setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        JLabel titleLabel = new JLabel("Simple Calculate", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        titleLabel.setForeground(Color.RED);
        titleLabel.setBounds(100, 10, 300, 30);

        JLabel inputLabel1 = new JLabel("Input a:");
        inputLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        inputLabel1.setBounds(50, 60, 50, 20);
        inputField1 = new JTextField();
        inputField1.setBounds(120, 60, 200, 25);

        JLabel inputLabel2 = new JLabel("Input b:");
        inputLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        inputLabel2.setBounds(50, 100, 50, 20);
        inputField2 = new JTextField();
        inputField2.setBounds(120, 100, 200, 25);

        JButton addButton = new JButton("Addition");
        addButton.setBackground(Color.GREEN);
        addButton.setBounds(50, 140, 100, 30);

        JButton subtractButton = new JButton("Subtraction");
        subtractButton.setBackground(Color.GREEN);
        subtractButton.setBounds(160, 140, 100, 30);

        JButton multiplyButton = new JButton("Multiplication");
        multiplyButton.setBackground(Color.GREEN);
        multiplyButton.setBounds(270, 140, 120, 30);

        JButton divideButton = new JButton("Division");
        divideButton.setBackground(Color.GREEN);
        divideButton.setBounds(400, 140, 90, 30);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        resultLabel.setBounds(50, 180, 50, 20);
        resultField = new JTextField();
        resultField.setBounds(120, 180, 200, 25);
        resultField.setEditable(false);

        JLabel copyrightLabel = new JLabel("Copy right@ by Vo Huy Long at University VKU", SwingConstants.CENTER);
        copyrightLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        copyrightLabel.setBounds(50, 220, 400, 20);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(inputField1.getText());
                    double b = Double.parseDouble(inputField2.getText());
                    resultField.setText(String.valueOf(a + b));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(inputField1.getText());
                    double b = Double.parseDouble(inputField2.getText());
                    resultField.setText(String.valueOf(a - b));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(inputField1.getText());
                    double b = Double.parseDouble(inputField2.getText());
                    resultField.setText(String.valueOf(a * b));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(inputField1.getText());
                    double b = Double.parseDouble(inputField2.getText());
                    if (b != 0) {
                        resultField.setText(String.valueOf(a / b));
                    } else {
                        resultField.setText("Cannot divide by zero");
                    }
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        getContentPane().add(titleLabel);
        getContentPane().add(inputLabel1);
        getContentPane().add(inputField1);
        getContentPane().add(inputLabel2);
        getContentPane().add(inputField2);
        getContentPane().add(addButton);
        getContentPane().add(subtractButton);
        getContentPane().add(multiplyButton);
        getContentPane().add(divideButton);
        getContentPane().add(resultLabel);
        getContentPane().add(resultField);
        getContentPane().add(copyrightLabel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Exercise_6();
    }
}
