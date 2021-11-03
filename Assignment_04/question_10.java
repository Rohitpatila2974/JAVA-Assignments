package Assignment_04;
import java.util.*;
public class question_10
{
	int x;
	int y;
	int result;
	float res;
	float a;
	float b;
	
	int  min(int x, int y)
	{
		result=Math.min(x, y);
		return result;
	}
	
	float min(float a, float b)
	{
		res=Math.min(a, b);
		return res;			
	}

	public static void main(String args[])
	{
		question_10 r=new question_10();
		Scanner s=new Scanner (System.in);
		System.out.println("Enter The 1st Number :");
		int x=s.nextInt();
		System.out.println("Enter The 2nd Number :");
		int y=s.nextInt();
		System.out.println("Minimum Number Between Given Integer Number Is:"+r.min(x, y));
		System.out.println("Enter The 1st Number :");
		float a=s.nextFloat();
		System.out.println("Enter The 2nd Number :");
		float b=s.nextFloat();
		System.out.println("Minimum Number Between Given Float Number Is:"+r.min(a, b));
		
	}
}
