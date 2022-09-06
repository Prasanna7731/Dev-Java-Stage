package Test;

public class DemoString {

	public static void main(String[] args) {
		
		String s1="Java";
		String s2="Program";
		String s3=s1.concat(s2);   // it is also working
		//String s3=s1+s2;
		int leng1=s1.length();
		int leng2=s2.length();
		int leng3=s3.length();
		
		System.out.println("String of S1 is:"+s1);
		System.out.println("Length of String s1 is:"+leng1);
		System.out.println("string of s2 is:"+s2);
		System.out.println("Length of string s2 is:"+leng2);
		System.out.println("string of s3 is:"+s3);
		System.out.println("Length of string s3 is:"+leng3);
		

	}

}
