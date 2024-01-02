package Learning_Java;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the number to check for Pallindrome");
		
		int num = userInput.nextInt();
		
		int remainder, reverse=0, temp=0;
		
		temp =  num;
		
		while(temp!=0){
			remainder = temp%10;
			reverse =  reverse * 10 + remainder;
			temp = temp/10;
		}
		System.out.println("Reverse of the "+num+" is : "+reverse);
		
		if(reverse==num)
		{
			System.out.println("Pallindrome");
		}
		else
			System.out.println("Not Pallindrome");
			
	}
}