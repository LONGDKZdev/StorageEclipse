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
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;
import javax.swing.JList;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;


public class MENU_Test extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	JMenuItem exercise1 = new JMenuItem("Exercise_1_Print String Value");
    JMenuItem exercise2 = new JMenuItem("Exercise_2_Button Direction");
    JMenuItem exercise3 = new JMenuItem("Exercise_3_Counter Button");
    JMenuItem exercise4 = new JMenuItem("Exercise_4_Other Function");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MENU_Test frame = new MENU_Test();
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
	public MENU_Test() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(MENU_Test.class.getResource("/Main/Menu icon .png")));
		setTitle("MENU INTERFACE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize( 480, 328);
		setLocationRelativeTo(null);
		setResizable(false);//tắt khả năng thay đổi kích thước cửa sổ
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(128, 255, 255));
		menuBar.setFont(new Font("SansSerif", Font.BOLD, 15));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("chose programing");
		menuBar.add(mnNewMenu);
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setFont(new Font("Sanskrit Text", Font.BOLD, 15));
		
		//thêm nút EX1
		JMenuItem EX1 = new JMenuItem("Exercise 1: Print String Value");
		mnNewMenu.add(EX1);
		
		//Thêm sự kiện EX1
		EX1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Tester.main(MENU_Test.this); 
		    }
		});
		
		JSeparator separator = new JSeparator();//dòng ngăn cách
		mnNewMenu.add(separator);
		
		JMenuItem EX2 = new JMenuItem("Exercise 2: Button Direction");
		mnNewMenu.add(EX2);
		
		EX2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Tester.main(MENU_Test.this); 
		    }
		});
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem EX3 = new JMenuItem("Exercise 3: Counter Button");
		mnNewMenu.add(EX3);
		
		EX3.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Test_1.main(null);
		    }
		});
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		JMenuItem EX4 = new JMenuItem("Exercise 4: Main Interface");
		mnNewMenu.add(EX4);
		
		EX4.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Main_Interface mainInterface = new Main_Interface();
		        mainInterface.setVisible(true);
		    }
		});
		
		JSeparator separator_4 = new JSeparator();
		mnNewMenu.add(separator_4);
		
		JMenuItem EX5 = new JMenuItem("Exercise 5: ??? BUTTON???");
		mnNewMenu.add(EX5);
		
		EX5.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Exercise_5 exercise5Frame = new Exercise_5();
		        exercise5Frame.setVisible(true);
		    }
		});
		
		JSeparator separator_5 = new JSeparator();
		mnNewMenu.add(separator_5);
		
		JMenuItem EX6 = new JMenuItem("Exercise 6: Simple Calculate");
		mnNewMenu.add(EX6);
		
		EX6.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Exercise_6 exercise6Frame = new Exercise_6();
		        exercise6Frame.setVisible(true);
		    }
		});
		
		JSeparator separator_6 = new JSeparator();
		mnNewMenu.add(separator_6);
		
		JMenuItem EX7 = new JMenuItem("Exercise 7: Temperature Converter");
		mnNewMenu.add(EX7);
		
		EX7.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Exercise_7 exercise7Frame = new Exercise_7();
		        exercise7Frame.setVisible(true); 
		    }
		});
		
		JSeparator separator_7 = new JSeparator();
		mnNewMenu.add(separator_7);
		
		JMenuItem EX8 = new JMenuItem("Exercise 8: Countdown Timer");
		mnNewMenu.add(EX8);
		
		EX8.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Exercise_8 exercise8Frame = new Exercise_8();
		        exercise8Frame.setVisible(true);
		    }
		});
		
		JSeparator separator_8 = new JSeparator();
		mnNewMenu.add(separator_8);
		
		JMenuItem EX9 = new JMenuItem("Exercise 9: BMI Calculator");
		mnNewMenu.add(EX9);
		
		EX9.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Exercise_9 exercise9Frame = new Exercise_9();
		        exercise9Frame.setVisible(true);
		    }
		});
		
		JSeparator separator_9 = new JSeparator();
		mnNewMenu.add(separator_9);
		
		JMenuItem EX10 = new JMenuItem("Exercise 10: Prime Checker");
		mnNewMenu.add(EX10);
		
		EX10.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	Exercise_10 exercise10Frame = new Exercise_10();
		        exercise10Frame.setVisible(true);
		    }
		});
		
		JSeparator separator_10 = new JSeparator();
		mnNewMenu.add(separator_10);
		
		/**
//		JMenuItem EX11 = new JMenuItem("Exercise 10: Prime Checker");
//		mnNewMenu.add(EX11);
//		
//		
//		
//		JSeparator separator_11 = new JSeparator();
//		mnNewMenu.add(separator_11);
//		
//		JMenuItem EX12 = new JMenuItem("Exercise 10: Prime Checker");
//		mnNewMenu.add(EX12);
//		
//		
//		
//		JSeparator separator_12 = new JSeparator();
//		mnNewMenu.add(separator_12);
//		
//		JMenuItem EX13 = new JMenuItem("Exercise 10: Prime Checker");
//		mnNewMenu.add(EX13);
//
//		JSeparator separator_13 = new JSeparator();
//		mnNewMenu.add(separator_13);
//		
//		JMenuItem EX14 = new JMenuItem("Exercise 10: Prime Checker");
//		mnNewMenu.add(EX14);
//		
//		JSeparator separator_14 = new JSeparator();
//		mnNewMenu.add(separator_14);
//		
//		JMenuItem EX15 = new JMenuItem("Exercise 10: Prime Checker");
//		mnNewMenu.add(EX15);
//		
//		JSeparator separator_15 = new JSeparator();
//		mnNewMenu.add(separator_15);
//		
//		JMenuItem EX16 = new JMenuItem("Exercise 10: Prime Checker");
//		mnNewMenu.add(EX16);
//		
//		JSeparator separator_16 = new JSeparator();
//		mnNewMenu.add(separator_16);
		
		*/
		
		////////////////////
		// thêm thanh cuộn//
		////////////////////
		/*
		
		JPanel menuPanel = new JPanel();
		menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));

		// Thêm tất cả các JMenuItem vào menuPanel
		menuPanel.add(EX1);
		menuPanel.add(new JSeparator());
		menuPanel.add(new JMenuItem("Exercise 2: Button Direction"));
		menuPanel.add(new JSeparator());
		menuPanel.add(new JMenuItem("Exercise 3: Counter Button"));
		menuPanel.add(new JSeparator());
		menuPanel.add(new JMenuItem("Exercise 4: Main Interface"));
		menuPanel.add(new JSeparator());
		menuPanel.add(new JMenuItem("Exercise 5: ??? BUTTON???"));
		menuPanel.add(new JSeparator());
		menuPanel.add(new JMenuItem("Exercise 6: Simple Calculate"));
		menuPanel.add(new JSeparator());
		menuPanel.add(new JMenuItem("Exercise 7: Temperature Converter"));
		menuPanel.add(new JSeparator());
		menuPanel.add(new JMenuItem("Exercise 8: Countdown Timer"));
		menuPanel.add(new JSeparator());
		menuPanel.add(new JMenuItem("Exercise 9: BMI Calculator"));
		menuPanel.add(new JSeparator());
		menuPanel.add(new JMenuItem("Exercise 10: Prime Checker"));

		// Thêm menuPanel vào JScrollPane
		JScrollPane scrollPane = new JScrollPane(menuPanel);
		scrollPane.setPreferredSize(new Dimension(200, 150)); // Điều chỉnh kích thước thanh cuộn

		// Thêm JScrollPane vào JMenu
		mnNewMenu.add(scrollPane);
		menuBar.add(mnNewMenu);
		
		*/
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setOrientation(SwingConstants.VERTICAL);
		menuBar.add(separator_1);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 255, 128));
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MENU");
		lblNewLabel.setForeground(new Color(128, 255, 255));
		lblNewLabel.setBackground(new Color(0, 128, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(241, 10, 215, 97);
		contentPane.add(lblNewLabel);
		
		JLabel lblPrograming = new JLabel("PROGRAMING");
		lblPrograming.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrograming.setForeground(new Color(128, 255, 255));
		lblPrograming.setFont(new Font("Times New Roman", Font.BOLD, 28));
		lblPrograming.setBackground(new Color(0, 128, 255));
		lblPrograming.setBounds(251, 41, 205, 92);
		contentPane.add(lblPrograming);
		
		JLabel BackGround = new JLabel("");
		BackGround.setIcon(new ImageIcon("D:\\Downloads\\2547629.jpg"));
		BackGround.setHorizontalAlignment(SwingConstants.CENTER);
		BackGround.setBounds(224, 41, 242, 66);
		contentPane.add(BackGround);
		
		
		
		
		JButton btnNewButton = new JButton("EXIT PROGRAMING ----->");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.exit(0);
			}
		});
		btnNewButton.setBounds(5, 213, 424, 43);
		contentPane.add(btnNewButton);
		
		// Các nút ấn 
		
		/**
		
		JButton bt1 = new JButton("Exercise 1");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tester.main(MENU_Test.this);// sơ đồ MVC
				
		        
			}
		});
		bt1.setBackground(new Color(0, 255, 128));
		bt1.setForeground(new Color(0, 0, 0));
		bt1.setFont(new Font("Times New Roman", bt1.getFont().getStyle() | Font.BOLD, 14));
		bt1.setBounds(210, 44, 106, 23);
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
		bt2.setBounds(210, 78, 106, 23);
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
		bt3.setBounds(210, 112, 106, 23);
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
		bt4.setBounds(210, 146, 106, 23);
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
		bt5.setBounds(210, 180, 106, 23);
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
		bt6.setBounds(326, 44, 106, 23);
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
		bt7.setBounds(326, 78, 106, 23);
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
		bt8.setBounds(326, 112, 106, 23);
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
		bt9.setBounds(326, 146, 106, 23);
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
		bt10.setBounds(326, 180, 106, 23);
		contentPane.add(bt10);
		
		*/

	}
}
