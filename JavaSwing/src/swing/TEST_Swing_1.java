package swing;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TEST_Swing_1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("Click here");
		JFormattedTextField ft = new JFormattedTextField();
		JTextField t = new JTextField("Enter value");
		JCheckBox cb = new JCheckBox();
		f.setTitle("Programing Test Swing 1");
		f.setSize(500,300);
//		ft.setBounds(100, 50, 50, 50);
//		f.add(ft);//    //
		cb.setBounds(30,50,70,140);
		cb.setText("1.Value");
		f.add(cb);
//		f.add(t);
//		t.setBounds(40,50,50,50);
//		b.setBounds(150, 60, 140, 100);
//		f.add(b);






		f.setLayout(null);
		f.setVisible(true);


	}

}
