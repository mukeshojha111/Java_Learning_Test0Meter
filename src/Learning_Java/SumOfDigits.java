package Learning_Java;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the Number to Find the Sum of its Digits");		
		int num = userInput.nextInt();
		int temp = num;
		int sum=0, rem=0;
		
		while(temp!=0) 
		{   
			rem = temp%10;
			sum = sum + rem;
			temp =  temp/10;
	
		}
		System.out.println("Sum of Digits are: "+sum);
      

	}

}
