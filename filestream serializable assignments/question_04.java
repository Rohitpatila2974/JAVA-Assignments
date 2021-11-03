package all;

import java.io.*;

public class question_04 
{
	
	public static void main(String args[])
	{
		
		try {
			FileWriter fw=new FileWriter("length.txt");
			fw.write("ROHIT PATIL");
			fw.close();
			
			FileReader fr=new FileReader("length.txt");
			
			int i=0;
			int count=0;
			
			while((i =fr.read())!=-1)
			{
				
				count++;
			}
			
			System.out.println("total numbers of character in file is :"+count);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

}
