package in.rohit.main;

import java.sql.*;

import in.rohit.util.JdbcUtil;

public class DeleteApp {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
        	 // Step 2: Establish the Connection
        	if (connection!=null) {
				connection=JdbcUtil.getConnection();
			}
           
            

            // Step 3: Create statement Object and send the Query
        
            statement = connection.createStatement();
            System.out.println("Statement object created...");

            //Step 4: Execute the Query and Process the resultset 
            String sqlDeleteQuery = "delete  from student where id=2"; 
            int rowAffected = statement.executeUpdate(sqlDeleteQuery);
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
