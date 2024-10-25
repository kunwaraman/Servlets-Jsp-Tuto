package feedback_appmake;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// form ka data : get karna hoga
		String email =req.getParameter("email"); 
		String phone = req.getParameter("phone");
		String feedbackmessage = req.getParameter("feedback_message");
		
		// form data process
		
		/// database connectivity 
		
		// response dena hoga
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>feedback servlet working</h1>");
		
		writer.println("<h2>your form details that you submitted </h2> "
				+ "<h3>Email address %s</h3>"
				+"<h3>phone number is %s </h3>"
				+"<h3>feedback message %s </h3>"
				.formatted(email,phone,feedbackmessage));
		
		//resp.sendRedirect(feedbackmessage)
		
	
		
		
		
	}
	

}
