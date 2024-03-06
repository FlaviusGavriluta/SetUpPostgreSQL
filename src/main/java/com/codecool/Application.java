package com.codecool;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException, IOException {
        String dbName = "test_db"; //TODO
        String userName = "postgres"; //TODO
        String password = "Time is not real"; //TODO

        String URL = "jdbc:postgresql://localhost:5432/" + dbName;

        Database database = new Database(
                URL,
                userName,
                password);


        Connection databaseConnection = database.getConnection();
        String sql = Files.readString(Paths.get("dinos-longer-10.sql"));
        PreparedStatement preparedStatement = databaseConnection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String dinoName = resultSet.getString("name");
            System.out.println(dinoName);

//            String dinoHeight = resultSet.getString("height");
//            System.out.println(dinoHeight);
//
//            String dinoLength = resultSet.getString("length");
//            System.out.println(dinoLength);
        }
    }
}