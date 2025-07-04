package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class UpdateApp {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    

    
         
            // Step 2: Establish Connection
            String url = "jdbc:mysql:///studentdb";
            String username = "Rohit";     // Replace with your username
            String password = "Rohit";     // Replace with your password

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("CONNECTION object created ");

            // Step 3: Create Statement Object
            Statement statement = connection.createStatement();
            System.out.println("STATEMENT object created ");
            // Step 4: Execute Query and Process ResultSet
            String sqlDeleteQuery = "delete from student where sid=2";
            int rowsAffected = statement.executeUpdate(sqlDeleteQuery);
            
         System.out.println("No. of rows affected::"+rowsAffected);
        
            // Step 6: Close resources
        	
        	statement.close();
        	connection.close();
        	System.out.println("Closing the resources...");
           
    }
}
