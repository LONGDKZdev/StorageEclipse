package Show_In_User;

import java.util.Date;

public class TicketPurchase {
    private Date purchaseDate;
    private int quantity;

    public TicketPurchase(Date purchaseDate, int quantity) {
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Ngày mua: " + purchaseDate.toString() + ", Số lượng: " + quantity;
    }
}
