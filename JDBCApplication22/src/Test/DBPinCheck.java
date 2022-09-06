package Test;
import java.util.*;
import java.sql.*;
public class DBPinCheck {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			try
			{
				int count=0;
				XYZ:
				while(true)     
				{
				Class.forName("oracle.jdbc.driver.OracleDriver");
	     	    Connection con=DriverManager.getConnection
	     	    ("jdbc:oracle:thin:@localhost:1521:orcl","system","tiger");
	     	   
	     	    PreparedStatement ps1=con.prepareStatement
	     	    		("Select * from Bank41 where accno=?");
	     	   PreparedStatement ps2=con.prepareStatement
	    	    		("Update Bank41 set balance=balance+? where accno=?");
	     	   
	     	   //System.out.println("Commit Status:"+con.getAutoCommit());
	     	   con.setAutoCommit(false);
	     	  //System.out.println("Commit Status:"+con.getAutoCommit());
	     	    
	     	  Savepoint sp=con.setSavepoint();//Savepoint..........
	     	  
	     	  System.out.println("Enter PinNumber");
	     	  int pinNumber=s.nextInt();
	     	  CheckPinNumber cpn=new CheckPinNumber();
	     	  boolean k=cpn.verify(pinNumber);
	     	  if(k)
	     	  {
	     	  System.out.println("Enter HomeAccNo");
	     	  Long hAccNo=s.nextLong();
	     	  ps1.setLong(1, hAccNo);
	     	  ResultSet rs1=ps1.executeQuery();
	     	  if(rs1.next())
	     	  {
	     		  float bal=rs1.getFloat(3);
	     		  System.out.println("Enter BeneficieryAccNo");
	     		  long bAccNo=s.nextLong();
	     		  ps1.setLong(1,bAccNo);
	     		  ResultSet rs2=ps1.executeQuery();
	     		  if(rs2.next())
	     		  {
	     		  System.out.println("Enter amt to be Transfered");
	     		  int amt=s.nextInt();
	     		  if(amt<=bal)
	     		  {
	     			  ps2.setFloat(1, -amt);
	     			  ps2.setLong(2, hAccNo);
	     			  int i=ps2.executeUpdate();
	     			  
	     			  ps2.setFloat(1, amt);
	     			  ps2.setLong(2, bAccNo);
	     			  int j=ps2.executeUpdate();
	     			  
	     			  if(i==1 && j==1)
	     			  {
	     				  con.commit();
	     				  System.out.println("Transaction Successful...");
	     				  break XYZ;
	     			  }
	     			  else {
	     				 System.out.println("Transaction Failed...");
	     				 con.rollback(sp);
	     			  }
	     		  }
	     		  else {
	     			 System.out.println("Insufficient Funds...");
	     			 break XYZ;
	     		  }
	     	  }
	     		  else
	     		  {
	     			 System.out.println("Invalid bAccNo...");
	     			 break XYZ;
	     		  }
	     	  }
	     	  else
	     	  {
	     		  System.out.println("Invalid hAccNo.....");
	     		  break XYZ;
	     	  }
	     	  
	     	  }
	     	 else
	 		{
	 			System.out.println("Invalid PinNumber");
	 			count=count+1;
	 		}
	     	  if(count==3)
	     	  {
	     		  System.out.println("Transaction Blocked........!!!!");
	     		  break XYZ;
	     	  }
			}
			}//end of while loop
			
			catch(Exception e)
			{
				e.printStackTrace();
			}

		}

	}





