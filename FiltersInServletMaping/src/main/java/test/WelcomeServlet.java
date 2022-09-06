package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/login")

public class WelcomeServlet  extends HttpServlet{
	@Override
	   protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	   ServletException,IOException{
		 PrintWriter pw = res.getWriter();
		 res.setContentType("text/html");
		 String fName = (String)req.getAttribute("fname");
		 pw.println("Welcome user : "+fName);
	   }

}
