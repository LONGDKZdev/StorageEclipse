package swing;
import javax.swing.JButton;
import javax.swing.JFrame;
public class TestSwing3 extends JFrame {// kế thừa lớp JFrame
    public TestSwing3() {
    	setTitle("TestSwing3");

        JButton b = new JButton("click 3");// tạo button
        b.setBounds(130, 50, 100, 40);
        add(b);// thêm button vào JFrame
        setSize(400, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TestSwing3();
    }
}