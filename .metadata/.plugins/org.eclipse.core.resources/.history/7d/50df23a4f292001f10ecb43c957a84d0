package om.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("em");
		String passord = req.getParameter("ps");
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		
		RequestDispatcher rd;
		
		if("demo@gmail.com".equals(email) && "demo".equals(passord)) { // means send to the next servlet
			// home page redirect
			/*
			rd=req.getRequestDispatcher("/servlet2");
			rd.forward(req, resp);
			*/		
			// use send redirect
			resp.sendRedirect("servlet2");
		}else {
			// redirect login page
			// agar invalid hai
			out.print("<h4> Invalid email and password");
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
		}
	}
	

}
