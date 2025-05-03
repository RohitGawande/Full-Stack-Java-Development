import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/rohitg";
        String username = "root";
        String password = "RohitG2014";

        try {
            // Establish the connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully!");

            // Close the connection (always a good practice)
            connection.close();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}