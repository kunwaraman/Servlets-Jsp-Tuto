package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("nm");
		PrintWriter out = resp.getWriter();
		
		Cookie [] ck = req.getCookies();
		
		
		resp.setContentType("text/html");
		//out.println("Welcome to Servlet2 name " + name);
		// for cookies case it will be different
		out.print("<h1>Welcome to servlet2, name=" + ck[0].getValue() + "<h1>");
		
		/*
		 * is servlet se value dalnme pe ho ho raha hai par jaise hi
		 * servlet 2 par karna chah rhe hai value ko to nahi ho pa rha hai
		 * so http protcol is state lesss
		 * 
		 *ishe pata nahi chal raha hia kon sa value aa rhs shai kon sa ja rhs hai
		 *jsie face book pe ek baar login karne pa to hamara id pass le leta hai
		 *aur dobara se koi aata hai use pata nahi ki
		 *ewwahi user hai
		 *so thats why we use seeeison tracking concept
		 *
		 *cokies concept
		 */
		
		
		
	}
	
	

}
