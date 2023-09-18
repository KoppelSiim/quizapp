package quizapp;

import quizapp.database.DatabaseConnection;
import quizapp.database.MyBatisScriptUtility;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection = DatabaseConnection.getConnection();
            System.out.println("Database connection established successfully.");
            String path = "src/main/resources/quizapp_schema.sql";
            MyBatisScriptUtility.runScript(path, connection);
            connection.close();
        } catch (SQLException e) {
            System.err.println("Database connection failed." + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}