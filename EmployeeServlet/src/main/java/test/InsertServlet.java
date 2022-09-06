package test;
import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class InsertServlet extends GenericServlet {
	public  InsertDAO ob=null;
	public void init()throws ServletException{
		ob=new InsertDAO();
	}
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");
		int k=ob.Insert(req);
		if(k>0) {
			pw.println("Product1 Added Successfully.....<br>");
			RequestDispatcher rd=req.getRequestDispatcher("input.html");
			rd.include(req, res);
		}
		else {
			pw.println("Product Added Successfully..<br>");

		}
	}
}
