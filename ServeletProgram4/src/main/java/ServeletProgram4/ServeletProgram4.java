package ServeletProgram4;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis2")
public class  ServeletProgram4 extends GenericServlet{
   public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	   String bC = req.getParameter("bcode");
	   String bN = req.getParameter("bname");
	   String bA = req.getParameter("bauthor");
	   String bp = req.getParameter("bprice");
	   String bQ = req.getParameter("bquantity");
	   PrintWriter pw = res.getWriter();
	   res.setContentType("text/html");
	   pw.println("bcode:"+bC);
	   pw.println("<br>bname:"+bN);
	   pw.println("<br>bauthor:"+bA);
	   pw.println("<br>bprice:"+bp);
	   pw.println("<br>bquantity:"+bQ);
   }
}


