package Assignment_04;
import java.util.*;
public class question_11 
{
	float x;
	int n;
	double result;
	
	float pow(float x)
	{
		return x;
	}
	int pow(int n)
	{	
		return n;	
	}
	
	double pow(float x, int n)
	{
		result=Math.pow(x, n);
		return result;
	}
	
	public static void main(String args[])
	{
		
		question_11 s=new question_11();
		Scanner st=new Scanner (System.in);
		System.out.println("Enter The Number :");
		 float x=st.nextFloat();
		 System.out.println("Number :"+s.pow(x));
		System.out.println("Enter The Power :");
		int n=st.nextInt();
		System.out.println("power :"+s.pow(n));
		System.out.println("Result :"+s.pow(x, n));	
	}

}
