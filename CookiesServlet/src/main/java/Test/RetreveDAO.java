package Test;
import java.sql.*;
import java.util.*;

public class RetreveDAO {
	 public ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
//ArrayList object can hold UnLimited EmployeeBean objects
public ArrayList<EmployeeBean> retrieve()
{
try {
	  Connection con = DBConnection.getCon();
	  PreparedStatement ps = con.prepareStatement
			  ("select * from UserReg41");
	  ResultSet rs = ps.executeQuery();
	  while(rs.next())
	  {
		  EmployeeBean eb = new EmployeeBean();
		  eb.seteId(rs.getString(1));
		  eb.seteName(rs.getString(2));
		  eb.seteDesg(rs.getString(3));
		  eb.setbSal(rs.getInt(4));
		  eb.setTotSal(rs.getFloat(5));
		  al.add(eb);
		  //Adding Bean object to ArrayList Object
	  }//end of loop
  }catch(Exception e) {e.printStackTrace();}
  return al;
}
}
