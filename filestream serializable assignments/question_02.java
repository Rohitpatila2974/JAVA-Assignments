package all;
import java.io.*;
public class question_02 
{
	
	
	public static void main(String args[])
	{
		File f=new File("FileProperties.txt");
		
		try {
			
			f.createNewFile();
		} catch(Exception e)
		{
			System.out.println(" Can Not Creat File");
		}
		
		try {
			
			FileWriter fw=new FileWriter("FileProperties.txt");
			fw.write("FILE PROPERTIES");
			fw.close();
		} catch (Exception r)
		{
			r.printStackTrace();
		}
		
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.exists());
		System.out.println(f.getName());
		System.out.println(f.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.length());
		System.out.println(f.lastModified());
		
		
	}
	

}
