package all;
import java.io.*;
import java.util.Scanner;
public class Question_05 
{
	
	public static void main(String args[]) throws IOException
	{
		FileWriter fw=new FileWriter("ram.txt",true);
		
		char ch;
		Scanner s=new Scanner(System.in);
		
		do {
		System.out.println("Enter The Character :");
		ch=s.next().charAt(0);	
		fw.write(ch);
		}while(ch!='q');
		
		System.out.println("AS YOUR ARE ENTERED 'q' SO DATA WRITTING IS STOPPED ");
		fw.close();
		FileReader fr=new FileReader("ram.txt");
		fr.read();
		
		fr.close();
		
	
	}

}
