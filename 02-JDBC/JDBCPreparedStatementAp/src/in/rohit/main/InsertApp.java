package in.rohit.main;

import java.sql.*;
import java.util.Scanner;

import in.rohit.util.JdbcUtil;

public class InsertApp {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement pstmt = null;
 a
       
           try {
        	  connection= JdbcUtil.getConnection();
        	  String sqlInsertQuery="insert into student(`name`,`age`,`address`) values (?,?,? )";
        	 if(connection!=null) {
        		 pstmt=connection.prepareStatement(sqlInsertQuery);
        	 }
        	 if (pstmt!=null) {
				//use precompiled query to set the values 
        		 pstmt.setString(1, "Shikhar");
        		 pstmt.setInt(2, 33);
        		 pstmt.setString(3, "Delhi");
        		 System.out.println(sqlInsertQuery);
        		 //exectue the query 
        		  int rowCount=pstmt.executeUpdate();
        		  System.out.println("No of rows updated is::"+rowCount);
        		  
			}
           }
           catch (SQLException se)
           {
        	   se.printStackTrace();
        	   
        	}catch(Exception e) {
        		e.printStackTrace();
        	}
           finally {
        	   try {
				JdbcUtil.cleanUp(connection, pstmt, null);
				System.out.println("Closing the resources");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				System.out.println("Closing the Resources");
			}

        
    }
    }
