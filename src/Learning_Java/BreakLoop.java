package Learning_Java;

import java.util.Scanner;

public class BreakLoop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Integer values");
		
		int value = sc.nextInt();
		
		while(true)
		{
			if(value<0) {
				System.out.println("Entered value is less than 0.");
				break;
			}
				System.out.println("Entered value is: "+value);
		}
		sc.close();
	}

}
