package Assignment_04;

public class student 
{String sname;
int roll_no;

void student(String sname, int R)
{
	  this.sname=sname;
	  this.roll_no=R;
	  
}

void display()
{
	  System.out.println("Name:"+this.sname);
	  System.out.println("Roll Number:"+this.roll_no);
}

}