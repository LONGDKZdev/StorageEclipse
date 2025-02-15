package Show_In_User;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String id;
    private String name;
    private String email;
    private List<TicketPurchase> ticketHistory;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.ticketHistory = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    public List<TicketPurchase> getTicketHistory() {
        return ticketHistory;
    }

    // Thêm giao dịch mua vé vào lịch sử
    public void addTicketPurchase(TicketPurchase purchase) {
        this.ticketHistory.add(purchase);
    }
}
