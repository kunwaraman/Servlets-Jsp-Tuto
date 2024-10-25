package feedback_appmake.session.mannage;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class RequestServlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// we have to create cookie
		
	  // now fetch from servlet1
		// request main cookies wapis aa rhi hai then we say getcookies
	    
		 Cookie[] cookies = req.getCookies();
		 if(cookies!=null) {
			  for(Cookie c:cookies) {
				  String name=c.getName();
			  }
		 }
	    
	}

}
