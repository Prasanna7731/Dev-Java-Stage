package StudentDetails;
import java.util.Scanner;
class StudentResult //SubClass
{
	int totMarks;
	float per;
	String result;
	void calculate(int s1,int s2,int s3,int s4,int s5,int s6,boolean p)
		//Non-return_type Instance method with parameters
	{
		totMarks = s1+s2+s3+s4+s5+s6;
		per = (float)totMarks/6;//Type Casting process
		if(p)
		{
			result="Fail";
		}
		else if(per>=70 && per<=100)
		{
			result="Distinction";
		}
		else if(per>=60 && per<70)
		{
			result="FirstClass";
		}
		else if(per>=50 && per<60)
		{
			result="SecondClass";
		
		
		}
		else if(per>=35 && per<50)
		{
			result="ThirdClass";
		}
		else{
			result="Fail";
		}
	}
	void getStudentResult()
		//Non-return_type Instance method without parameters
	{
		System.out.println("====StudentResult===");
		System.out.println("TotalMarks:"+totMarks);
		System.out.println("Percentage:"+per);
		System.out.println("Result:"+result);
	}
}
class StudentDetails //MainClass 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Marks of Sub-1:");
		int sub1 = s.nextInt();
        System.out.println("Enter the Marks of Sub-2:");
		int sub2 = s.nextInt();
        System.out.println("Enter the Marks of Sub-3:");
		int sub3 = s.nextInt();
        System.out.println("Enter the Marks of Sub-4:");
		int sub4 = s.nextInt();
        System.out.println("Enter the Marks of Sub-5:");
		int sub5 = s.nextInt();
        System.out.println("Enter the Marks of Sub-6:");
		int sub6 = s.nextInt();
		boolean p = false;
		if((sub1>=0 && sub1<=100)&&(sub2>=0 && sub2<=100)&&(sub3>=0 && sub3<=100)&&
			(sub4>=0 && sub4<=100)&&(sub5>=0 && sub5<=100)&&(sub6>=0 && sub6<=100))
		{
			if(sub1<=34 || sub2<=34 || sub3<=34 || sub4<=34 || sub5<=34 || sub6<=34)
			                           //Nested simple if
			{
				p=true;
			}//end of if
			StudentResult sr = new StudentResult();
			sr.calculate(sub1,sub2,sub3,sub4,sub5,sub6,p);//methodCall with_Para_passing
			sr.getStudentResult();//methodClass with_out_para_passing
		}//end of if
		else
		{
			System.out.println("Invalid Marks...");
		}
	}
}

	
