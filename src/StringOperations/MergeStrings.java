package StringOperations;

import java.util.Scanner;

public class MergeStrings {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Merge the strings in the specified pattern
        String mergedString = mergeStrings(str1, str2);

        System.out.println("Merged String: " + mergedString);

        scanner.close();
    }
    
    private static String mergeStrings(String str1, String str2) {
        // Calculate the length of the merged string
        int mergedLength = str1.length() + str2.length();

        // Create a character array to hold the merged string
        char[] mergedArray = new char[mergedLength];

        int index = 0;

        // Merge the strings in the specified pattern
        for (int i = 0; i < str1.length() || i < str2.length(); i++) {
            if (i < str1.length()) {
                // Add character from the first string
                mergedArray[index++] = str1.charAt(str1.length() - 1 - i);
            }

            if (i < str2.length()) {
                // Add character from the second string
                mergedArray[index++] = str2.charAt(str2.length() - 1 - i);
            }
        }

        // Create a new string from the merged array
        return new String(mergedArray);
    }
}