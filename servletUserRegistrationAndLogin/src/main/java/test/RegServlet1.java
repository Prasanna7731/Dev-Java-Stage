package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/reg1")
public class RegServlet1 extends HttpServlet{
   @Override	
   protected void doPost(HttpServletRequest req,
		   HttpServletResponse res)throws ServletException,IOException{
	   UserBean ub = new UserBean();
	   ub.setuName(req.getParameter("uname"));
	   ub.setpWord(req.getParameter("pword"));
	   ub.setfName(req.getParameter("fname"));
	   ub.setlName(req.getParameter("lname"));
	   ServletContext sct = this.getServletContext();
	           //Accessing ServletContext Object
	   sct.setAttribute("ubean",ub);
	           //Attribute Added to ServletContext
	   RequestDispatcher rd = 
			   req.getRequestDispatcher("reg2.html");
	   rd.forward(req, res);
   }
}
