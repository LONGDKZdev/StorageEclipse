package cinema_Seller;

import java.awt.*;
import javax.swing.*;

public class Main_ManageSell extends JPanel {
    private static final long serialVersionUID = 1L;

    public Main_ManageSell() {
        setLayout(new BorderLayout());
        add(new Body_Cinema_SELL(), BorderLayout.CENTER);
    }
}
