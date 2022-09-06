package ConnectionPooling;
import java.util.*;
import java.sql.*;
public class ConnectionPooling {
	public String url,uName,pWord;
	public ConnectionPooling(String url,String uName,String pWord) {
		this.url=url;
		this.uName=uName;
		this.pWord=pWord;
	}
	Vector<Connectio> v = new Vector<Connection>();
	public void createConnection() {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			while(v.size()<5) {
				System.out.println("pool is not full...");
				Connection con=DriverManager.getConnction(url,uName,pWord);
				System.out.prinln(con);
				v.add(con);
				if(v.size()==5) {
					System.out.println("pool is full...");
				}
			}
			
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		public synchronized Connectio useConnectio() {
			Connection con=new v.elementAt(0);
			v.remove(0);
			return con;
		}
		public synchronized void  retunConnection (Connection con) {
			v.add(con);
			System.out.println("connection is added back to the pool...");
		}
	}