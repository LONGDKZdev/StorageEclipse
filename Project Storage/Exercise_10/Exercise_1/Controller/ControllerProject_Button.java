package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import View.ViewProject_Button;

public class ControllerProject_Button implements ActionListener{

	private ViewProject_Button view;
	
	public ControllerProject_Button(ViewProject_Button view) {
        this.view = view;
    }
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
        if ("Print out".equals(command) && view != null) {
        	System.out.println("Your clicked button: Print out");
            view.print();
        }
	}

}
