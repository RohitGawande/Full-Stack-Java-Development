package in.rohit.main;

import java.sql.*;

public class Test {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
        try {
            // Step 1: Load and register the driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded succesfully...");

            // Step 2: Establish the Connection
            String url = "jdbc:mysql:///Rohit";
            String user = "Rohit";
            String password = "Rohit2004";
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection object created...");

            // Step 3: Create statement Object and send the Query
            String sqlSelectQuery = "select id, name, age, address from student"; // include id also
            statement = connection.createStatement();
            System.out.println("Statement object created...");

            resultset = statement.executeQuery(sqlSelectQuery);

            // Step 4: Process the resultSet 
            System.out.println("SID\tSNAME\t\tSAGE\tSADD");
            while (resultset.next()) {
                int sid = resultset.getInt("id");         // column: id
                String sname = resultset.getString("name"); // column: name
                int sage = resultset.getInt("age");       // column: age
                String sadd = resultset.getString("address"); // column: address

                System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + sadd);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 5: Closing the resources 
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
