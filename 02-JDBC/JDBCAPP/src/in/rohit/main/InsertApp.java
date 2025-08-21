package in.rohit.main;

import java.sql.*;

public class InsertApp {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            

            // Step 2: Establish the Connection
            String url = "jdbc:mysql:///Rohit";
            String user = "Rohit";
            String password = "Rohit2004";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection object created...");

            // Step 3: Create statement Object and send the Query
        
            statement = connection.createStatement();
            System.out.println("Statement object created...");

            //Step 4: Execute the Query and Process the resultset 
            String sqlInsertQuery = "insert into  student (`name`,`age`,`address`) values ('Rohit',49,'MI')"; 
            int rowAffected = statement.executeUpdate(sqlInsertQuery);
            System.out.println("No of Rows affected is::"+rowAffected);
          
            
        
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 6: Closing the resources 
            try {
                if (resultset != null) resultset.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
