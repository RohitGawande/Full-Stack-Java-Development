package in.rohit.main;

import java.sql.*;
import java.util.Scanner;

import in.rohit.util.JdbcUtil;

public class InsertDyanamicInputApp {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement pstmt = null;
        Scanner sc=null;
 
       
           try {
        	  connection= JdbcUtil.getConnection();
        	  String sqlInsertQuery="insert into student(`name`,`age`,`address`) values (?,?,? )";
        	 if(connection!=null) {
        		 pstmt=connection.prepareStatement(sqlInsertQuery);
        	 }
        	 if (pstmt!=null) {
				//use precompiled query to set the values 
        		  sc=new Scanner(System.in);
        		 System.out.println("Enter the name:");
        		 String name=sc.nextLine();
        		 System.out.println("Enter the age:");
        		 int age=sc.nextInt();
        		 sc.nextLine();  // consume leftover newline
        		 System.out.println("Enter the address:");
        		 String address=sc.nextLine();// <-- consumes leftover newline
        		 
        		
        		 
        		 pstmt.setString(1, name);
        		 pstmt.setInt(2, age);
        		 pstmt.setString(3, address);
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
				sc.close();
				System.out.println("Closing the resources");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			}

        
    }
    }
