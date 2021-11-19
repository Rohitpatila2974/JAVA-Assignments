package Assignment_Collection;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
public class question3 
{
	
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Book b1=new Book("MARATHI",400,"R K KUMBHAR");
		Book b2=new Book("HINDI",500,"R V KANETKAR");
		Book b3=new Book("ENGLISH",850,"M V PATIL");
		Book b4=new Book("MATHS",450,"S S YADAV");
		Book b5=new Book("DESIGN",600,"NIRALI PRAKASHAN");
		
		ArrayList<Book> ab=new ArrayList<Book>();
		ab.add(b1);
		ab.add(b2);
		ab.add(b3);
		ab.add(b4);
		ab.add(b5);
		
	    /*Iterator i=ab.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	   */
		
		
		Iterator <Book> i=ab.iterator();
		
		
		while(i.hasNext())
		{
			System.out.println(i.next().bname);
		}
		
		
		
		
	}

}
