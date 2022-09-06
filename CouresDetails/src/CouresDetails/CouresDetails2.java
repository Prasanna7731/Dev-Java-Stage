package CouresDetails;
import java.util.Scanner;
class CouresDetails
  {
	String cid;
	String cduration;
	String cname;
	int cfee;
	void setCouresDetails(String a, String b,String c,int d)
	{
		cid=a;
		cduration=b;
		cname=c;
		cfee=d;
	}
	void getCouresDetails()
	{
		System.out.println("Enter the Coures Id:"+cid);
		System.out.println("Enter the Coures Duration:"+  cduration);
		System.out.println("Enter the Coures Name:"+  cname);
		System.out.println("Enter the Coures fee:"+  cfee);
		
	}
  }
public class CouresDetails2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Coures Id");
		String cID=s.nextLine();
		System.out.println("Enter the Coures Duration");
		String cD=s.nextLine();
		System.out.println("Enter the Coures Name");
		String cN=s.nextLine();
		System.out.println("Enter the Coures Fee");
		int cF=s.nextInt();
		 CouresDetails cd=new  CouresDetails();
		 cd.setCouresDetails(cID,cD,cN,cF);
		 cd.getCouresDetails();
	}

}
