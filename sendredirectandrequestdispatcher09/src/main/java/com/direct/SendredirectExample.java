package com.direct;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitForm")

public class SendredirectExample extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String mysearch = req.getParameter("search1");
		//res.sendRedirect("https://www.google.com");
		res.sendRedirect("https://www.google.com/search?q="+mysearch);
		
	}
	
 
}
