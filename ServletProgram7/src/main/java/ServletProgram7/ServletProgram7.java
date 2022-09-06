package ServletProgram7;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class ServletProgram7 extends GenericServlet{
    public void service(ServletRequest req,ServletResponse res)
    throws ServletException,IOException{
    	PrintWriter pw = res.getWriter();
    	res.setContentType("text/html");
    	String uName = req.getParameter("uname");
    	ServletContext sct = this.getServletContext();
    	//Accessing ServletContext Object reference
    	pw.println("UserName:"+uName);
    	pw.println("<br>====ServletContext===");
    	pw.println("<br>ServerInfo:"+sct.getServerInfo());
    	pw.println
    	("<br>ContextValue:"+sct.getInitParameter("a"));
    	ServletConfig sc = this.getServletConfig();
    	//Accessing ServletConfig Object reference
    	pw.println("<br>====ServletConfig===");
    	pw.println("<br>ServletName:"+sc.getServletName());
    	pw.println("<br>ConfigValue:"+sc.getInitParameter("b"));
    }
}


