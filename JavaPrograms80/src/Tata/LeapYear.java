package Tata;
public class LeapYear {
	public static void main(String[] args) {
		int year=2020;
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		   {
		       System.out.println("Given Year is Leap Year");
		   }else 
		       {
		          System.out.println("Given Year is Not Leap Year");
		       }
	}  

}
