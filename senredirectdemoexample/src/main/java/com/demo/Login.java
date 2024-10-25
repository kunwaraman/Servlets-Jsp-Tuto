package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String myemail =req.getParameter("email1");
		String mypass =req.getParameter("pass1");
		PrintWriter out = res.getWriter();
		System.out.println(myemail);
		System.out.println(mypass);
		
		if(myemail.equals("aman@gmail.com") && mypass.equals("Aman@321")) {
			req.setAttribute("name_key", "Aman kunwar");
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, res);
		}
//		else {
//			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
//			rd.forward(req, res);
//			// request dispatcher does not  change url
//		}
	else {
		
		    res.setContentType("text/html");
			out.print("Email id and password didnt matched");
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, res);
			
		}
		 
		
	}
	

}
