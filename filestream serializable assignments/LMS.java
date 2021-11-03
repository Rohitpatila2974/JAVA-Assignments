package all;
import java.io.*;
class append extends ObjectOutputStream
{

	public append(OutputStream out) throws IOException 
	{
		super(out);
	}
	
	protected void writeStreamHeader()
	{
		
	}
		
}

public class LMS 
{
	public static void main(String args[]) throws Exception
	{
		Book1 b=new Book1();
		b.getdata();
		
		File f=new File("Book4.ser");
		
		FileOutputStream fi=new FileOutputStream("Book4.ser",true);
		
		if(f.length()<=0)
		{
			ObjectOutputStream o=new ObjectOutputStream(fi);
			o.writeObject(b);
		}
		else
		{
			append a=new append(fi);
			a.writeObject(b);	
		}
		
		System.out.println("BOOKS STORED IN LIBRARY");
		
		try {
			FileInputStream i=new FileInputStream("Book4.ser");
			ObjectInputStream oi=new ObjectInputStream(i);
			int count=0;
			do {
				
				b=(Book1)oi.readObject();
				b.Display();
				count++;
				b.count(count);
			   }while(b!=null);
			   oi.close();
			   
		    } catch (Exception e)
		{
			System.out.println("THANK YOU FOR VISITING OUR LIBRARY");
		}
		
		
	}

	
	
	
}
