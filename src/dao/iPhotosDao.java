package dao;

import om.Photo;

import java.sql.SQLException;
import java.util.List;

public interface iPhotosDao {
    public List<Photo> getPhotos() throws SQLException;
    public void insertPhoto(Photo photo);
}
