package in.rohit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.*;

public class JdbcUtil {
	private JdbcUtil() {
		
	}
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}
  public static Connection getConnection() throws SQLException {
	// Step 2: Establish the Connection
      String url = "jdbc:mysql:///Rohit";
      String user = "Rohit";
      String password = "Rohit2004";
      Connection connection = DriverManager.getConnection(url, user, password);
      System.out.println("Connection object created...");
      return connection;
  }
  public  static void cleanUp(Connection con,Statement statement, ResultSet resultset ) throws SQLException{
	  {
		  if (con!=null) {
			con.close();
		}if (statement!=null) {
			statement.close();
		}if (resultset!=null) {
			resultset.close();
		}
  }
	  
  }
}
