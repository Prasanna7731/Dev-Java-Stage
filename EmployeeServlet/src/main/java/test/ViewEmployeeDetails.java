package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/dis")
public class ViewEmployeeDetails extends GenericServlet 
 {
	public ViewDAO ob=null;
	public void init()throws ServletException{
		 ob=new ViewDAO();	
		}
		public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
		{
			PrintWriter pw= res.getWriter();
			res.setContentType("text/html");
			try {
				ResultSet rs=ob.viewtpk();
				if(rs==null)
				{
					pw.println("Employee Record is not available..<br>");
					RequestDispatcher rd=req.getRequestDispatcher("input.html");
					rd.include(req, res);
				}
				else {
					while(rs.next())
					{
						pw.println(rs.getString(1)+"&nbsp&nbsp"+rs.getString(2)+"&nbsp&nbsp"+rs.getString(3)+"&nbsp&nbsp"+rs.getFloat(4)+"&nbsp&nbsp"+rs.getFloat(5)+"<br>");

					}
					RequestDispatcher rd=req.getRequestDispatcher("input.html");
					rd.include(req, res);
					
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}

}
