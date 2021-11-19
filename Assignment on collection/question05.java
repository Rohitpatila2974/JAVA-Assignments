package Assignment_Collection;
import java.util.*;
public class question05 
{
	
	
	public static void main(String args[])
	{
		TreeSet<String> t=new TreeSet<String>();
		t.add("RED");
		t.add("GREEN");
		t.add("VOILET");
		t.add("YELLOW");
		t.add("BLUE");
		t.add("BLACK");
		
		
		System.out.println("In TreeSet The Elements Will Come In Acending Order :"+t);
		
		Iterator i=t.iterator();
		System.out.println("Traversed Elements Are :");
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
