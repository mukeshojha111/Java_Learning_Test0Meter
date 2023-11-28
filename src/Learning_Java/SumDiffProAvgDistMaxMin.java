package Learning_Java;

import java.util.Scanner;

public class SumDiffProAvgDistMaxMin {

	public static void main(String[] args) {
        
		Scanner userInput = new Scanner(System.in);
		
	    System.out.println("Enter the first Number");
	    double number1 = userInput.nextDouble();
	    
	    System.out.println("Enter the first Number");
	    double number2 = userInput.nextDouble();
	    
	    double sum = number1 + number2;
	    System.out.println("Sum: "+sum);
	    
	    double difference;
	    if(number1>number2)
	    {
	    	difference = number1 - number2;
	    }
	    else
	    {
	    	difference = number2 - number1;
	    }
	    
	    System.out.println("Difference: "+difference);
	    
	    
	    double product = number1 * number2;
	    System.out.println("Product: "+product);
	    
	    double avrg = (number1+number2)/2;
	    System.out.println("Average: "+avrg);
	    
	    double distance;
	    if(number1>number2)
	    {
	    	distance = number1 - number2;
	    }
	    else
	    {
	    	distance = number2 - number1;
	    }
	    System.out.println("Distance: "+distance);
	    
	    if(number1>number2)
	    {
	    	System.out.println("Max: "+number1);
	    }
	    else
	    {
	    	System.out.println("Max: "+number2);
	    }
	    
	    if(number1>number2)
	    {
	    	System.out.println("Min: "+number2);
	    }
	    else
	    {
	    	System.out.println("Min: "+number1);
	    }
	    

	}

}
