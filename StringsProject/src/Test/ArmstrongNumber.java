package Test;
import java.util.*;
public class ArmstrongNumber {
	public static void main(String[] args) {
		 int temp;
		 int rem=0;
		 int sum=0;
	Scanner s=new Scanner (System.in);
	 System.out.println("Enter The Number");
	     int n=s.nextInt();
	     temp=n;
	     while(n!=0) {
	    	 rem=n%10;
	    	 sum=sum+(rem*rem*rem);
	    	 n=n/10;
	     }
	     if( temp==sum){
	    	 System.out.println("Given Number Is ArmStrong Number");
	     }else {
	    	 System.out.println("Given Number Is Not ArmStrong Number");
	    	 
	     }
			

	}

}
