package FirestServeletProgram2;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/first")
public class FirestServeletProgram2  implements Servlet{
	public void init(ServletConfig sc) 
            throws javax.servlet.ServletException{
		System.out.println("Initialization process...");
	}
    public void service(ServletRequest req, ServletResponse res) 
throws ServletException,IOException{
    	System.out.println("Request Handling process....");
    	     //Output on Console
    	PrintWriter pw = res.getWriter();
    	res.setContentType("text/html");
    	pw.println("Welcome to Servlet Programming...");
    	  //response onto WebBrowser
    }

    public  void destroy() {
    	System.out.println("Destroying process....");
    }

    public ServletConfig getServletConfig(){
    	return this.getServletConfig();
    }
    public String getServletInfo(){
    	return "FirstServlet";
    }
}
