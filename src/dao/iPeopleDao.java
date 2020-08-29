package dao;

import om.People;

import java.sql.SQLException;
import java.util.List;

public interface iPeopleDao {

    public List<People> getPeople() throws SQLException;
    public void insertPeople();
}
