package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebFilter("/login")
public class LoginFilter implements Filter{
	public LoginDAO ob=null;
	@Override
   public void init(FilterConfig fc)throws ServletException{
	   ob = new LoginDAO();
   }
	@Override
   public void doFilter(ServletRequest req,ServletResponse res,FilterChain chain)throws
   ServletException,IOException{
	   PrintWriter pw = res.getWriter();
	   res.setContentType("text/html");
	   String fName = ob.login(req);
	   if(fName==null) {
		   pw.println("Invalid Login process...<br>");
		   RequestDispatcher rd = req.getRequestDispatcher("login.html");
		   rd.include(req, res);
	   }else {
		   req.setAttribute("fname", fName);//Adding attribute to request
		   chain.doFilter(req, res);//linking Servlet_program
	   }
   }
}
