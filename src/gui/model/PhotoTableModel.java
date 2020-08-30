package gui.model;

import dao.impl.PhotosDao;
import dao.impl.enums.PhotoColumns;
import om.Photo;

import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhotoTableModel extends AbstractTableModel {
    private PhotosDao photosDao;
    private List<Photo> data;
    public PhotoTableModel(){
        data = new ArrayList<>();
    }
    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return PhotoColumns.values().length;
    }
    public void refresh() throws SQLException {
        data = photosDao.getPhotos();
        fireTableDataChanged();
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Photo photo = data.get(rowIndex);
        if(columnIndex == PhotoColumns.ID.getIndex()){
            return photo.getId();
        }else if(columnIndex == PhotoColumns.LINK.getIndex()){
            return photo.getLink();
        }else if(columnIndex == PhotoColumns.VIEWS.getIndex()){
            return photo.getCoutViews();
        }else if(columnIndex == PhotoColumns.DATE.getIndex()){
            return photo.getDate();
        }else if(columnIndex == PhotoColumns.LOCATION.getIndex()){
            return photo.getLocation();
        }else{
            return null;
        }
    }
    public void setClientDao(PhotosDao photosDao) {
        this.photosDao = photosDao;
    }
}
