package feedback_appmake.session.mannage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet1")
public class RequestServlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username="Aman";
		String userId = "12345";
		
		Cookie cookie = new Cookie("username",username);
		
	    cookie.setMaxAge(10*60);  // set the life span of cookie  kitni der tak rah sakta hai kab destroy ho sakta hai
		resp.addCookie(cookie);
	}
	

}
