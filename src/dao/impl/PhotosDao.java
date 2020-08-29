package dao.impl;

import dao.iPhotosDao;
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
            photo.setId(rs.getInt("id"));
            photo.setLink(rs.getString("link"));
            photo.setCoutViews(rs.getInt("countViews"));
            photo.setDate(rs.getDate("dateLabel"));
            photo.setLocation(rs.getString("location"));
            photosList.add(photo);
        }
        return photosList;
    }

    @Override
    public void insertPhoto(Photo photo) {

    }
}
