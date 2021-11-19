package Assignment_Collection;
import java.util.*;
public class Ticket 
{
	
	public static void main(String args[])
	{
		helpdeskcomparator c=new helpdeskcomparator();
		
		PriorityQueue<HelpDesk> p=new PriorityQueue(c);
		
		p.add(new HelpDesk(12345,"NEED HELP FOR RESETING PASSWORD",1));
		p.add(new HelpDesk(78945,"SLOW INTERNET CONNECTION",2));
		p.add(new HelpDesk(34587,"USB NOT RECOGNIZED",4));
		p.add(new HelpDesk(24689,"RECOVER UNSAVED DOCUMENTS",3));
		p.add(new HelpDesk(547892,"RECOVER LOST AND DELETED FILES",5));
		
		
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		System.out.println(p.poll());
		
		
	}
	

}
