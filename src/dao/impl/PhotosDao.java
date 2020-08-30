package dao.impl;

import dao.iPhotosDao;
import dao.impl.enums.PhotoColumns;
import jdbc.SingleConnectionManager;
import om.Photo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PhotosDao implements iPhotosDao {
    private Connection connection;
    private final static String TABLE_NAME = "photo";
    public PhotosDao() throws SQLException {
        connection = SingleConnectionManager.getConnection();
    }
    @Override
    public List<Photo> getPhotos() throws SQLException {
        Statement stmt = connection.createStatement();
        String query = "SELECT * FROM " + TABLE_NAME;
        ResultSet rs = stmt.executeQuery(query);
        List<Photo> photosList = new ArrayList<>();

        while (rs.next()){
            Photo photo = new Photo();
            photo.setId(rs.getInt(PhotoColumns.ID.getName()));
            photo.setLink(rs.getString(PhotoColumns.LINK.getName()));
            photo.setCoutViews(rs.getInt(PhotoColumns.VIEWS.getName()));
            photo.setDate(rs.getDate(PhotoColumns.DATE.getName()));
            photo.setLocation(rs.getString(PhotoColumns.LOCATION.getName()));
            photosList.add(photo);
        }
        return photosList;
    }

    @Override
    public void insertPhoto(Photo photo) {

    }
}
