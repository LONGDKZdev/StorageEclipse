package FilmManager;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class Film_Titanic extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Film_Titanic() {
		JPanel Information_film_Titanic = new JPanel();
		Information_film_Titanic.setForeground(new Color(255, 0, 0));
		Information_film_Titanic.setBorder(new TitledBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "MOVIE INFORMATION ", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 128, 255)), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 128, 255)));
		Information_film_Titanic.setBounds(206, 0, 970, 183);
       
		Information_film_Titanic.setLayout(null);
        
        JLabel lbl_Icon_Film = new JLabel("Image Film");
        lbl_Icon_Film.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Icon_Film.setBounds(10, 22, 185, 150);
        Information_film_Titanic.add(lbl_Icon_Film);
        
        JTextArea txtrMovieidTitle = new JTextArea();
        txtrMovieidTitle.setFont(new Font("Monospaced", Font.PLAIN, 20));
        txtrMovieidTitle.setText("MovieID : 1 \r\n    Title : Titanic \r\n    Genre : disaster – romantic – epic – drama \r\n    Duration(minute) :195 \r\n    Rating :PG-13");
        txtrMovieidTitle.setRows(5);
        txtrMovieidTitle.setBounds(205, 22, 755, 150);
        Information_film_Titanic.add(txtrMovieidTitle);
	}

}
