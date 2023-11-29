package Learning_Java;

public class DivisibleByThreeFiveBoth {

	public static void main(String[] args) {
		
		int number = 100;
		
		System.out.print("Number Divisible by 3 are: ");
		for(int i=1; i<=number; i++)
		{
			if(i%3==0)
			{
				System.out.print(i+"|");
			}
			else { 
				System.out.print("");
			}
		}
			System.out.println(" ");
			System.out.print("Number Divisible by 5 are: ");
			for(int j=1; j<=number; j++)
			{
				if(j%5==0)
				{
					System.out.print(j+"|");
				}
				else { 
					System.out.print("");
				}
			
		}
			
			System.out.println(" ");
			System.out.print("Number Divisible by 3 and 5 are: ");
			for(int k=1; k<=number; k++)
			{
				if(k%3==0 && k%5==0)
				{
					System.out.print(k+"|");
				}
				else { 
					System.out.print("");
				}
		}
	}
	}
	