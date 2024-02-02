package StringOperations;

import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        System.out.println("Permutations of the string:");
        printPermutations("", input);
    }

    private static void printPermutations(String prefix, String remaining) {
        int n = remaining.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                printPermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, n));
            }
        }
    }
}

