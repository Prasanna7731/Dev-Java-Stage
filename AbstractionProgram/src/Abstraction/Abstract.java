package Abstraction;
import static java.lang.System.*;
abstract class Bank
  {  
   float minBal=500.00f;
   void openAccount()
    { 
	  out.println("Account is created..");
     }
  abstract void withdraw();
  abstract void deposit();
 }
   //concreate class
 class CityBank extends Bank
 {
   void withdraw()
      {  
	    out.println("withdra...");
      }
   void deposit()
      {
	    out.println("deposit...");
      }
 }
   class Abstract
   {
	    public static void main(String args[])
      {
		CityBank cb=new CityBank();
        cb.openAccount();
        cb.deposit();
        cb.withdraw();
        //upcasting
       // Bank b=cb;
       // Bank b=new CityBank();
       // b.openAccount();
        //b.deposit();
        //b.withdraw();
      }
   }



