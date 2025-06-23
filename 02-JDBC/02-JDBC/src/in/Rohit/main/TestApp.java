package JDBC1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class TestApp {

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
            String sqlQuery = "SELECT sid, sname, sage, sadd FROM student";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            System.out.println("RESULTSET object created ");
            System.out.println("\nSID\tSNAME    \tSAGE\tSADD");
            System.out.println("-----------------------------------");

            while (resultSet.next()) {
                int sid = resultSet.getInt(1);
                String sname = resultSet.getString(2);
                int sage = resultSet.getInt(3);
                String sadd = resultSet.getString(4);
                System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + sadd);
            }

        
            // Step 6: Close resources
        	resultSet.close();
        	statement.close();
        	connection.close();
           
    }
}
