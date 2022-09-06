package Test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")

public class ViewEmployeeServlet  extends HttpServlet{
	 protected void doGet(HttpServletRequest req,HttpServletResponse res)
			   throws ServletException,IOException{
				   PrintWriter pw = res.getWriter();
				   res.setContentType("text/html");
				   HttpSession hs = req.getSession(false);
				           //Accessing existing Session object
				   if(hs==null) {
					   pw.println("Session Expired...<br>");
					   RequestDispatcher rd=
							   req.getRequestDispatcher("login.html");
					   rd.include(req, res);
				   }else {
					   String fName = (String)hs.getAttribute("fname");
					   pw.println("Page of Admin : "+fName+"<br>");
					   RequestDispatcher rd = 
							   req.getRequestDispatcher("link.html");
					   rd.include(req, res);
					   pw.println("<br>===EmployeeDetails===<br>");
					   ArrayList<EmployeeBean> al = 
				           new RetreveDAO().retrieve();
					   if(al.size()==0) {
						   pw.println("No Employee Avaialble..<br>");
					   }else {

						   Iterator<EmployeeBean> it = al.iterator();
						   while(it.hasNext()) {
							   EmployeeBean eb = (EmployeeBean)it.next();
							   pw.println(eb.geteId()+"&nbsp&nbsp"+
							     eb.geteName()+"&nbsp&nbsp"+
									   eb.geteDesg()+"&nbsp&nbsp"+
							     eb.getbSal()+"&nbsp&nbsp"+
									   eb.getTotSal()+"<br>");
						   }//end loop
					   }
				   }
			   }
}
