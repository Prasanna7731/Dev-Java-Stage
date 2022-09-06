package ArraysPrograms;
import static java.lang.System.*;
public class ArraysPrograms {
	public static void main(String[] args) {
		//at the time of declaring reference variable we can place the subscript either left side or right side of the variable.
		//but, at the time of creating array by using new operator the subscript must be placed after the data type.
		int []arr=new int[3];
		int []arr2=null;
		out.println("arr:\t"+arr);
		out.println("arr2:\t"+arr2);
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		out.println("Elements in an array");
		for(int v:arr)
		{out.println(v);
		}
		}
		}

	


