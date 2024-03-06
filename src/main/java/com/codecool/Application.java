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
        String dbName = "test_db";
        String userName = "postgres";
        String password = "1234";

        String URL = "jdbc:postgresql://localhost:5432/" + dbName;
        String sqlFilePath = "dinos-longer-10.sql";

        try {
            Database connector = new Database(URL, userName, password);
            Connection connection = connector.connect();
            QueryExecutor executor = new QueryExecutor(connection);
            executor.executeQuery(sqlFilePath);
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}