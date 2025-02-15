package FilmManager;

import javax.swing.*;
import java.awt.*;
import connection.DatabaseHelper;

public class Film_Blonde extends JPanel {
    private JTextArea filmInfo;

    public Film_Blonde() {
        setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("Blonde Information", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
        add(lblTitle, BorderLayout.NORTH);

        filmInfo = new JTextArea();
        filmInfo.setEditable(false);
        filmInfo.setFont(new Font("Monospaced", Font.PLAIN, 16));
        add(new JScrollPane(filmInfo), BorderLayout.CENTER);

        loadFilmData();
    }

    private void loadFilmData() {
        String movieInfo = DatabaseHelper.getMovieInformation("Blonde");
        filmInfo.setText(movieInfo);
    }
}
