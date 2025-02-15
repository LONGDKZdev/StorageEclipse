package Show_In_User;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            UserManager userManager = new UserManager();
            JFrame frame = new JFrame("Quản lý thông tin người dùng");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 550);
            frame.setLocationRelativeTo(null);

            // Thêm UserManagerPanel vào JFrame
            UserManagerPanel userManagerPanel = new UserManagerPanel(userManager);
            frame.add(userManagerPanel);

            frame.setVisible(true);
        });
    }
}
