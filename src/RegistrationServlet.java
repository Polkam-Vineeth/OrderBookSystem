

import java.sql.*;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@SuppressWarnings("unused")
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	Connection conn=null;
	PreparedStatement st=null;
	ResultSet i;
	public void init(ServletConfig con) throws ServletException{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
			st=conn.prepareStatement("insert into usersignup values(?,?,?,?,?)");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
    public RegistrationServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String fname=request.getParameter("fname");
		String email=request.getParameter("email");
		String phno=request.getParameter("phno");
		
		try {
			st.setString(1,uname);
			st.setString(2,pass);
			st.setString(3,fname);
			st.setString(4,email);
			st.setString(5,phno);
			i=st.executeQuery();
			if(i.next()) {
				pw.println("Registration Successful !!");
				request.getRequestDispatcher("Login.html").include(request,response);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			pw.println("Registration Unsuccesful");
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}