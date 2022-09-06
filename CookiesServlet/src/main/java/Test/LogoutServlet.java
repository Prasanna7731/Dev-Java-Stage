package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")

public class LogoutServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res)
			   throws ServletException,IOException{
				   PrintWriter pw = res.getWriter();
				   res.setContentType("text/html");
				   HttpSession hs = req.getSession(false);
				   if(hs==null) {
					   pw.println("Session Expired...<br>");
				   }else {
					   hs.invalidate();//Session object is destroyed
					   pw.println("Admin Loggedout Successfully..<br>");
				   }
				   RequestDispatcher rd = 
						   req.getRequestDispatcher("login.html");
				   rd.include(req, res);
	}
}
