package cinema_Seller;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CinemaLogic {

    public static void calculateTotal(JTextArea receiptArea, JTextField totalField,
                                      JCheckBox chkFilm_Elemental, JCheckBox chkFilm_Encanto, JCheckBox chkFilm_PussinBoots, 
                                      JCheckBox chkFilm_MarioBros, JCheckBox chkFilm_Marvel, JCheckBox chkFilm_JohnWick,
                                      JCheckBox chkFilm_Oppenheimer, JCheckBox chkFilm_Dune, JCheckBox chkFilm_Blonde,
                                      JSpinner spnFilm_Elemental, JSpinner spnFilm_Encanto, JSpinner spnFilm_PussinBoots, 
                                      JSpinner spnFilm_MarioBros, JSpinner spnFilm_Marvel, JSpinner spnFilm_JohnWick, 
                                      JSpinner spnFilm_Oppenheimer, JSpinner spnFilm_Dune, JSpinner spnFilm_Blonde,
                                      JCheckBox chkPopcorn, JSpinner spnPopcorn, JCheckBox chkDrink, JSpinner spnDrink) {

        StringBuilder receipt = new StringBuilder();
        int totalPrice = 0;
        boolean hasSelectedItem = false;

        receipt.append("⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️\n"
				      +"⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️CINEMA RECEIPT⭐️⭐️⭐️⭐️⭐️⭐\n"
				      +"⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐️⭐\n");
        receipt.append("═══════════════════════════════════════════════════════\n");
        receipt.append("📅Date: ").append(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date())).append("\n");
        receipt.append("═══════════════════════════════════════════════════════\n");

        
        
        // Tính giá cho từng mục nếu được chọn
        if (chkFilm_Elemental.isSelected()) {
            int qty = (int) spnFilm_Elemental.getValue();
            if (qty > 0) {
                totalPrice += qty * 50000;
                receipt.append("Ticket Film Elemental x").append(qty).append(" = ").append(qty * 50000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkFilm_Encanto.isSelected()) {
            int qty = (int) spnFilm_Encanto.getValue();
            if (qty > 0) {
                totalPrice += qty * 45000;
                receipt.append("Ticket Film Encanto x").append(qty).append(" = ").append(qty * 45000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkFilm_PussinBoots.isSelected()) {
            int qty = (int) spnFilm_PussinBoots.getValue();
            if (qty > 0) {
                totalPrice += qty * 50000;
                receipt.append("Ticket Film Puss in Boots x").append(qty).append(" = ").append(qty * 50000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkFilm_MarioBros.isSelected()) {
            int qty = (int) spnFilm_MarioBros.getValue();
            if (qty > 0) {
                totalPrice += qty * 45000;
                receipt.append("Ticket Film Mario Bros x").append(qty).append(" = ").append(qty * 45000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkFilm_Marvel.isSelected()) {
            int qty = (int) spnFilm_Marvel.getValue();
            if (qty > 0) {
                totalPrice += qty * 50000;
                receipt.append("Ticket Film Marvel x").append(qty).append(" = ").append(qty * 50000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkFilm_JohnWick.isSelected()) {
            int qty = (int) spnFilm_JohnWick.getValue();
            if (qty > 0) {
                totalPrice += qty * 50000;
                receipt.append("Ticket Film John Wick x").append(qty).append(" = ").append(qty * 50000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkFilm_Oppenheimer.isSelected()) {
            int qty = (int) spnFilm_Oppenheimer.getValue();
            if (qty > 0) {
                totalPrice += qty * 55000;
                receipt.append("Ticket Film Oppenheimer x").append(qty).append(" = ").append(qty * 55000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkFilm_Dune.isSelected()) {
            int qty = (int) spnFilm_Dune.getValue();
            if (qty > 0) {
                totalPrice += qty * 60000;
                receipt.append("Ticket Film Dune x").append(qty).append(" = ").append(qty * 60000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkFilm_Blonde.isSelected()) {
            int qty = (int) spnFilm_Blonde.getValue();
            if (qty > 0) {
                totalPrice += qty * 45000;
                receipt.append("Ticket Film Blonde x").append(qty).append(" = ").append(qty * 45000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkPopcorn.isSelected()) {
            int qty = (int) spnPopcorn.getValue();
            if (qty > 0) {
                totalPrice += qty * 50000;
                receipt.append("Popcorn x").append(qty).append(" = ").append(qty * 50000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        if (chkDrink.isSelected()) {
            int qty = (int) spnDrink.getValue();
            if (qty > 0) {
                totalPrice += qty * 30000;
                receipt.append("Drink x").append(qty).append(" = ").append(qty * 30000).append(" VND\n");
                hasSelectedItem = true;
            }
        }

        
        if (!hasSelectedItem) {
            receipt.append("\nNo products selected!\n");
        }

        
        receipt.append("═══════════════════════════════════════════════════════\n");
        receipt.append("TOTAL: ").append(totalPrice).append(" VND\n");

        
        receiptArea.setText(receipt.toString());
        totalField.setText(totalPrice + " VND");
    }
}
