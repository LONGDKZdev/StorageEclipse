package Chair_Controller_Room1___NotUse__;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Chair_7 extends JPanel {

    private static final long serialVersionUID = 1L;
    private boolean isBooked = false; 

    /**
     * Create the panel.
     */
    public Chair_7() {
        setLayout(null);
        
        
        JButton btnNewButton = new JButton("Booked");
        btnNewButton.setBounds(27, 72, 89, 23);
        btnNewButton.setBackground(Color.RED);
        btnNewButton.setOpaque(true);
        btnNewButton.setBorderPainted(false); 
        add(btnNewButton);
        
        JLabel JLCHAIR_1 = new JLabel("CHAIR_7");
        JLCHAIR_1.setHorizontalAlignment(SwingConstants.CENTER);
        JLCHAIR_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
        JLCHAIR_1.setBounds(10, 11, 130, 50);
        add(JLCHAIR_1);

        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (!isBooked) {
                    
                    btnNewButton.setBackground(Color.GREEN);
                    isBooked = true;
                } else {
                   
                    btnNewButton.setBackground(Color.RED);
                    isBooked = false;
                }
            }
        });
    }
}
