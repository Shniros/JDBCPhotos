import dao.iPhotosDao;
import dao.impl.PhotosDao;
import gui.PhotoBoard;
import om.People;
import om.Photo;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
    }
    public Main(){

        try {
            PhotoBoard photoBoard = new PhotoBoard();
            photoBoard.setPhotosDao(new PhotosDao());
            photoBoard.display();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
