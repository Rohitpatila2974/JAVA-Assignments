package Assignment_Collection;
import java.util.*;
public class question01 
{
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add("ROHIT");
		v.add("SAYALI");
		v.add("ABHINANDAN");
		v.add("VED");
		v.add("ROHINI");
		v.add("CHAITALEE");
		v.add(null);
		System.out.println("1. Adding Elements "+v);
		
		Iterator i=v.iterator();
		
		System.out.println("2. Traversing Vector Element :");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("3. Vector Object Hashcode "+v.hashCode());
		
		System.out.println("4. Particular Element :"+v.get(1));
		
		System.out.println("5. Size Of Vector :"+v.size());
		System.out.println("5. Capacity Of Vector :"+v.capacity());
		
		System.out.println("6. Add Null Data in Vector :"+v.lastElement());
		
		System.out.println("7. Index Value Of Null Element :"+v.indexOf(null));
		
		v.insertElementAt("SANAJY", 5);
		
		System.out.println("8. Element Add At 5 Position :"+v.get(5));
		
		v.remove(3);
		
		System.out.println("9. Removed Ved From Object :"+v.get(3));
		
		
	}

}
