package View_Staff;

public class StaffController {
    private StaffPanel view;

    public StaffController(StaffPanel view) {
        this.view = view;
    }

    public void addStaff(Staff staff) {
        if (StaffDAO.addStaff(staff)) {
            view.loadStaffData();
        }
    }

    public void updateStaff(Staff staff) {
        if (StaffDAO.updateStaff(staff)) {
            view.loadStaffData();
        }
    }

    public void deleteStaff(String staffID) {
        if (StaffDAO.deleteStaff(staffID)) {
            view.loadStaffData();
        }
    }
}
