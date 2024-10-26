package com.progming;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email = req.getParameter("em");
		String password = req.getParameter("ps");
		
		Cookie ck = new Cookie("em",email);
		Cookie ck1 = new Cookie("ps",password);
		
		resp.addCookie(ck);
		resp.addCookie(ck1);
		
		resp.sendRedirect("profile");
		
		
	}

}
