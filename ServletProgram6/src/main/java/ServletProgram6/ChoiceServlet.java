package ServletProgram6;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class ChoiceServlet extends GenericServlet{
	   public void service(ServletRequest req,ServletResponse res)
	   throws ServletException,IOException{
		   String s1 = req.getParameter("s1");
		   if(s1.equals("Add")) {
			  RequestDispatcher rd = 
					  req.getRequestDispatcher("add");
			  rd.forward(req, res);
		   }else 
			  // String s1 = req.getParameter("s1");
			   if(s1.equals("Sub")) {
			   RequestDispatcher rd = 
					   req.getRequestDispatcher("sub");
			   rd.forward(req, res);
		   }else 
			 //  String s1 = req.getParameter("s1");
			   if(s1.equals("Mul")) {
			  RequestDispatcher rd = 
					   req.getRequestDispatcher("mul");
			   rd.forward(req, res);
		   }else 
			 //  String s1 = req.getParameter("s1");
			   if(s1.equals("Div")) {
			   RequestDispatcher rd = 
					   req.getRequestDispatcher("div");
			   rd.forward(req, res);
		   }else 
			  // String s1 = req.getParameter("s1");
			   if(s1.equals("ModDiv")) {
			  RequestDispatcher rd = 
				   req.getRequestDispatcher("moddiv");
			   rd.forward(req, res);
		   }
	   
	   }
	} 



