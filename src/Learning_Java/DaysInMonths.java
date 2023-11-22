package Learning_Java;

import java.util.Scanner;

public class DaysInMonths {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the Number to check No. of Days for the Specific Month");

		int dayNo = userInput.nextInt();

		switch (dayNo) {
		case 1:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is January and its have 31 days.");
			break;

		case 2:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is Feburary and its have 28 or 29 days depending on the Leap Year.");
			break;

		case 3:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is March and its have 31 days.");
			break;
		case 4:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is April and its have 30 days.");
			break;
		case 5:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is May and its have 31 days.");
			break;
		case 6:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is June and its have 30 days.");
			break;
		case 7:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is July and its have 31 days.");
			break;
		case 8:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is August and its have 31 days.");
			break;
		case 9:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is September and its have 30 days.");
			break;
		case 10:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is October and its have 31 days.");
			break;
		case 11:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is Novomber and its have 30 days.");
			break;
		case 12:
			System.out.println("You have entered " + dayNo);
			System.out.println("Month is December and its have 31 days.");
			break;

		default: System.err.println("Please enter valid number between 1 to 12.");
		}
	}

}
