package DAY02;

public class gradesystem 
{
	public static void main (String[] args)
	{
		int marks=40;
		
		if(marks>80)
		{
			System.out.println("A");
		}
		else if(60<=marks && marks<80)
		{
			System.out.println("B");
		}
		else if(50<=marks && marks<60)
		{
			System.out.println("c");
		}
			else if(45<=marks && marks<50)
			{	
				System.out.println("D");
			}
				else if(20<=marks && marks<45)
				{
					System.out.println("E");
				}
					else 
					{
						System.out.println("f");
					}
				}


	}
	

