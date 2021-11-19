package Assignment_Collection;
import java.io.Serializable;
import java.util.*;
public class Book implements Serializable
{
	String bname;
	int price;
	String aname;
	
	public Book(String n, int p, String a)
	{
		this.bname=n;
		this.price=p;
		this.aname=a;
	}

	@Override
	public String toString() {
		return "Book [bname=" + bname + ", price=" + price + ", aname=" + aname + "]";
	}
	
	
	

}
