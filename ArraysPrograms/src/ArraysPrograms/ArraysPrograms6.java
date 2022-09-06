package ArraysPrograms;
import static java.lang.System.*;
public class ArraysPrograms6 
	{
		public static void main(String args[])
	{
	int [][]arr=new int[2][5];
	out.println("arr:\t"+arr);
	out.println("arr[0]:\t"+arr[0]);
	out.println("arr[1]:\t"+arr[1]);
	out.println("arr.length:\t"+arr.length);
	out.println("arr[0].length:\t"+arr[0].length);
	out.println("arr[1].length:\t"+arr[1].length);
	out.println("Elements in an array...");
	//i=0,1,2
	//arr.length=2
	for(int i=0;i<arr.length;i++)
	{
		//j=0,1,2,3
	//arr[1].length=3
	for(int j=0;j<arr[i].length;j++)
	{
		out.print(arr[i][j]+"\t");
	//j++;
	}
	out.println();
	//i++;
	}
	}

}
