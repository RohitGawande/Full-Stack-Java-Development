package in.rohit.main;

import java.sql.*;
import java.util.Scanner;
import in.rohit.util.JdbcUtil;

public class DeleteApp {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement pstmt = null;
        int rowCount;
        Scanner sc = null;

        try {
            connection = JdbcUtil.getConnection();
            String sqlUpdateQuery = "delete from  student WHERE id=?";

            if (connection != null) {
                pstmt = connection.prepareStatement(sqlUpdateQuery);
            }

            if (pstmt != null) {
                sc = new Scanner(System.in);
                System.out.print("Enter Id: ");
                int id = sc.nextInt();
                sc.nextLine(); // consume leftover newline


                // set parameters
               
                pstmt.setInt(1, id);

                // execute update
                rowCount = pstmt.executeUpdate();

                if (rowCount > 0) {
                    System.out.println("Record updated successfully. Rows affected: " + rowCount);
                } else {
                    System.out.println("No student found with ID: " + id);
                }
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtil.cleanUp(connection, pstmt, null);
                if (sc != null) sc.close();
                System.out.println("Closing the resources");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
