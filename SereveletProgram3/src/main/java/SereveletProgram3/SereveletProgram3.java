package SereveletProgram3;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class SereveletProgram3 extends GenericServlet{
   public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
	    String uName = req.getParameter("uname");
	   String mId = req.getParameter("mid");
	   String ad = req.getParameter("addr");
	   PrintWriter pw = res.getWriter();
	   res.setContentType("text/html");
	   pw.println("UserName:"+uName);
	   pw.println("<br>MailId:"+mId);
	   pw.println("<br>Address:"+ad);
   }
}
