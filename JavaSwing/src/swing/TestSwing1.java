package swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestSwing1 {
	public static void main(String[] args) {
		JFrame f = new JFrame();// tạo thể hiện của JFrame
	    f.setTitle("TestSwing1");
	    f.setSize(800, 400);// thiết lập kích thước cho của sổ

	    JButton b = new JButton("click1");// tạo thể hiện của JButton
	    b.setBounds(130, 50, 100, 40);// trục x , y , width, height

	    f.add(b);// thêm button vào JFrame

	    f.setLayout(null);// không sử dụng trình quản lý bố cục
	    f.setVisible(true);// hiển thị cửa sổ
	}

}
