package ChairManager;

import javax.swing.*;
import java.awt.*;

public class ChairManagerTest {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Chair Manager Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLayout(new GridLayout(4, 5, 10, 10)); 

            
            for (int i = 1; i <= 20; i++) {
                ChairManager chair = new ChairManager("Chair " + i, "/Icon/Chair.png");
                frame.add(chair);
            }

            frame.setVisible(true);
        });
    }
}
