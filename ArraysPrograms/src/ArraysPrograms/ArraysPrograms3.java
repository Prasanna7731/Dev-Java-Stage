package ArraysPrograms;
import static java.lang.System.*;
public class ArraysPrograms3
   {
	   public static void main(String[] args)
	      {
	//	int i=0,1,2,3;
		int[] arr=new int[4];
		int[] arr2=null;
		out.println("arr:\t"+arr);
		out.println("arr2:\t"+arr2);
		arr[0]=10000;
		arr[1]=20000;
        arr[3]=30000;
        out.println("Array  Elements Are");
       // out.println("Array Ended");
        for(int i=0;i<=arr.length;i++)
        {
          out.println(arr[i]);
        }
          out.println("Array Ended");
        
	}
   }
	
