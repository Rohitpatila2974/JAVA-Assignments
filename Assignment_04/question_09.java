package Assignment_04;
import java.util.*;
public class question_09
{
	int x;
	int y;
	int result;
	int res;
	
	int fun(int x)
	{
		return result=x*x;
	}
	
	int fun(int X, int Y)
	{
		return res=X*X+Y*Y;
	}
	
	
	public static void main(String args[])
	{
		Scanner st=new Scanner(System.in);
		question_09 s=new question_09();
		System.out.println("Enter The Number To Square :");
		int x=st.nextInt();
		System.out.println("Square of The Number Is :"+s.fun(x));
		System.out.println("Enter The Value Of X :");
		int X=st.nextInt();
		System.out.println("Enter The Value Of Y :");
		int Y=st.nextInt();
		System.out.println("Result X2+Y2 Is :"+s.fun(X,Y));
		
		
		
		
		

		
		
	}

}
