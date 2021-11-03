package Assignment_2;

public class question05
{
 public static void main (String args[])
 {
	 int r,num;
	 int sum;
	 int T=1;
	 
	 while(T<=500)
	 {
		 sum=0;
		 num=T;
		 while(num>0)
		 {
			 r=num%10;
			 sum=(r*r*r)+sum;
			 num=num/10;
		 }
		 if(T==sum)
		 {
			 System.out.println("Armstrong Number Is ="+sum);
	 } 
		 T++;
	 }
 }
}
