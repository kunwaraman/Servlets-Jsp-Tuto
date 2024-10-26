package com.program;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/servlet1")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name=req.getParameter("nm");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<form action='servlet2'><input type='text' name='user' value='"+name+"'><br> <button type='submit'>Servlet2</button></form>");
		
	}

}
