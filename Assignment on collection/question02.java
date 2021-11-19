package Assignment_Collection;
import java.util.*;
public class question02 
{
	
	public static void main(String args [])
	{
		
		Vector<Integer> v=new Vector<Integer>();
		
		for(int i=1; i<=20; i++)
		{
			if(i%2==0)
			{
				v.add(i);
				
			}
		}
		System.out.println(" Even Number Between 1 To 20 Are :"+v);
	}

}
