package StringOperations;

import java.util.Scanner;

public class MergeStrings {
	
	private static String mergeStrings(String str1, String str2) {
        // Find the minimum length of the two strings
        int minLength = Math.min(str1.length(), str2.length());

        // StringBuilder to build the merged string
        StringBuilder mergedStringBuilder = new StringBuilder();

        // Merge strings character by character
        for (int i = 0; i < minLength; i++) {
            mergedStringBuilder.append(str1.charAt(i));
            mergedStringBuilder.append(str2.charAt(i));
        }

        // If one string is longer than the other, append the remaining characters
        if (str1.length() > minLength) {
            mergedStringBuilder.append(str1.substring(minLength));
        }

        if (str2.length() > minLength) {
            mergedStringBuilder.append(str2.substring(minLength));
        }

        // Convert StringBuilder to String and return
        return mergedStringBuilder.toString();
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        // Merge the strings index-wise
        String mergedString = mergeStrings(str1, str2);

        // Display the merged string
        System.out.println("Merged String: " + mergedString);

        scanner.close();
}
}