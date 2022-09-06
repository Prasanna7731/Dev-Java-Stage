package Test;
import java.util.*;
public class Palindrom {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter The String");
		String s1=s.nextLine();
		StringBuffer sb =new StringBuffer(s1);
         String s2=new String(sb.reverse());
		    if(s1.equals(s2)) {
         //if(s2==s1) {
		    	System.out.println("Given String Is Palindrom");
		    }else {
		    	System.out.println("Given String Is Not Palindrom");
		    }
	}
}
