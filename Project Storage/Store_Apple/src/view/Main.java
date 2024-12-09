package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Sidebar sidebar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
	    setTitle("Appel Store");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 450, 300);
	    setLayout(null);

	    // Nhúng Sidebar vào giao diện chính
	    Sidebar sidebar = new Sidebar();
	    sidebar.setBounds(10, 10, 220, 500); // Kích thước Sidebar
	    add(sidebar);
	}


	
	public class Sidebar extends JPanel {
		private static final long serialVersionUID = 1L;

		public Sidebar() {
	        // Cấu hình Sidebar
	        setLayout(null); // Hoặc bất kỳ layout nào bạn muốn
	    }
	}
}
