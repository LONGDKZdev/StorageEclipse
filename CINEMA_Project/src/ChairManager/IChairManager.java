package ChairManager;

import ChairManager.*;
import FilmManager.*;
public interface IChairManager {
    void loadChairDataFromDatabase();
    void markChairAsBooked(String chairName, int userID, String username);
}
