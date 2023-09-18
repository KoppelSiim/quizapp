package quizapp;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try {
            Connection connection = DatabaseConnection.getConnection();
            System.out.println("Database connection established successfully.");
            connection.close();
        } catch (SQLException e) {
            System.err.println("Database connection failed." + e.getMessage());
        }
    }
}