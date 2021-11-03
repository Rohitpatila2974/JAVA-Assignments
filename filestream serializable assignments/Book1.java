package all;
import java.io.*;
import java.util.Scanner;

public class Book1 implements Serializable 
{
	String Bname;
	String Aname;
	int Price;
	
	 void getdata()
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter The Name Of Book :");
		 Bname=s.next();
		 System.out.println("Enter The Name Of Author :");
		 Aname=s.next();
		 System.out.println("Enter The Price Of Book :");
		 Price=s.nextInt();	  
	 }
	 void Display()
	 {
		 System.out.println("NAME OF BOOK :"+Bname);
		 System.out.println("NAME OF AUTHOR :"+Aname);
		 System.out.println("PRICE OF BOOK :"+Price);
		 
	 }
	 
	 void count(int y)
	 {
		 System.out.println("\nTOTAL RECORDS OF BOOK :"+y+"\n");
	 }

}
