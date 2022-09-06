package Test;
import java.sql.*;
public class DBCon26 {
	public static void main(String[] args) {
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
            //Loading Driver
            Connection con = DriverManager.getConnection
            ("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
            //Connection DataBase
            PreparedStatement ps = con.prepareStatement
            		("insert into product41 values(?,?,?,?)");//Compilation
            con.setAutoCommit(false);
            ps.setString(1,"A1066");
            ps.setString(2,"English");
            ps.setFloat(3,355.68F);
            ps.setInt(4,11);
            ps.addBatch();
            
            ps.setString(1,"A1077");
            ps.setString(2,"Telugu");
            ps.setFloat(3,745.68F);
            ps.setInt(4,18);
            ps.addBatch();
            
            int k[] = ps.executeBatch();
            for(int i=0;i<k.length;i++)
            {
            	System.out.println("Recored Inserted Successfully...");
            }//end of loop
            
            con.commit();
            ps.clearBatch();
        }catch(Exception e) {
        	System.out.println(e.getMessage());
        }
	}
}

