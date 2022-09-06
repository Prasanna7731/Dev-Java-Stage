package Test;
import java.sql.*;
import java.util.*;
public class DBCon22 {
	public static void main(String[] args) 
	{
			try {
				
				Scanner sc=new Scanner(System.in);
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con = DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
				System.out.println(con.getAutoCommit());
				con.setAutoCommit(false);
				System.out.println("Enter Your AccNo");
				Long haccno=Long.parseLong(sc.nextLine());
				
				PreparedStatement ps1=con.prepareStatement("Select * from Bank41 where accno=?");
				PreparedStatement ps2=con.prepareStatement("Update Bank41 set balance=balance+? where accno=?");
				ps1.setLong(1, haccno);
				ResultSet rs=ps1.executeQuery();
				con.setSavepoint();
				
				if(rs.next()) {
					
					System.out.println("Enter Amount to Transfer:");
					Float balance=Float.parseFloat(sc.nextLine());
					Float a=rs.getFloat(3);
					if(balance<a) {
					ps2.setFloat(1,-balance);
					ps2.setLong(2,haccno);
					int i=ps2.executeUpdate();
					
					System.out.println("Enter Acc no Whom you want to Transfer:");
					Long baccno=Long.parseLong(sc.nextLine());
					ps1.setLong(1, baccno);
					ResultSet rs1=ps1.executeQuery();
					if(rs1.next())
					{
						ps2.setFloat(1,balance);
						ps2.setLong(2,baccno);
						int j=ps2.executeUpdate();
						if(i==1 && j==1)
						{
							con.commit();
							System.out.println("Transaction Successfully");
						}else {
							System.out.println("Transaction failed");
							con.rollback();
						}
						
					}
					else {
						System.out.println("Invalid Account");
					}
					}
					else
					{
						System.out.println("Insuffient balance");
					}
					
					
				}else
				{
					System.out.println("Invalid Account Number");
				}
				
				sc.close();
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}

	}