import javax.swing.*;
import java.awt.*;

import java.awt.Color;

public class Window1 extends JFrame {

	 //private JTextField input1, input2, resultField;
	 //private JButton addButton, subtractButton, multiplyButton, divideButton;


	public Window1() {
		// thiết lập giao diện
		setTitle("Window 1");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null); 
        //thiết lập tiêu đề 
        getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 12));

        
        JLabel titleLabel = new JLabel("Program First", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
        titleLabel.setForeground(Color.RED);
        titleLabel.setBounds(100, 10, 200, 30); 
        


        JLabel inputLabel1 = new JLabel("Input a");
        inputLabel1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        inputLabel1.setBounds(50, 60, 50, 20);
        JTextField inputField1 = new JTextField();
        inputField1.setBounds(120, 60, 200, 25);

        JLabel inputLabel2 = new JLabel("Input b");
        inputLabel2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        inputLabel2.setBounds(50, 100, 50, 20);
        JTextField inputField2 = new JTextField();
        inputField2.setBounds(120, 100, 200, 25);


        JButton addButton = new JButton("Addition");
        addButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        addButton.setBounds(50, 140, 80, 30);

        JButton subtractButton = new JButton("Subtrac");
        subtractButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        subtractButton.setBounds(140, 140, 80, 30);

        JButton multiplyButton = new JButton("Multip");
        multiplyButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        multiplyButton.setBounds(230, 140, 80, 30);

        JButton divideButton = new JButton("Division");
        divideButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        divideButton.setBounds(320, 140, 80, 30);


        JLabel resultLabel = new JLabel("Result");
        resultLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        resultLabel.setBounds(50, 180, 50, 20);
        JTextField resultField = new JTextField();
        resultField.setBounds(120, 180, 200, 25);
        resultField.setEditable(false);

        JLabel copyrightLabel = new JLabel("Copy right@ by Vo Huy Long at University VKU", SwingConstants.CENTER);
        copyrightLabel.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        copyrightLabel.setBounds(50, 220, 300, 20);

        
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

	

}
