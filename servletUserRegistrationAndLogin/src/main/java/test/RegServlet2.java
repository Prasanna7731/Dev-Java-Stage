package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/reg2")
public class RegServlet2 extends HttpServlet{
	@Override
  protected void doPost(HttpServletRequest req,
		HttpServletResponse res)throws ServletException,IOException{
	   ServletContext sct = this.getServletContext();//
	        //Accessing ServletContext Object
	   UserBean ub = (UserBean)sct.getAttribute("ubean");
	          //Getting Attribute from ServletContext
	   ub.setAddr(req.getParameter("addr"));
	   ub.setmId(req.getParameter("mid"));
	   ub.setPhNo(Long.parseLong(req.getParameter("phno")));
	   int k = new InsertDAO().insert(ub);//Bean as parameter
	   PrintWriter pw = res.getWriter();
	   res.setContentType("text/html");
	   if(k>0) {
		   pw.println("User Registration Successfull...<br>");
		   RequestDispatcher rd = 
				   req.getRequestDispatcher("login.html");
		   rd.include(req, res);
	   }
   }
   
}


