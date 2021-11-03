package Assignment_03;
import java.util.*;
public class question_10
{
public static void main(String args[])
{
	int a[][]= {{10,11}, {1,2}};
	int b[][]= {{15,16}, {4,5}};
	
	Scanner s=new Scanner (System.in);
	System.out.println("1.Addition of Matrix");
	System.out.println("2.Multiplication Of Matrix");
	System.out.println("3.Exit");
	System.out.println("Enter The Choice");
	int choice=s.nextInt();
	int c[][]=new int [2][2];
	
	switch(choice) {
	case 1:
		System.out.println("Addition Of Matrix :");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
			 c[i][j]=a[i][j]+b[i][j];
			 System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		break;
	case 2:
		System.out.println("Multiplication of Matrix");
		
		 for(int i=0; i<2; i++)
		 {   
			 for(int j=0; j<2; j++)
			 {
				 int sum=0;
				 for(int k=0; k<2; k++)
				 {
				c[i][j]+=a[i][k]*b[k][j];
				 }
				 sum=c[i][j];
			 }
			
		 }
		 for(int i=0; i<2; i++)
		 {
			 for(int j=0; j<2; j++)
			 {
				 System.out.print(c[i][j]+" ");
			 }
			 System.out.println();
		 }
		break;
	
	case 3:
		System.out.println("Exit");
		break;
	}
	
}
}
