package com.codecool;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        String dbName = "test_db"; //TODO
        String userName = "postgres"; //TODO
        String password = "Time is not real"; //TODO

        String URL = "jdbc:postgresql://localhost:5432/" + dbName;

        Database database = new Database(
                URL,
                userName,
                password);


        Connection databaseConnection = database.getConnection();
        PreparedStatement preparedStatement = databaseConnection.prepareStatement("SELECT * FROM dinos");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String dinoName = resultSet.getString("name");
            System.out.println(dinoName);
        }
    }
}