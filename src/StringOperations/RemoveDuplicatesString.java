package StringOperations;

import java.util.Scanner;

public class RemoveDuplicatesString {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input a string
	        System.out.println("Enter a string:");
	        String inputString = scanner.nextLine();

	        // Remove duplicates from the string
	        String resultString = removeDuplicates(inputString);

	        // Display the string without duplicates
	        System.out.println("String without duplicates: " + resultString);

	        scanner.close();
	    }

	    private static String removeDuplicates(String input) {
	        StringBuilder result = new StringBuilder();
	        boolean[] seen = new boolean[256]; // Assuming ASCII characters

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);

	            // If the character is not seen before, append it to the result
	            if (!seen[currentChar]) {
	                result.append(currentChar);
	                seen[currentChar] = true;
	            }
	        }

	        return result.toString();
	    }
}
