package Assignment_03;

public class question_11
{
 public static void main(String args[])
 {
	 int a[]= {1,2,3,5};
	 
	 int n=a.length+1;
	 int sum=n*(n+1)/2;
	 for(int i=0; i<a.length; i++)
	 {
        sum=sum-a[i];
	 }
	 
	 System.out.println("Missing Number Is ="+sum);
 }
}

