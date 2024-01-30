package StringOperations;

import java.util.Scanner;

public class RemoveAlphabetsAndSumNumbers {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.println("Enter a string containing alphabets and numbers:");
        String inputString = scanner.nextLine();

        // Remove alphabets and sum numbers
        int sumOfNumbers = removeAlphabetsAndSumNumbers(inputString);

        // Display the sum of numbers
        System.out.println("Sum of numbers in the string: " + sumOfNumbers);

        scanner.close();
    }

    private static int removeAlphabetsAndSumNumbers(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(currentChar)) {
                // If it's a digit, add it to the sum
                sum += Character.getNumericValue(currentChar);
            }
        }

        return sum;
    }
}
