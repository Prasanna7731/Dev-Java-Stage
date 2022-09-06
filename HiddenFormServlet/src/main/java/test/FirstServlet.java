package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/first")

public class FirstServlet extends HttpServlet{
	@Override
	   protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	   ServletException,IOException{
		   PrintWriter pw = res.getWriter();
		   res.setContentType("text/html");
		   EmployeeBean eb = new RetrieveDAO().retrieve(req);
		   if(eb==null) {
			   pw.println("Invalid EmployeeCode...<br>");
			   RequestDispatcher rd = req.getRequestDispatcher("input.html");
			   rd.include(req, res);
		   }else {
			  pw.println("<form action='second' method='post'>");
			  pw.println("<input type='hidden' name='eid' value='"+eb.geteId()+"'>");
			  pw.println("<input type='hidden' name='ename' value='"+eb.geteName()+"'>");
			  pw.println("<input type='hidden' name='edesg' value='"+eb.geteDesg()+"'>");
			  pw.println("<input type='hidden' name='bsal' value='"+eb.getbSal()+"'>");
			  pw.println("<input type='hidden' name='totsal' value='"+eb.getTotSal()+"'>");
			  pw.println("<input type='submit' value='Display'>");
			  pw.println("</form>");
		   }
	   }

}
