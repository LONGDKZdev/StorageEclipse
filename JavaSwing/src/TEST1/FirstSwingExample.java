package TEST1;

import javax.swing.JButton;
import javax.swing.JFrame;


public class FirstSwingExample {
	public static void main(String[] args) {
		//Có 2 cách viết tiêu đề
    	//C1 : Viết trực tiếp vào JFrame f = new JFrame("Programing 1");
    	//C2 : Gọi JFrame f = new JFrame(); rồi f.setTitle("Programing 1");
    	//C1
        JFrame f = new JFrame("Programing 1");// tạo thể hiện của JFrame
        JButton b = new JButton("click here");// tạo thể hiện của JButton
        b.setBounds(150, 50, 100, 50);// trục x , y , width, height
        //C2
        f.setTitle("Programing 1");
        f.add(b);// thêm button vào JFrame

        f.setSize(400, 200);// thiết lập kích thước cho của sổ
        f.setLayout(null);// không sử dụng trình quản lý bố cục
        f.setVisible(true);// hiển thị cửa sổ
	}
}
