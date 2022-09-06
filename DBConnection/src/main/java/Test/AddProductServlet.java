package Test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends GenericServlet{
	public InsertDAO ob=null;
	public void init() throws ServletException{
		ob = new InsertDAO();//Creating object
	}
	   public void service(ServletRequest req,ServletResponse res)
	   throws ServletException,IOException{
		   PrintWriter pw = res.getWriter();
		   res.setContentType("text/html");
		   int k = ob.insert(req);
		   if(k>0) {
			 pw.println("Product Added Successfully...<br>");
			 RequestDispatcher rd = 
					 req.getRequestDispatcher("input.html");
			 rd.include(req, res);
		   }
	   }
	}
