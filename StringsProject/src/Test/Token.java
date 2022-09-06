package Test;
import  java.util.*;
public class Token {
	public static void main(String[]args) {
		String s1="java progeam";
		StringTokenizer st=new StringTokenizer(s1,"a");
		System.out.println("#$% Display Tokens#$%");
		while(st.hasMoreTokens());
		{
			String tk=st.nextToken();
			System.out.println(tk);
			
		}
	}
}
