package StringOperations;

import java.util.Scanner;

public class PenultimateWordFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a sentence
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();

        // Find and print the penultimate word
        String penultimateWord = findPenultimateWord(sentence);
        System.out.println("The penultimate word is: " + penultimateWord);

        scanner.close();
    }

    private static String findPenultimateWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split("\\s+");

        // Check if there are at least two words in the sentence
        if (words.length < 2) {
            System.out.println("The sentence should have at least two words.");
            return "";
        }

        // Return the penultimate word
        return words[words.length - 2];
    }
}