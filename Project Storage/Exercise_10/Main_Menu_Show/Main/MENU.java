package Main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Test.Tester;
import Package_Exercise_2.Exercise_2;
import Project_10.Exercise_10;
import Project_4.Main_Interface;
import Project_5.Exercise_5;
import Project_6.Exercise_6;
import Project_7.Exercise_7;
import Project_8.Exercise_8;
import Project_9.Exercise_9;
import Tester_1.Test_1;

import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MENU extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MENU frame = new MENU();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MENU() {
		setTitle("MENU INTERFACE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 128));
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(5, 5, 424, 30);
		contentPane.add(lblNewLabel);
		
		
		
		
		JButton btnNewButton = new JButton("EXIT PROGRAMING ----->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
			}
		});
		btnNewButton.setBounds(5, 213, 424, 43);
		contentPane.add(btnNewButton);
		
		JButton bt1 = new JButton("Exercise 1");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tester.main(MENU.this);
				
		        
			}
		});
		bt1.setBackground(new Color(0, 255, 128));
		bt1.setForeground(new Color(0, 0, 0));
		bt1.setFont(new Font("Times New Roman", bt1.getFont().getStyle() | Font.BOLD, 14));
		bt1.setBounds(15, 35, 106, 23);
		contentPane.add(bt1);
		
		JButton bt2 = new JButton("Exercise 2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise_2 exercise2Frame = new Exercise_2();
		        exercise2Frame.setVisible(true);
				
			}
		});
	
		bt2.setBackground(new Color(0, 255, 128));
		bt2.setForeground(new Color(0, 0, 0));
		bt2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt2.setBounds(15, 69, 106, 23);
		contentPane.add(bt2);
		
		JButton bt3 = new JButton("Exercise 3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Test_1.main(null);
				
			}
		});
		bt3.setBackground(new Color(0, 255, 128));
		bt3.setForeground(new Color(0, 0, 0));
		bt3.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt3.setBounds(15, 103, 106, 23);
		contentPane.add(bt3);
		
		JButton bt4 = new JButton("Exercise 4");
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main_Interface mainInterface = new Main_Interface();
		        mainInterface.setVisible(true);
			}
		});
		bt4.setBackground(new Color(0, 255, 128));
		bt4.setForeground(new Color(0, 0, 0));
		bt4.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt4.setBounds(15, 137, 106, 23);
		contentPane.add(bt4);
		
		JButton bt5 = new JButton("Exercise 5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise_5 exercise5Frame = new Exercise_5();
		        exercise5Frame.setVisible(true);
			}
		});
		bt5.setBackground(new Color(0, 255, 128));
		bt5.setForeground(new Color(0, 0, 0));
		bt5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt5.setBounds(15, 171, 106, 23);
		contentPane.add(bt5);
		
		JButton bt6 = new JButton("Exercise 6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise_6 exercise6Frame = new Exercise_6();
		        exercise6Frame.setVisible(true);
			}
		});
		bt6.setBackground(new Color(0, 255, 128));
		bt6.setForeground(new Color(0, 0, 0));
		bt6.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt6.setBounds(299, 35, 106, 23);
		contentPane.add(bt6);
		
		JButton bt7 = new JButton("Exercise 7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise_7 exercise7Frame = new Exercise_7();
		        exercise7Frame.setVisible(true);
			}
		});
		bt7.setBackground(new Color(0, 255, 128));
		bt7.setForeground(new Color(0, 0, 0));
		bt7.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt7.setBounds(299, 69, 106, 23);
		contentPane.add(bt7);
		
		JButton bt8 = new JButton("Exercise 8");
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise_8 exercise8Frame = new Exercise_8();
		        exercise8Frame.setVisible(true);
			}
		});
		bt8.setBackground(new Color(0, 255, 128));
		bt8.setForeground(new Color(0, 0, 0));
		bt8.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt8.setBounds(299, 103, 106, 23);
		contentPane.add(bt8);
		
		JButton bt9 = new JButton("Exercise 9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise_9 exercise9Frame = new Exercise_9();
		        exercise9Frame.setVisible(true);
			}
		});
		bt9.setBackground(new Color(0, 255, 128));
		bt9.setForeground(new Color(0, 0, 0));
		bt9.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt9.setBounds(299, 137, 106, 23);
		contentPane.add(bt9);
		
		JButton bt10 = new JButton("Exercise 10");
		bt10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exercise_10 exercise10Frame = new Exercise_10();
		        exercise10Frame.setVisible(true);
			}
		});
		bt10.setBackground(new Color(0, 255, 128));
		bt10.setForeground(new Color(0, 0, 0));
		bt10.setFont(new Font("Times New Roman", Font.BOLD, 14));
		bt10.setBounds(299, 171, 106, 23);
		contentPane.add(bt10);
		

	}
}
