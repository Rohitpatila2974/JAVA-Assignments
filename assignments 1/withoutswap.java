package DAY02;

public class withoutswap 
{
 public static void main (String[] args)
 {
	 int a=40;
	 int b=30;
	 System.out.println("Before Swapping a= "+a+" b= "+b);
	 a=a+b;
	 b=a-b;
	 a=a-b;
	 System.out.println("After Swapping a= "+a+" b= "+b);
	
 }
}
