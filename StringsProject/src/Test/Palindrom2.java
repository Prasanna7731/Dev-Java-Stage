package Test;
public class Palindrom2 {
	public static void main(String[] args) {
		String s1="Prasanna";
		String reverse="";
		       char[] c=s1.toCharArray();
		       System.out.println(c.length);
		       for(int i=c.length-1;i>=0;i--) {
		       reverse=reverse+c[i];
	}
	if(s1==reverse) {
		System.out.println("Given String Is Palindrom");
	}
	else {
		System.out.println("Given String Is Not Palindrom");
	}
		
		       
		

	}

}
