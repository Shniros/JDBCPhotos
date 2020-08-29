package om;

public class Label {
    private int id;
    private  int fkPeopleID;
    private int fkPhotoID;

    public void setId(int id) {
        this.id = id;
    }

    public void setFkPeopleID(int fkPeopleID) {
        this.fkPeopleID = fkPeopleID;
    }

    public void setFkPhotoID(int fkPhotoID) {
        this.fkPhotoID = fkPhotoID;
    }

    public int getId() {
        return id;
    }

    public int getFkPeopleID() {
        return fkPeopleID;
    }

    public int getFkPhotoID() {
        return fkPhotoID;
    }

}
