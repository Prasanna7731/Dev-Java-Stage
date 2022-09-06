package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/second")

public class SecondServlet extends HttpServlet{
	 protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
	   ServletException,IOException{
		   PrintWriter pw = res.getWriter();
		   res.setContentType("text/html");
		   pw.println("EmpCode:"+req.getParameter("eid"));
		   pw.println("<br>EmpName:"+req.getParameter("ename"));
		   pw.println("<br>EmpDesg:"+req.getParameter("edesg"));
		   pw.println("<br>EmpBSal:"+req.getParameter("bsal"));
		   pw.println("<br>EmpTotSal:"+req.getParameter("totsal"));
	   }

}
