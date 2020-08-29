package dao.impl;

import dao.iPeopleDao;
import jdbc.SingleConnectionManager;
import om.People;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PeopleDao implements iPeopleDao {
    private Connection connection;
    private final static String TABLE_NAME = "people";

    public PeopleDao() throws SQLException {
        connection = SingleConnectionManager.getConnection();
    }
    @Override
    public List<People> getPeople() throws SQLException {
        List<People> peopleList = new ArrayList<>();
        Statement stmt = connection.createStatement();
        String query = "SELECT * FROM "+TABLE_NAME;
        ResultSet rs = stmt.executeQuery(query);
        while(rs.next()){

        }

        return null;
    }

    @Override
    public void insertPeople() {

    }
}
