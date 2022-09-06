/**Assignment:
Step-1 : read empName
Step-2 : read empId
           =>empId must be in A111 or B222 or C333,else invalid empId
Step-3 : Once empId is verified then read empDesg
          =>empDesg must be in SE or TE or ME,else invalid empDesg
Step-4 : Once empDesg is verified then read empBSal
           =>empBSal must be min 12000/-,else invalid bSal
Step-5 : Once empBSal is Validated then calculate totSal of an employee.

o/p:
  EmpName   :
  EmpId     :
  EmpDesg   :
  EmpBSal   :
  EmpTotSal :

SubClass  : EmployeeDetails
SubClass  : EmployeeSalary
MainClass : DemoMethods11**/



//Assignment:(Solution)

package EmployeeDetails;
import java.util.Scanner;
class EmployeeDetails1 //SubClass
{
	String empName,empId,empDesg;//Instance variables
	void setEmployeeDetails(String a,String b,String c)
	{
		empName = a;
		empId = b;
		empDesg = c;
	}
	void getEmployeeDetails()
	{
		System.out.println("===EmployeeDetails===");
		System.out.println("EmpName:"+empName);
        System.out.println("EmpId:"+empId);
        System.out.println("EmpDesg:"+empDesg);
	}
}
class EmployeeSalary //SubClass
{
	int bSal;
	float totSal;
	void calculate(int bS)//bSal as parameter
	{
		bSal=bS;
		totSal = bS+(0.93F*bS)+(0.63F*bS);
	}
	void getEmployeeSalary()
	{
		System.out.println("===EmployeeSalary===");
		System.out.println("BSal:"+bSal);
		System.out.println("TotSal:"+totSal);
	}
}
class EmployeeDetails 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the EmpName:");
		String empName = s.nextLine();
		System.out.println("Enter the EmpId:");
		String empId = s.nextLine().toUpperCase();
		boolean b1=false;
		switch(empId)
		{
			case "A111":b1=true;
			   break;
            case "B222":b1=true;
				break;
			case "C333":b1=true;
				break;
		}//end of switch
		if(b1)
		{
			System.out.println("Enter the empDesg:");
			String empDesg = s.nextLine().toUpperCase();
			boolean b2=false;
			switch(empDesg)
			{
				case "SE":b2=true;
				break;
				case "TE":b2=true;
				break;
				case "ME":b2=true;
				break;
			}//end of switch
			if(b2)
			{
				EmployeeDetails1 ed = new EmployeeDetails1();
				ed.setEmployeeDetails(empName,empId,empDesg);
				          //Seting the data to Object
                System.out.println("Enter the bSal:");
				int bSal = s.nextInt();
				if(bSal>=12000)
				{
					EmployeeSalary es = new EmployeeSalary();
					es.calculate(bSal);
					ed.getEmployeeDetails();
					es.getEmployeeSalary();
				}//end of if
				else
				{
					System.out.println("Invalid bSal...");
				}
			}//end of if
			else
			{
				System.out.println("Invalid empDesg...");
			}
		}//end of if
		else
		{
			System.out.println("Invalid empId...");
		}
	}
}

