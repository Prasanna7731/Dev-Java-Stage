package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet{
   protected void doGet(HttpServletRequest req,
	HttpServletResponse res)throws ServletException,IOException{
	   PrintWriter pw = res.getWriter();
	   res.setContentType("text/html");
	   Cookie c[] = req.getCookies();
	   if(c==null) {
		   pw.println("Session Expired...<br>");
		   RequestDispatcher rd = 
				   req.getRequestDispatcher("login.html");
		   rd.include(req, res);
	   }else {
		   String fName = c[0].getValue();
		   pw.println("Page of "+fName+"<br>");
		   RequestDispatcher rd = 
				   req.getRequestDispatcher("link.html");
		   rd.include(req, res);
		   ServletContext sct = this.getServletContext();
		   UserBean ub = (UserBean)sct.getAttribute("ubean");
		   pw.println("<br>FName:"+ub.getfName());
		   pw.println("<br>LName:"+ub.getlName());
		   pw.println("<br>Addr:"+ub.getAddr());
		   pw.println("<br>Md:"+ub.getmId());
		   pw.println("<br>PhNo:"+ub.getPhNo());
	   }
   }

}
