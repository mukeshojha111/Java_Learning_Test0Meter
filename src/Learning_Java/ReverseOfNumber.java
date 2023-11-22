package Learning_Java;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the Number to reverse it");		
		int num = userInput.nextInt();
		int temp = num;
		int rev=0, rem=0;
		
		while(temp!=0) 
		{
		  rem = temp%10;
		  rev = rev * 10 + rem;
		  temp = temp/10;	
		}
		System.out.println("Reverse of Number "+num+" is "+rev);
      
	}

}
