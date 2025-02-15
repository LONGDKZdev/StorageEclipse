package FilmManager;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Panel_Chose_Film extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Panel_Chose_Film() {

		JPanel panel_Show_Information_film = new JPanel();
        panel_Show_Information_film.setForeground(new Color(255, 0, 0));
        panel_Show_Information_film.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "MOVIE INFORMATION ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 128, 255)), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 128, 255)));
        panel_Show_Information_film.setBounds(206, 0, 970, 183);
       
        panel_Show_Information_film.setLayout(null);
        
        JLabel lbl_Icon_Film = new JLabel("Image Film");
        lbl_Icon_Film.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Icon_Film.setBounds(10, 22, 185, 150);
        panel_Show_Information_film.add(lbl_Icon_Film);
        
        JTextArea txtrMovieidTitle = new JTextArea();
        txtrMovieidTitle.setFont(new Font("Monospaced", Font.PLAIN, 20));
        txtrMovieidTitle.setText("MovieID : \r\n    Title :\r\n    Genre :\r\n    Duration(minute) :\r\n    Rating :");
        txtrMovieidTitle.setRows(5);
        txtrMovieidTitle.setBounds(205, 22, 755, 150);
        panel_Show_Information_film.add(txtrMovieidTitle);
	}

}
