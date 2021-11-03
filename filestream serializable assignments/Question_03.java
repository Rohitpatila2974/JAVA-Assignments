package all;
import java.io.*;
public class Question_03
{
	
	public static void main(String args[])throws Exception
	{
		FileReader fr=new FileReader("e:\\file1.txt");
		FileWriter f=new FileWriter("e:\\file2.txt"); 
		
		char c[]=new char[100];
		fr.read(c);
		f.write(c);
		System.out.println("DATA IS WRITTEN");
		f.close();
	}

}
