package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.CounterView;

public class CounterListener implements ActionListener{

	private CounterView CV;
	
	public CounterListener(CounterView CV) {
		this.CV = CV;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("You hava click button");
		
		//nơi đưa ra thông báo khi nhấn nút
		String src = e.getActionCommand();
		System.out.println("You hava click button: " + src);
		
		if(src.equals("UP 1 VALUE")) {
			this.CV.increment1();
		}
		if(src.equals("UP 10 VALUE")) {
			this.CV.increment10();
		}
		if(src.equals("UP 100 VALUE")) {
			this.CV.increment100();
		}
		if(src.equals("DOWN 1 VALUE")) {
			this.CV.decrement1();
		}
		if(src.equals("DOWN 10 VALUE")) {
			this.CV.decrement10();
		}
		if(src.equals("DOWN 100 VALUE")) {
			this.CV.decrement100();
		}
		if(src.equals("RESET VALUE")) {
			this.CV.reset();
		}
	}
	
}
