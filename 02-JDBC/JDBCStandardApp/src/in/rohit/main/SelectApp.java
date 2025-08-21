package in.rohit.main;

import java.sql.*;

public class SelectApp {

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
            String sqlSelectQuery = "select id, name, age, address from student"; // include id also
            resultset = statement.executeQuery(sqlSelectQuery);

          
            System.out.println("SID\tSNAME\t\tSAGE\tSADD");
            while (resultset.next()) {
                int sid = resultset.getInt("id");         // column: id
                String sname = resultset.getString("name"); // column: name
                int sage = resultset.getInt("age");       // column: age
                String sadd = resultset.getString("address"); // column: address

                System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + sadd);
            }
          
        
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
