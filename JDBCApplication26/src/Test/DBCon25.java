package Test;
import java.sql.*;
public class DBCon25 {
		public static void main(String[] args) {
	        try {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");
	            //Loading Driver
	            Connection con = DriverManager.getConnection
	            ("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
	            //Connection DataBase
	            Statement stm = con.createStatement();
	            con.setAutoCommit(false);
	            stm.addBatch("insert into Product41 values('A111','XYZ',435.55,7)");
	            stm.addBatch
	            ("insert into book41 values('A125','Alex',13000,4)");
	            int k[] = stm.executeBatch();
	            for(int i=0;i<k.length;i++) {
	            	System.out.println("Record Inserted Successfully...");
	            }
	            con.commit();
	            stm.clearBatch();
	        }catch(Exception e) {
	        	System.out.println(e.getMessage());
	        }
		}
	}


