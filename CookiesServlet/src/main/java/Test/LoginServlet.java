package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/login")

public class LoginServlet  extends HttpServlet{
	 protected void doPost(HttpServletRequest req,
		    	HttpServletResponse res)throws ServletException,IOException
	  {
	    	PrintWriter pw = res.getWriter();
	    	res.setContentType("text/html");
	    	String fName = new LoginDAO().login(req);
	    	if(fName==null) {
	    		pw.println("Invalid Login process...<br>");
	    		RequestDispatcher rd = 
	    				 req.getRequestDispatcher("login.html");
	    		rd.include(req, res);
	    	}else {
	    		HttpSession hs = req.getSession();
                //Creating new Session
              hs.setAttribute("fname",fName);
                   //Adding attribute to Session Object
              pw.println("Welcome Admin : "+fName+"<br>");
              RequestDispatcher rd = 
	           req.getRequestDispatcher("link.html");
               rd.include(req, res);
    }
  }
}
