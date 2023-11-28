package Learning_Java;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the three numbers..");
		
		int num1 = userInput.nextInt();
		int num2 = userInput.nextInt();
		int num3 = userInput.nextInt();
		
		if(num1>num2 && num1 >num3)
		{
			System.out.println(num1+" is Greater..");
		}
		else if(num2>num1 && num2 >num3)
		{
			System.out.println(num2+" is Greater..");
		}

	}

}
