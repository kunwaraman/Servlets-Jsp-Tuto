package com.sunday;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mylogin")
public class LoginPage extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myemail=(String) request.getParameter("name1");
		String mypass = (String)request.getParameter("pass1");
		if(myemail.equals("amankunwar@.com") && mypass.equals("aman@123")) {
			System.out.println("sucess");
		}else {
			System.out.println("failed");
		}
		
	}
	

}
