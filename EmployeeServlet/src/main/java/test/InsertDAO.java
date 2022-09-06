package test;
import java.sql.*;
import javax.servlet.*;
public class InsertDAO {
	public int k=0;
	public int Insert(ServletRequest req)
	{
		try {
			Connection con=DBConnection.getCon();
			
			PreparedStatement ps=con.prepareStatement("insert into Employee41 values(?,?,?,?,?)");
			ps.setString(1, req.getParameter("eid"));
			ps.setString(2, req.getParameter("ename"));
			ps.setString(3, req.getParameter("edesg"));
			ps.setFloat(4, Float.parseFloat(req.getParameter("bsal")));
			Float Totsal=(float) (Float.parseFloat(req.getParameter("bsal"))*(1.2));
			ps.setFloat(5, Totsal);
			k=ps.executeUpdate();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return k;	
	}
}



//InsertDAO