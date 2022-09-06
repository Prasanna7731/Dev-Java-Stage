package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	@Override
  protected void doPost(HttpServletRequest req,
	HttpServletResponse res)throws ServletException,IOException{
	  PrintWriter pw = res.getWriter();
	  res.setContentType("text/html");
	  UserBean ub = new LoginDAO().login(req);
	  if(ub==null) {
		  pw.println("Invalid Login process...<br>");
		  RequestDispatcher rd = 
				  req.getRequestDispatcher("login.html");
		  rd.include(req, res);
	  }else {
		  Cookie ck = new Cookie("fname",ub.getfName());
		  ServletContext sct = this.getServletContext();
		        //Accessing ServletContext Object
		  sct.setAttribute("ubean",ub);
		        //Adding Attribute to ServletContext
		  pw.println("Welcome User : "+ub.getfName()+"<br>");
		  res.addCookie(ck);//Adding Cookie to response
		  RequestDispatcher rd = 
				  req.getRequestDispatcher("link.html");
		  rd.include(req, res);
	  }
  }
}
