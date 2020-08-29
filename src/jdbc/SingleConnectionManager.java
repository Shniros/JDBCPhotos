package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by shniros on 8/25/20.
 */
public class SingleConnectionManager {

    private static final String DATABASE_SCHEMA_NAME = "photosdb";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/"
            +  DATABASE_SCHEMA_NAME
            + "?serverTimezone=UTC";

    private static String username = "root";
    private static String password = "s123qwe";

    private static Connection connection;

    public static Connection getConnection() throws SQLException {

        if (connection == null) {
            connection = DriverManager.getConnection(DB_URL, username, password);
        }

        return connection;
    }
}
