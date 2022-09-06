package Test;
import java.util.*;
public class DemoString3{
	public static void main (String[]args) {
		//String s1="Kumar";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The  First Name:");
		 String s1=s.nextLine();
		 int leng=s1.length();
		 System.out.println("*** Display String***");
		   for(int i=0;i<=leng;i++) {
			   char ch= s1.charAt(i);
			   System.out.println(ch);
		   }
			 s.close();  
		   }
			   
		 
	}


