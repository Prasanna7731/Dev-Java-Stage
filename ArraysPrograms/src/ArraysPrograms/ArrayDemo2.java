package ArraysPrograms;
import static java.lang.System.*;
import java.util.*;
class RW
{ static void read(int []arr)
{ out.println("arr.length:\t"+arr.length);
Scanner s=new Scanner(in);
out.println("Enter "+arr.length+" Elements");
for(int i=0;i<arr.length;i++)
{ 
	arr[i]=s.nextInt();
}
}
static void write(int[] arr)
{ out.println("Elements in an array...");
for(int i=0;i<arr.length;i++)
{
	out.print(arr[i]+"\t");
}
}
}
public class ArrayDemo2 {
	public static void main(String args[])
	{ int []arr=new int[5];
	RW.read(arr);
	RW.write(arr);
	}
}
