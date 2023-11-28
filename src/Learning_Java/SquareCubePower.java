package Learning_Java;

import java.util.Scanner;

public class SquareCubePower {

	public static void main(String[] args) {
		
        Scanner userInput = new Scanner(System.in);
		
	    System.out.println("Enter the Number to calculate Square,Cube and 4th Power...");
	    
	    double number = userInput.nextDouble();
	    
	    double squareOfNumber = number * number;
	    
	    double cubeOfNumber = number * number * number;
	    
	    double forthPowOfNumber = number * number * number  * number;
	    
	    System.out.println("Square: "+squareOfNumber);
	    System.out.println("Cube: "+cubeOfNumber);
	    System.out.println("Forth Power: "+forthPowOfNumber);

	}

}
