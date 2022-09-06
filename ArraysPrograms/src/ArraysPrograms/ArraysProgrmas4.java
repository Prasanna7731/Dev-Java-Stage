package ArraysPrograms;
import static java.lang.System.*;
import java.util.*;
public class ArraysProgrmas4
	{
	public static void main(String args[])
	{ 
		int arr[]=new int[5];
	Scanner s=new Scanner(in);
	out.println("Enter "+arr.length+" elements");
	//i=0,1,2,3
	//arr.length=3
	for(int i=0;i<arr.length;i++)
		//for(int i=0;i<=4;i++)
	{arr[i]=s.nextInt();
	}
	out.println("Elements in an array");
	for(int v:arr)
	{out.print(v+"\t");
	}
	}

}
