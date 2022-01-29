package com.register;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.logindao;
@WebServlet("/login")
public class register extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String uname=request.getParameter("uname");
	 String password=request.getParameter("cpass");
	 logindao dao= new logindao();
	 
	 try {
		if (dao.insert(uname, password))
		 {
			 HttpSession session= request.getSession();
			 session.setAttribute("username",uname);
			 response.sendRedirect("welcome.jsp");
		 }
		 else
		 {
			 response.sendRedirect("customer.jsp");
		 }
	} catch (ClassNotFoundException | SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
}
