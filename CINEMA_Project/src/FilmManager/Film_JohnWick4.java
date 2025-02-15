package FilmManager;

import javax.swing.*;
import java.awt.*;
import connection.DatabaseHelper;

public class Film_JohnWick4 extends JPanel {
    private JTextArea filmInfo;

    public Film_JohnWick4() {
        setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("John Wick 4 Information", SwingConstants.CENTER);
        lblTitle.setFont(new Font("Times New Roman", Font.BOLD, 24));
        add(lblTitle, BorderLayout.NORTH);

        filmInfo = new JTextArea();
        filmInfo.setEditable(false);
        filmInfo.setFont(new Font("Monospaced", Font.PLAIN, 16));
        add(new JScrollPane(filmInfo), BorderLayout.CENTER);

        loadFilmData();
    }

    private void loadFilmData() {
        String movieInfo = DatabaseHelper.getMovieInformation("John Wick: Chapter 4");
        filmInfo.setText(movieInfo);
    }
}
