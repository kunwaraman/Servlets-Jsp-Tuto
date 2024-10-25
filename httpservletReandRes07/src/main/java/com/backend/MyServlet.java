package com.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa") 
public class MyServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String myname=request.getParameter("name1");
		 String  myemail = request.getParameter("mail");
		 
		System.out.println("name 1 : "+myname);
		System.out.println("Email2 : "+myemail);
		
		PrintWriter out = response.getWriter();
		out.print("Name : " +myname);
		out.print("Email : " + myemail);
		 
	}
	
  
}
