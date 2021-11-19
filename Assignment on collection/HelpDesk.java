package Assignment_Collection;

import java.util.Comparator;

public class HelpDesk 
{
	int ID;
	String Desc;
	int Priorityno;
	
	public HelpDesk(int iD, String desc, int priorityno)
	{
		super();
		ID = iD;
		Desc = desc;
		Priorityno = priorityno;
	}

	@Override
	public String toString() {
		return "HelpDesk [ID=" + ID + ", Desc=" + Desc + ", Priorityno=" + Priorityno + "]";
	}
	
}
	
 class helpdeskcomparator implements Comparator<HelpDesk>
 {

	@Override
	public int compare(HelpDesk o1, HelpDesk o2) 
	{
		
		return o1.Priorityno - o2.Priorityno;
	}
	 
	
	

}
