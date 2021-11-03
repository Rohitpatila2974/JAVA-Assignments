package Assignment_04;
import java.util.*;
public class addition 
{int x;
int a;
int b;
int y;
int z;


   int add(int x, int y)
   {
	   z=x+y;   
	return z;   
   }
	
   int add(int x, int y, int a)
   {
	   z=x+y+a;
	   return z;
   }
   
   int add(int x, int y, int a, int b)
   {

	   z=x+y+a+b;
	   return z;
   }
   
   public static void main(String args[])
   {
	   addition st=new addition();
	  System.out.println("Addition of Two Integers :"+st.add(15, 10));
	  System.out.println("Addition of Two Integers :"+st.add(25, 12, 25));
	  System.out.println("Addition of Two Integers :"+st.add(15, 10, 15, 40));
   }
}
