package in.rohit.main;

import java.sql.*;
import java.util.Scanner;

import in.rohit.util.JdbcUtil;

public class InsertApp {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultset = null;
       
           try {
        	  connection= JdbcUtil.getConnection();
        	  if (connection!=null) {
				statement=connection.createStatement();
			}if (statement!=null) {
				resultset=statement.executeQuery("select id, name, age, address from student");
           }if (resultset!=null) {
        	      System.out.println("SID\tSNAME\t\tSAGE\tSADD");
                  while (resultset.next()) {
                      System.out.printf("%d,%15s,%7d,%9s",resultset.getInt("id") , resultset.getString("name") , resultset.getInt("age"),resultset.getString("address"));
                 System.out.println();
                  }
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
				JdbcUtil.cleanUp(connection, statement, resultset);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				System.out.println("Closing the Resources");
			}

        
    }
    }
