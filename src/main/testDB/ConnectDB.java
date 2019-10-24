package testDB;

import java.sql.*;

public class ConnectDB {
    public static void main (String [] args){

        final String JDB_URL = "jdbc:mysql://localhost:3306/web_contacts?useSSL=false&serverTimezone=UTC";
        final String USENAME = "hbstudent";
        final String PASSWORD = "HBstudent!123";

        try (Connection connection = DriverManager.getConnection(JDB_URL, USENAME, PASSWORD)){

            System.out.println("Test connect");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contact");

            while (resultSet.next()){
                System.out.println(resultSet.getString("first_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
