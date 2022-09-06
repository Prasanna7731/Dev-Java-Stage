package ProductDeteails;
import java.util.Scanner;
import java.util.Scanner.*;
class Product{
	
 String Pcode;
 String Pname;
 String Pbrand;
 int Pprice;
 int Pquantity;
 
   Product( String a,String b,String c,int d,int e)
   {
	   Pcode=a;
	   Pname=b;
	   Pbrand=c;
	   Pprice=d;
	   Pquantity=e;
	   
   }
   void getProductDetails1() {
	   
	    System.out.println(" The Product Code:"+Pcode);
	    System.out.println(" The Product Name:"+Pname);
	    System.out.println(" The Product Brand:"+Pbrand);
	    System.out.println(" The Product Price:"+Pprice);
	    System.out.println(" The Product Quantity:"+Pquantity);  
	    
   }
 
}
public class ProductDeteails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter The Product Code:");
        String Pc=Sc.nextLine();
        System.out.println("Enter The Product Name:");
        String Pn=Sc.nextLine();
        System.out.println("Enter The Product Brand:");
        String Pb=Sc.nextLine();
        System.out.println("Enter The ProductPrice:");
        int Pp=Sc.nextInt();
	    System.out.println("Enter The Product Quantity:");
        int Pq=Sc.nextInt();
        Product p=new Product(Pc,Pn,Pb,Pp,Pq);
        p.getProductDetails1();
	}
}
