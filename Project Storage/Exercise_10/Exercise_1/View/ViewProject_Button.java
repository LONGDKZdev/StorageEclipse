package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import Controller.ControllerProject_Button;
import Main.MENU;
import Model.ModelProject_Button;
public class ViewProject_Button extends JFrame{

	private static final Color Yellow = null;
	private JTextField valueA_IN;
    private JTextField valueB_IN;
    private JTextField valueC_IN;
    private JTextField printStringOut;
    private ModelProject_Button model;

    public ViewProject_Button() {
        this.model = new ModelProject_Button();
        init();
    }

    private void init() {
        this.setTitle("Project 1:Print Button");
        this.setLocationRelativeTo(null);
//        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setResizable(true);

        Font font = new Font("Time New Roman", Font.BOLD, 16);

        JLabel labelA = new JLabel("Value A:");
        JLabel labelB = new JLabel("Value B:");
        JLabel labelC = new JLabel("Value C:");
        //thiết lập kiểu chữ cho label
        labelA.setFont(font);
        labelB.setFont(font);
        labelC.setFont(font);

        valueA_IN = new JTextField(20);
        valueB_IN = new JTextField(20);
        valueC_IN = new JTextField(20);
        //thiết lập kiểu chữ cho textfield
        valueA_IN.setFont(font);
        valueB_IN.setFont(font);
        valueC_IN.setFont(font);

        JButton printButton = new JButton("Print out");
        printButton.setFont(font);
        printButton.setForeground(Yellow);

        printStringOut = new JTextField(20);
        printStringOut.setFont(font);
        printStringOut.setEditable(false);//tắt khả năng thay đổi kích thước giao diện 

        
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10));
        //3 dòng 2 cột và khoảng cách các thành phần theo chiều dài và rộng
        inputPanel.add(labelA);
        inputPanel.add(valueA_IN);
        inputPanel.add(labelB);
        inputPanel.add(valueB_IN);
        inputPanel.add(labelC);
        inputPanel.add(valueC_IN);

        JPanel outputPanel = new JPanel(new BorderLayout(10, 10));
        outputPanel.add(printButton, BorderLayout.WEST);
        outputPanel.add(printStringOut, BorderLayout.CENTER);

        this.setLayout(new BorderLayout(10, 10));
        this.add(inputPanel, BorderLayout.CENTER);
        this.add(outputPanel, BorderLayout.SOUTH);

        ControllerProject_Button controller = new ControllerProject_Button(this);
        printButton.addActionListener(controller);

        this.setVisible(true);//hiển thị bảng 
    }

    public void print() {
        try {
            double a = Double.parseDouble(valueA_IN.getText());
            double b = Double.parseDouble(valueB_IN.getText());
            double c = Double.parseDouble(valueC_IN.getText());
            model.setValueA(a);
            model.setValueB(b);
            model.setValueC(c);
            printStringOut.setText(model.getInformationOut());
            model.printValuesToConsole();
        } catch (NumberFormatException ex) {
            printStringOut.setText("Invalid input. Please enter numeric values or enter full number");
        }
    }
	
}
