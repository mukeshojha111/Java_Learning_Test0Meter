package Learning_Java;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
	    System.out.println("Enter the Number to check whether it is Postive or Negative..");
	    
	    int number = userInput.nextInt();
	    
	    if(number>0)
	    {
	    	System.out.println("Number is Positive: "+number);
	    }
	    else if(number<0)
	    {
	    	System.out.println("Number is Negative: "+number);
	    }
	    else if(number==0)
	    {
	    	System.out.println("Number is neither Postive nor Negative: "+number);
	    }
	}

}
