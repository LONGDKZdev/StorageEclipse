package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.ViewProject_Button;

public class ControllerProject_Button implements ActionListener{
	private ViewProject_Button View;
	
	public ControllerProject_Button(ViewProject_Button View) {
		this.View = View;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//nơi đưa ra thông báo khi nhấn nút
				String Comment = e.getActionCommand();
				System.out.println("You clicked the button: " + Comment);
				
				if (Comment.equals("Print out")) {
		            if (View != null) {
		                View.print();
		            } else {
		                System.err.println("Error: View is not initialized.");
		            }
		        }
	}

}
