package in.rohit.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesApp {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\Asus\\Desktop\\Full Stack Java Development\\02-JDBC\\PropertiesApp\\application.properties");
		Properties properties=new Properties();
		properties.load(fis);
		String url=properties.getProperty("url");
		String user=properties.getProperty("user");
		String password=properties.getProperty("password");
		System.out.println("URL IS::"+url);
		System.out.println("USER IS::"+user);
		System.out.println("PWD IS::"+password);
		
		
		
	}

}
