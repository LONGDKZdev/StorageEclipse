package cinema_Seller;

import java.awt.Component;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class CinemaMethods {

    public static void calculateTotal(JTextArea receiptArea, JTextField totalField,
                                      JCheckBox chkFilm_Elemental, JCheckBox chkFilm_Encanto, JCheckBox chkFilm_PussinBoots, 
                                      JCheckBox chkFilm_MarioBros, JCheckBox chkFilm_Marvel, JCheckBox chkFilm_JohnWick,
                                      JCheckBox chkFilm_Oppenheimer, JCheckBox chkFilm_Dune, JCheckBox chkFilm_Blonde,
                                      JSpinner spnFilm_Elemental, JSpinner spnFilm_Encanto, JSpinner spnFilm_PussinBoots, 
                                      JSpinner spnFilm_MarioBros, JSpinner spnFilm_Marvel, JSpinner spnFilm_JohnWick, 
                                      JSpinner spnFilm_Oppenheimer, JSpinner spnFilm_Dune, JSpinner spnFilm_Blonde,
                                      JCheckBox chkPopcorn, JSpinner spnPopcorn, JCheckBox chkDrink, JSpinner spnDrink) {

        CinemaLogic.calculateTotal(receiptArea, totalField, 
            chkFilm_Elemental, chkFilm_Encanto, chkFilm_PussinBoots, chkFilm_MarioBros, chkFilm_Marvel,
            chkFilm_JohnWick, chkFilm_Oppenheimer, chkFilm_Dune, chkFilm_Blonde,
            spnFilm_Elemental, spnFilm_Encanto, spnFilm_PussinBoots, spnFilm_MarioBros, spnFilm_Marvel,
            spnFilm_JohnWick, spnFilm_Oppenheimer, spnFilm_Dune, spnFilm_Blonde,
            chkPopcorn, spnPopcorn, chkDrink, spnDrink);
    }

    public static void resetFields(JTextArea receiptArea, JTextField totalField,
                                   JCheckBox chkFilm_Elemental, JCheckBox chkFilm_Encanto, JCheckBox chkFilm_PussinBoots, 
                                   JCheckBox chkFilm_MarioBros, JCheckBox chkFilm_Marvel, JCheckBox chkFilm_JohnWick,
                                   JCheckBox chkFilm_Oppenheimer, JCheckBox chkFilm_Dune, JCheckBox chkFilm_Blonde,
                                   JSpinner spnFilm_Elemental, JSpinner spnFilm_Encanto, JSpinner spnFilm_PussinBoots, 
                                   JSpinner spnFilm_MarioBros, JSpinner spnFilm_Marvel, JSpinner spnFilm_JohnWick, 
                                   JSpinner spnFilm_Oppenheimer, JSpinner spnFilm_Dune, JSpinner spnFilm_Blonde,
                                   JCheckBox chkPopcorn, JSpinner spnPopcorn, JCheckBox chkDrink, JSpinner spnDrink) {

        receiptArea.setText("⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️\n"
				           +"⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️CINEMA RECEIPT⭐️⭐️⭐️⭐️⭐️⭐️⭐\n"
				           +"⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐\n");
        totalField.setText("0 VND");

     // Deselect các checkbox
        chkFilm_Elemental.setSelected(false);
        chkFilm_Encanto.setSelected(false);
        chkFilm_PussinBoots.setSelected(false);
        chkFilm_MarioBros.setSelected(false);
        chkFilm_Marvel.setSelected(false);
        chkFilm_JohnWick.setSelected(false);
        chkFilm_Oppenheimer.setSelected(false);
        chkFilm_Dune.setSelected(false);
        chkFilm_Blonde.setSelected(false);
        //chkTicket.setSelected(false);
        chkPopcorn.setSelected(false);
        chkDrink.setSelected(false);

        // Đặt lại số lượng về 0
        spnFilm_Elemental.setValue(0);
        spnFilm_Encanto.setValue(0);
        spnFilm_PussinBoots.setValue(0);
        spnFilm_MarioBros.setValue(0);
        spnFilm_Marvel.setValue(0);
        spnFilm_JohnWick.setValue(0);
        spnFilm_Oppenheimer.setValue(0);
        spnFilm_Dune.setValue(0);
        spnFilm_Blonde.setValue(0);
        //spnTicket.setValue(0);
        spnPopcorn.setValue(0);
        spnDrink.setValue(0);
    }

    // Phương thức lưu hóa đơn
    public static void saveReceipt(JTextArea receiptArea, Component parentComponent) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Lưu hóa đơn");
        
        // Thiết lập các bộ lọc để chọn định dạng file (txt)
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Text Files", "txt"));

        int userSelection = fileChooser.showSaveDialog(parentComponent);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Lấy tên file và kiểm tra nếu không có phần mở rộng
            String filePath = fileChooser.getSelectedFile().getPath();
            if (!filePath.endsWith(".txt")) {
                filePath += ".txt"; // Thêm phần mở rộng nếu người dùng không nhập
            }

            try (FileWriter writer = new FileWriter(filePath)) {
                writer.write(receiptArea.getText());
                JOptionPane.showMessageDialog(parentComponent, "Invoice saved!", "Notification", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(parentComponent, "Error saving order!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}