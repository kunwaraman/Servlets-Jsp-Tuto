package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req ,HttpServletResponse resp) throws ServletException, IOException{
		
		PrintWriter out = resp.getWriter();
		out.print("i am in doGet() method for browser");
		System.out.println("i am in doGet() method");
	}
	 

	
	
	
	

}
