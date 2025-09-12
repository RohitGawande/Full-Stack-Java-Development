
package in.rohit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/TestServlet" }, 
		initParams = { 
				@WebInitParam(name = "url", value = "jdbc:mysql:///rohit"),
				@WebInitParam(name = "user", value = "Rohit"),
				@WebInitParam(name = "password", value = "Rohit2004") 
			}, 
		loadOnStartup = 10)

public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection = null;
	private PreparedStatement pstmt = null;

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded succesfully...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void init() throws ServletException {
		String jdbcUrl = getInitParameter("url");
		String user = getInitParameter("user");
		String password = getInitParameter("password");

		try {
			connection = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("Connection established succesfully...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
//	@Override
//	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	    response.sendRedirect("reg.html");
//	}


	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    String username = request.getParameter("username");
	    String userage = request.getParameter("userage");
	    String useraddress = request.getParameter("useraddr");

	    String sqlInsertQuery = "INSERT INTO student(name, age, address) VALUES(?, ?, ?)";
	    try {
	        if (connection != null) {
	            pstmt = connection.prepareStatement(sqlInsertQuery);
	            pstmt.setString(1, username);
	            pstmt.setInt(2, Integer.parseInt(userage));
	            pstmt.setString(3, useraddress);

	            int rowAffected = pstmt.executeUpdate();
	            
	            out.println("<!DOCTYPE html>");
	            out.println("<html><head><title>Registration</title></head><body>");

	            if (rowAffected == 1) {
	                out.println("<h1 style='color:green;text-align:center;'>REGISTRATION SUCCESSFUL</h1>");
	            } else {
	                out.println("<h1 style='color:red;text-align:center;'>REGISTRATION FAILED</h1>");
	                out.println("<a href='reg.html'>Try Again</a>");
	            }

	            out.println("</body></html>");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        out.println("<h2 style='color:red;'>Error: " + e.getMessage() + "</h2>");
	    } finally {
	        out.flush();
	        out.close();
	    }
	}


	@Override
	public void destroy() {
		try {
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
