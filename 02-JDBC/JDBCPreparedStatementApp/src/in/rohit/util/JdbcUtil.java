package in.rohit.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
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
  public static Connection getConnection() throws SQLException, IOException {
	  FileInputStream fis=new FileInputStream("C:\\Users\\Asus\\Desktop\\Full Stack Java Development\\02-JDBC\\Demo\\application.properties");
	  Properties properties=new Properties();
	  properties.load(fis);
	// Step 2: Establish the Connection
      String url = "jdbc:mysql:///Rohit";
      String user = "Rohit";
      String password = "Rohit2004";
      Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("user"), properties.getProperty("password"));
      System.out.println("Connection object created...");
      System.out.println("Rohit");
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
