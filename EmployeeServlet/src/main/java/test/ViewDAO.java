package test;
import java.sql.*;
public class ViewDAO {
	public ResultSet rs=null;
	public ResultSet viewtpk()
	{
		try {
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement
					("select*from Employee41");
			rs=ps.executeQuery();
		}catch(Exception e)
		{
		e.printStackTrace();	
		}
		return rs;
	}
}


