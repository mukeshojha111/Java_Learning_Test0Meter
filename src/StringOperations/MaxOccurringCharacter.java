package StringOperations;

import java.util.Scanner;

public class MaxOccurringCharacter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        char maxChar = findMaxOccurringCharacter(input);

        System.out.println("Maximum occurring character: " + maxChar);
    }

    private static char findMaxOccurringCharacter(String input) {
        final int ASCII_SIZE = 256; // Assuming ASCII characters

        int[] charCount = new int[ASCII_SIZE];

        for (int i = 0; i < input.length(); i++) {
            charCount[input.charAt(i)]++;
        }

        char maxChar = '\0';
        int maxCount = 0;

        for (int i = 0; i < ASCII_SIZE; i++) {
            if (charCount[i] > maxCount) {
                maxChar = (char) i;
                maxCount = charCount[i];
            }
        }

        return maxChar;

	}

}
