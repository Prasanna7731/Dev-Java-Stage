/**Assignment:
Demonstrating Bank Transaction process.

balance = 2000/-

SubClass : WithDraw
             void wDraw(int amt,double balance)
                 =>The amt must be less than balance,else insufficient fund
                 =>Once amt is validated then display as:
                      Amt WithDrawn :
                      Balance Amt   :
                      Transaction Completed

SubClass : Deposit
             void deposit(int amt,double balance)
               =>Display as:
                      Amt Deposited :
                      Balance Amt   :
                      Transaction Completed

MainClass : DemoMethods10

step-1 : read pinNo
          =>The pinNo must be in 1111 or 2222 or 3333,else invalid pinNo
step-2 : when the pinNo is verified the display the choice as:
          1.WithDraw
          2.Deposit

1.WithDraw:
   =>Enter the amt
       =>The amt must be greater than zero and multiples of 100,else invalid amt
       =>when the amt is verified,then pass amt and balance as parameter to the
         method of WithDraw class.


2.Deposit:
  =>Enter the amt
       =>The amt must be greater than zero and multiples of 100,else invalid amt
       =>when the amt is verified,then pass amt and balance as parameter to the
         method of Deposit class.**/
  /**Dt : 5/2/2022
Assignment:(Solution)
Demonstrating Bank Transaction process
package BankDepositAndWithdraw;
Dt : 5/2/2022
Assignment:(Solution)**/

 //Demonstrating Bank Transaction process


package BankDepositAndWithdraw;
import java.util.Scanner;
class WithDraw //SubClass
{
	void wDraw(int amt,double balance)//Instance method
	{
		if(amt<balance)
		{
			System.out.println("Amt WithDrawn:"+amt);
			System.out.println("Balance amt:"+(balance-amt));
			System.out.println("Transaction Completed...");
		}//end if
		else
		{
			System.out.println("Insufficient fund...");
		}
	}
}
class Deposit //SubClass
{
	void deposit(int amt,double balance)//Instance method
	{
		System.out.println("Amt deposited:"+amt);
		System.out.println("Balance amt:"+(balance+amt));
		System.out.println("Transaction Completed..");
	}
}
class BankDepositAndWithdraw 
{
	public static void main(String[] args) 
	{
		double balance=2000;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the pinNo:");
		int pinNo = s.nextInt();
		if(pinNo==1111 || pinNo==2222 || pinNo==3333)
		{
			System.out.println("====Choice====");
			System.out.println("1.WithDraw\n2.Deposit");
			System.out.println("Enter the Choice:");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1:
					System.out.println("Enter the amt:");
				    int a1 = s.nextInt();
					if(a1>0 && a1%100==0)
				    {
						WithDraw wd = new WithDraw();
						wd.wDraw(a1,balance);
				    }//end of if
					else
				    {
						System.out.println("Invalid amt...");
				    }
					break;
				case 2:
					System.out.println("Enter the amt:");
				    int a2 = s.nextInt();
					if(a2>0 && a2%100==0)
				    {
						Deposit dp = new Deposit();
						dp.deposit(a2,balance);
				    }
					else
				    {
						System.out.println("Invalid amt...");
				    }
					break;
				default:
					System.out.println("Invlaid Choice...");
			}//end of switch
		}//end of if
		else
		{
			System.out.println("Invalid pinNo...");
		}
	}
}
