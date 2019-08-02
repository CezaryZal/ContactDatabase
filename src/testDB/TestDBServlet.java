package testDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/*")
public class TestDBServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // get connection to database

        final String JDB_URL = "jdbc:mysql://localhost:3306/web_contacts?useSSL=false&serverTimezone=UTC";
        final String USENAME = "hbstudent";
        final String PASSWORD = "HBstudent!123";


        PrintWriter out = response.getWriter();

        out.println("Connecting to database: " + JDB_URL);


        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(JDB_URL, USENAME, PASSWORD);

            out.println("Test connect");

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM contact");
            while (resultSet.next()){
                out.println(resultSet.getString("first_name"));
            }

            connection.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
            out.println("SUCCESS!!!");
    }
}
