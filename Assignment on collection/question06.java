package Assignment_Collection;
import java.util.*;
public class question06
{
	
	public static void main(String args [])
	{
		
		LinkedList<String> a=new LinkedList<String>();
		a.add("ROHIT");
		a.add("SAYALI");
		a.add("ABHINANDAN");
		a.add("ROHINI");
		a.add("CHAITALEE");
		
		LinkedList<String> b=new LinkedList<String>();
		b.add("ROHIT");
		b.add("SAYALI");
		b.add("ADITYA");
		b.add("RAKESH");
		b.add("CHAITALEE");
		b.add("VED");
		
		LinkedList<String> c=new LinkedList<String>();
		
		for(String e :b)
			
			c.add(a.contains(e) ? "a and b contains same Element" : "a and b contains different Elements");
			
		
		System.out.println(c);
		
		System.out.println("Traversed Elements :");
		
		Iterator i=c.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
