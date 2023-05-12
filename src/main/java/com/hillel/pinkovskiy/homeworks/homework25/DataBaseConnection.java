package com.hillel.pinkovskiy.homeworks.homework25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/hillel_javapro";
    private static final String USER = "user";
    private static final String PASSWORD = "adam_06_12";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public void close(Connection connection) throws SQLException {
        connection.close();
    }
}
