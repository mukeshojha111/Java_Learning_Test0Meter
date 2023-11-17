package Learning_Java;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the number between 1 to 7");
		
		int dayNum = userInput.nextInt();
		
		if(dayNum==1)
		{
			System.out.println(dayNum+" - is Monday");
		}
		else if(dayNum==2)
		{
			System.out.println(dayNum+" - is Tuesday");
		}
		else if(dayNum==3)
		{
			System.out.println(dayNum+" - is Wednesday");
		}
		else if(dayNum==4)
		{
			System.out.println(dayNum+" - is Thursday");
		}
		else if(dayNum==5)
		{
			System.out.println(dayNum+" - is Friday");
		}
		else if(dayNum==6)
		{
			System.out.println(dayNum+" - is Saturday");
		}
		else if(dayNum==7)
		{
			System.out.println(dayNum+" - is Sunday");
		}
		else if(dayNum<1 || dayNum>7)
		{
			System.err.println("Enter valid number between 1 to 7");
		}
	}
}
