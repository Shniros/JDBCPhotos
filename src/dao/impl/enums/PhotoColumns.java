package dao.impl.enums;

public enum PhotoColumns {
    ID("id", 0),
    LINK("link", 1),
    VIEWS("countViews", 2),
    DATE("dateLabel", 3),
    LOCATION("location", 4);
    private String name;
    private final int index;

    PhotoColumns(String columnName, int index) {
        this.name = columnName;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }
}
