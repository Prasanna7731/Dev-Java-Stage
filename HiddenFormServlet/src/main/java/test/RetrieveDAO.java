package test;
import java.sql.*;
import javax.servlet.http.*;

public class RetrieveDAO {
	  public EmployeeBean eb=null;
      public EmployeeBean retrieve(HttpServletRequest req) {
    	  try {
    		  Connection con = DBConnection.getCon();
    		  PreparedStatement ps = con.prepareStatement
    				 ("select * from Employee41 where eid=?");
    		  ps.setString(1,req.getParameter("ecode"));
    		  ResultSet rs = ps.executeQuery();
    		  if(rs.next()) {
    			  eb = new EmployeeBean();//Bean object
    			  eb.seteId(rs.getString(1));
    			  eb.seteName(rs.getString(2));
    			  eb.seteDesg(rs.getString(3));
    			  eb.setbSal(rs.getInt(4));
    			  eb.setTotSal(rs.getFloat(5));
    		  }
    	  }catch(Exception e) {e.printStackTrace();}
    	  return eb;
      }
}

