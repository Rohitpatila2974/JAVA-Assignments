package Assignment_2;

public class pattern_question7_v 
{
  public static void main(String args[])
  {
	  int i,j,k;
	  int n=0;
	  
	  for(i=1; i<=9; i++)
	  {
		  n++;
		  for(j=i; j<9; j++)
		  {
			  System.out.print(" ");
		  }
	 
	  for(k=1; k<=i; k++)
	  {
		  System.out.print(n);
	  }
	  System.out.println();
	  i=i+1;
	  
  }
}
}


