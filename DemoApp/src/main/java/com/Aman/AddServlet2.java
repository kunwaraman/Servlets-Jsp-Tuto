package com.Aman;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/add")

public class AddServlet2 extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		PrintWriter out = res.getWriter();
		out.println("<html><body bgcolor='cyan'>");
		out.println("output: " + k);
		out.println("</body><html>");
		
	}
	

}
