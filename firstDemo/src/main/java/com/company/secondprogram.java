package com.company;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 
public class secondprogram extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.print("i am in doget() method for browser");
		
		System.out.println("i am in doget() method");
		
	} 
	
}
