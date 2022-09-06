package AbstractionDemo2;
import static java.lang.System.*;
import java.util.*;
   abstract class Search
    { 
	     int arr[]=new int[10];
          void read()
            {
    	       Scanner s=new Scanner(in);
               out.println("Enter "+arr.length+" Elements");
               for(int i=0;i<arr.length;i++)
                 {
            	    arr[i]=s.nextInt();
                 }
            }
                abstract boolean find(int n);
       }
     class Find extends Search
       {
    	  public boolean find(int n)
             {
    		    boolean flag=false;
                for(int i=0;i<arr.length;i++)
                     { 
                	    if(arr[i]==n)
                            {
                               flag=true;
                               break;
                            }
                     }
                         return flag;
              }
       }
   /** class Find2 extends Search
       {
    	    public boolean find(int n)
             {
    	    	boolean flag=false;
                for(int v:arr)
                   {
                	if(v==n)
                        {
                          flag=true;
                          break;
                        }
                    }
                         return flag; 
              }
        }**/
    class Usage
          {
    	     public static void main(String args[])
              {
    	    	 Find f=new Find();
                 f.read();
                 out.println("Eneter element to found");
                 int n=new Scanner(in).nextInt();
                 if(f.find(n))
                 out.println("Element found...");
                   else
                 out.println("Element Not found...");
              }
         } 

