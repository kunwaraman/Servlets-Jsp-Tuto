package com.Aman;

import java.io.IOException;

import java.io.PrintWriter;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
//@WebServlet("/add")

public class AddServelets extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		// https session cookie
//		HttpSession session = req.getSession();
//		session.setAttribute("k",k);
//		res.sendRedirect("sq");
//		
		
		// cookie
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		res.sendRedirect("sq");
		
//		k = k*k;
		
		// session managment
		//req.setAttribute("k", k);
		
		// Request dispatcher
		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
		// send redirect and url rewriting
		
		//res.sendRedirect("sq?k="+k); // techniques comes under session managment
		
		
		
		 
	}
	

}
 