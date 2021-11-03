package Assignment_04;
import java.util.*;
public class room 
{
	int roomNo;
	String roomType;
	int roomArea;
	String acmachine;
	 
	void setdata()
	{
		this.roomNo=40;
		this.roomType="Single";
		this.roomArea=1000;
		this.acmachine= "AC";
		
		
	}
	void displaydata()
	{
		System.out.println("Room Number :"+this.roomNo);
		System.out.println("Room Type :"+roomType);
		System.out.println("Room Area in sq. feet :"+roomArea);
		System.out.println("ROOM AC OR NON AC :"+acmachine);
	}
	
	
 public static void main(String args[])
 {
	  room s=new room();
	  s.setdata();
	  s.displaydata();
	  
	 
 }
}
