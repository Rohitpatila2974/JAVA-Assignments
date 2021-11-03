package Assignment_03;

public class question_12 
{
 public static void main(String args[])
 {
	 int a[]= {12,20,27,45,30,70};
	 int max=a[0];
	 for(int i=1; i<6; i++)
	 {
		 if(a[i]>max)
		 {
			 max=a[i];
		 }
	 }
	 int min=a[0];
	 for(int i=1; i<6; i++)
	 {
		 if(a[i]<min)
		 {
			 min=a[i];
		 }
	 }
	 
	 System.out.println("The Difference Between Largest & Smallest Value In Array Is ="+(max-min));
 }
}
