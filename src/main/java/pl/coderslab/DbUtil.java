package pl.coderslab;

import java.sql.*;

public class DbUtil {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "coderslab";

    private static final String DELETE_QUERY = "DELETE FROM tableName where id = ?";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
    }
}
