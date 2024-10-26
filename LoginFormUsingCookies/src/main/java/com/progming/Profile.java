package com.progming;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/profile")
public class Profile extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie [] ck = req.getCookies();
		
		if(ck==null) { // user access kar rha hai without user and passwor dse 
			// this case ushko redirect kar denge index .html page par
			resp.sendRedirect("index.html");
			
		}else {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			out.println("<h1>Email="+ck[0].getValue()+ "</h1>");
			out.println("<h1>Password=" + ck[1].getValue() + "</h1>");
			out.println("<a href='logout'>Logout</a>"); // by default anchor are do get 
			// so we call do get on logout servlet
;		} 
	
	}
	

}
