package Test;
import java.sql.*;
public class RetrieveDAO {
    public ResultSet rs = null;
    public ResultSet retrieve() {
    	try {
    		Connection con = DBConnection.getCon();
    		   //Accessing existing Connection
    		PreparedStatement ps = con.prepareStatement
    		("select * from Product41");
    		rs = ps.executeQuery();
    	}catch(Exception e) {e.printStackTrace();}
    	return rs;
    }
}


