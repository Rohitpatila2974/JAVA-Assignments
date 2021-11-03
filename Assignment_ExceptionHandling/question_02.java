package Assignment_ExceptionHandling;

public class question_02 
{
	int x=20;
	String s="Name";
	
	question_02()
	{
		System.out.println("1.this() is used to call default constructor");
		System.out.println("2. it is aslo used to show the current class variable and instance variable are same for e.g this.a=a");
		System.out.println("3.this keyword is used for current object ");
	}
	
	question_02(int x)
	{
		this();
		System.out.println(this.x);
		System.out.println(x);
	}
	
	public static void main(String args[])
	{
		question_02 s=new question_02(10);	
	}

}
