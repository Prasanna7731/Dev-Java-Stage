package test;
import java.io.*;
import javax.servlet.*;
public class DisplayFilter  implements Filter{
	public FilterConfig fc=null;
	 public void init(FilterConfig fc)throws ServletException{
	 this.fc=fc;
	 }
	 public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws
	 ServletException,IOException{
	 PrintWriter pw = res.getWriter();
	 res.setContentType("text/html");
	 String uName = req.getParameter("uname");
	 pw.println("Welcome User "+uName+"<br>");
	 pw.println("====FilterConfig====");
	 pw.println("<br>FilterName:"+fc.getFilterName());
	 pw.println("<br>ConfigValue:"+fc.getInitParameter("a"));
}
}
