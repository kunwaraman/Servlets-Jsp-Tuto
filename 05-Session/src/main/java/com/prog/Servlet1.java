package com.prog;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("nm");
		PrintWriter out = resp.getWriter();
		
		/*
		 * value get karke aa rha hai jab value get ho jaye then hm ushko cookies ke andar store kar sakte hai
		 * 
		 */
		Cookie ck = new Cookie("nm",name);
		resp.addCookie(ck);
		// now servlet 2 main gaar jaunga to value waha se get kar sakta hu
		
		resp.setContentType("text/html");
		out.println("Welcome to Servlet name " + name);
		
		out.println("<a href='servlet2'>Servlet2 </a>");
		
		
	}
	

}
