package ArraysPrograms;
import static java.lang.System.*;
class Emp2
{ 
	int eno;
    String ename;
    float sal;
    void setEno(int eno)
  {
    	this.eno=eno;
  }
     //this means present object
       void setEname(String ename)
  {     
    	   this.ename=ename;
  }
      //this means present object
         void setSal(float sal)
  {
        	 this.sal=sal;
  }
    void display()
   {   
    	out.println("Emp details");

    	out.println("Eno:\t"+eno);
 
    	out.println("Ename:\t"+ename);

    	out.println("Sal:\t"+sal);
    }
  }
      class ArrayOfObjects
   { 
    	  public static void main(String args[])
   { 
    		  Emp2 e1=new Emp2();
              e1.setEno(101);
              e1.setEname("Madhu");
              e1.setSal(30000.00f);
              
              
         Emp2 e2=new Emp2();
         e2.setEno(102);
         e2.setEname("Shekar");
         e2.setSal(40000.00f);
         Emp2 e[]=new Emp2[2];
         e[0]=e1;
         e[1]=e2;
         out.println("Elements in an array ....");
        for(Emp2 emp:e)
    {      
        	emp.display();
    }
  }
}
