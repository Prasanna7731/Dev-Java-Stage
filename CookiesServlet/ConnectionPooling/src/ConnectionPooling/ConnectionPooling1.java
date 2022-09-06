package ConnectionPooling;
import java.sql.*;
 public class ConnectionPooling1  {
	public static void main(String[] args) {
          try {
     ConnectionPooling  cp = new ConnectionPooling ("jdbc:oracle:thin:@localhost:1521:xe", "system","tiger");//Con_Call
        	  cp.createConnection();
        	  System.out.println("Pool Size : "+cp.v.size());
        	  Connection con = cp.useConnection();//Using the Connection
        	  System.out.println("Pool Size : "+cp.v.size());
        	  System.out.println("Display using : "+con);
        	  PreparedStatement ps = con.prepareStatement
        			  ("select * from Employee41");
        	  ResultSet rs = ps.executeQuery();
        	  while(rs.next()) {
        		  System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"
        				  +rs.getFloat(3)+"\t"+rs.getInt(4));
        	  }//end of loop
        	  p.returnConnection(con);//Adding Connection to Pool
        	  System.out.println("Pool Size : "+p.v.size());
          }catch(Exception e) {
        	  System.out.println(e.getMessage());
          }
	}
}


//public class ConnectionPooling1 {


