package Tata;
public class PowerOfNumber {
	public static void main(String[] args) {
		int base=5;
		int exponent=5;
		long result=1;
		while(exponent!=0)
		{
			result=result*base;
			--exponent;
		}
         System.out.println("Result:"+result);
	}

}
