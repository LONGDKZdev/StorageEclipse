package Project_8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Exercise_8 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Exercise_8 frame = new Exercise_8();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Exercise_8() {
        setTitle("Countdown Timer");
        setBounds(100, 100, 400, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTime = new JLabel("Enter seconds:");
        lblTime.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblTime.setBounds(30, 30, 100, 25);
        contentPane.add(lblTime);

        JTextField txtSeconds = new JTextField();
        txtSeconds.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        txtSeconds.setBounds(140, 30, 120, 25);
        contentPane.add(txtSeconds);

        JButton btnStart = new JButton("Start");
        btnStart.setBackground(new Color(128, 255, 128));
        btnStart.setFont(new Font("Times New Roman", Font.BOLD, 15));
        btnStart.setBounds(280, 30, 80, 25);
        contentPane.add(btnStart);

        JLabel lblCountdown = new JLabel("Time left:");
        lblCountdown.setFont(new Font("Times New Roman", Font.BOLD, 15));
        lblCountdown.setBounds(30, 80, 100, 25);
        contentPane.add(lblCountdown);

        JLabel lblTimeLeft = new JLabel("0");
        lblTimeLeft.setBounds(140, 80, 100, 25);
        lblTimeLeft.setFont(new Font("Times New Roman", Font.BOLD, 20));
        contentPane.add(lblTimeLeft);

        btnStart.addActionListener(new ActionListener() {
            Timer timer;
            int count;

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    count = Integer.parseInt(txtSeconds.getText());
                    if (timer != null && timer.isRunning()) {
                        timer.stop();
                    }
                    timer = new Timer(1000, evt -> {
                        if (count > 0) {
                            lblTimeLeft.setText(String.valueOf(count--));
                        } else {
                            ((Timer) evt.getSource()).stop();
                            lblTimeLeft.setText("Done!");
                        }
                    });
                    timer.start();
                } catch (NumberFormatException ex) {
                    lblTimeLeft.setText("Invalid input");
                }
            }
        });
    }
}
