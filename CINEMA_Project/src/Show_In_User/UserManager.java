package Show_In_User;

import java.util.ArrayList;

public class UserManager {
    private ArrayList<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void updateUser(int index, User updatedUser) {
        if (index >= 0 && index < users.size()) {
            users.set(index, updatedUser);
        }
    }

    public void deleteUser(int index) {
        if (index >= 0 && index < users.size()) {
            users.remove(index);
        }
    }

    public void reset() {
        users.clear();
    }

    // Phương thức tìm người dùng theo ID
    public User getUserById(String id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
