package StringOperations;

import java.util.Scanner;

public class MaxOccurringCharacter {

	public static void main(String[] args) {
        String input = "abcabcabcaabc";
        char maxChar = getMaxOccurringChar(input);
        int maxCount = getMaxOccurrence(input, maxChar);
        System.out.println("Maximum character found: " + maxChar + " with " + maxCount + " occurrences.");
    }

    public static char getMaxOccurringChar(String str) {
        int[] charCount = new int[256]; // Assuming ASCII characters

        // Count occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        // Find the character with maximum occurrence
        int maxCount = 0;
        char maxChar = ' ';
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > maxCount) {
                maxCount = charCount[i];
                maxChar = (char) i;
            }
        }

        return maxChar;
    }

    public static int getMaxOccurrence(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

}
