package ArraysPrograms;
import static java.lang.System.*;
class TwoDimenstionalArray
{ public static void main(String args[])
{ //a two dimensional array is nothing but collection of single dimensional arrays
int arr[][]=new int[2][3];
out.println(arr.length);
//arr[0]= 5000+(0*2)=5000
out.println(arr[0]);
//arr[1]= 5000+(1*2)=5002
out.println(arr[1]);
out.println(arr[0].length);
out.println(arr[1].length);
//arr[0][0]=1000+(0*4)=1000;
out.println(arr[0][0]);
//arr[0][1]=1000+(1*4)=1004;
out.println(arr[0][1]);
//arr[0][2]=1000+(2*4)=1008;
out.println(arr[0][2]);
//arr[1][0]=2000+(0*4)=2000;
out.println(arr[1][0]);
//arr[1][1]=2000+(1*4)=2004;
out.println(arr[1][1]);
//arr[1][2]=2000+(2*4)=2008;
out.println(arr[1][2]);
}
}
