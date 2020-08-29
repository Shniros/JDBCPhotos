package om;

import javax.swing.*;
import java.util.Date;

public class Photo {
    private int id;
    private String link;
    private String location;
    private int coutViews;
    private Date date;

    public int getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public String getLocation() {
        return location;
    }

    public int getCoutViews() {
        return coutViews;
    }

    public Date getDate() {
        return date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCoutViews(int coutViews) {
        this.coutViews = coutViews;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", link='" + link + '\'' +
                ", location='" + location + '\'' +
                ", coutViews=" + coutViews +
                ", date=" + date +
                '}';
    }

}
