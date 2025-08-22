package in.rohit.main;

import java.sql.*;
import java.util.Scanner;
import in.rohit.util.JdbcUtil;

public class SelectApp {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;
        Scanner sc = null;

        try {
            connection = JdbcUtil.getConnection();
            String sqlSelectQuery = "SELECT id, name, age, address FROM student WHERE id=?";

            if (connection != null) {
                pstmt = connection.prepareStatement(sqlSelectQuery);
            }

            if (pstmt != null) {
                sc = new Scanner(System.in);
                System.out.print("Enter Id: ");
                int id = sc.nextInt();

                // set parameter
                pstmt.setInt(1, id);

                // execute query
                resultSet = pstmt.executeQuery();

                if (resultSet != null) {
                    if (resultSet.next()) {
                        System.out.println("ID\tNAME\tAGE\tADDRESS");
                        System.out.println(
                            resultSet.getInt(1) + "\t" +
                            resultSet.getString(2) + "\t" +
                            resultSet.getInt(3) + "\t" +
                            resultSet.getString(4)
                        );
                    } else {
                        System.out.println("No student found with ID: " + id);
                    }
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtil.cleanUp(connection, pstmt, resultSet);
                if (sc != null) sc.close();
                System.out.println("Closing the resources");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
