package DAY02;
import java.util.*;
public class perimeter_reactangle
{
	public static void main(String args[])
	{
		int a;
		int b;
			
		Scanner s=new Scanner (System.in);
	
		Scanner r=new Scanner(System.in);
		System.out.print("value of a=");
		a=s.nextInt();
		System.out.print("value of b=");
		b=s.nextInt();
		
		System.out.print("Perimeter of Reactangle= "+(2*a+2*b));
		
	}

}
