package com.program;

import java.io.IOException;

import javax.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class Servlet1 extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int fn = Integer.parseInt(req.getParameter("fn")); // our first no is interger so we type casting this
		int sn = Integer.parseInt(req.getParameter("sn"));
		
		int sum = fn+sn; 
		req.setAttribute("su", sum);
		
//		RequestDispatcher rd = req.getRequestDispatcher("/servlet2");
//		rd.forward(req, resp);

		
	}

}
