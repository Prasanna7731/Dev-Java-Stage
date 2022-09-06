package BookDetails;
	import java.util.Scanner;
	class BookDetails1 //SubClass
	{
		String bCode,bName,bAuthor;
		float bPrice;
		int bQty;
		void setBookDetails(String a,String b,String c,float d,int e)
			//Non-return_type Instance method with parameters
		   //a,b,c,d and e are Local variables
		{
			bCode=a;
			bName=b;
			bAuthor=c;
			bPrice=d;
			bQty=e;
		}
		void getBookDetails()//Non-return_type Instance method without parameters
		{
			System.out.println("=====Display BookDetails=====");
			System.out.println("BookCode:"+bCode);
	        System.out.println("BookName:"+bName);
	        System.out.println("BookAuthor:"+bAuthor);
	        System.out.println("BookPrice:"+bPrice);
	        System.out.println("BookQty:"+bQty);
		}
	}
	class BookDetails  //MainClass 
	{
		public static void main(String[] args) 
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the BookCode:");
			String bC = s.nextLine();
	        System.out.println("Enter the BookName:");
			String bN = s.nextLine();
			System.out.println("Enter the BookAuthor:");
			String bA = s.nextLine();
			System.out.println("Enter the BookPrice:");
			float bP = s.nextFloat();
			System.out.println("Enter the BookQty:");
			int bQ = s.nextInt(); //bC,bN,bA,bP and bQ are Local variables
	        BookDetails1 bd = new BookDetails1();//Object Creation

			bd.setBookDetails(bC,bN,bA,bP,bQ);//method_call_with_para_passing
			bd.getBookDetails();//method_call_with_out_para_passing
		}
	}


