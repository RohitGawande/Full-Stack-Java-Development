package in.rohit.main;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

import in.rohit.util.JdbcUtil;

public class CsStoredProcedureMySQL {

    // Correct procedure call with CALL keyword and correct name
    private static final String storedProcedureCall = "{CALL P_GET_PRODUCT_DETAILS_BY_ID(?,?,?,?)}";

    public static void main(String[] args) {

        Connection connection = null;
        CallableStatement cstmt = null;
        Scanner scanner = null;
        Integer id = null;

        try {
            connection = JdbcUtil.getConnection();
            if (connection != null)
                cstmt = connection.prepareCall(storedProcedureCall);

            scanner = new Scanner(System.in);
            if (scanner != null) {
                System.out.print("Enter the product id :: ");
                id = scanner.nextInt();
            }

            // Setting input value
            if (cstmt != null) {
                cstmt.setInt(1, id);
            }

            // Register output parameters
            if (cstmt != null) {
                cstmt.registerOutParameter(2, Types.VARCHAR);
                cstmt.registerOutParameter(3, Types.INTEGER);
                cstmt.registerOutParameter(4, Types.INTEGER);
            }

            // Execute procedure
            if (cstmt != null) {
                cstmt.execute();
            }

            // Retrieve results
            if (cstmt != null) {
                System.out.println("Product Name is :: " + cstmt.getString(2));
                System.out.println("Product Cost is :: " + cstmt.getInt(3));
                System.out.println("Product QTY  is :: " + cstmt.getInt(4));
            }

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtil.cleanUp(connection, cstmt, null);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (scanner != null)
                scanner.close();
        }
    }
}
