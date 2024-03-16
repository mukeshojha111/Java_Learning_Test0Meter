package StringOperations;

import java.util.Scanner;

public class StringPermutations {
	public static void main(String[] args) {
        String input = "1253";
        printPermutations(input);
    }

    public static void printPermutations(String str) {
        char[] chars = str.toCharArray();
        int n = chars.length;
        int[] indexes = new int[n];
        int i = 0;

        System.out.println(str); // Print the original string

        while (i < n) {
            if (indexes[i] < i) {
                if (i % 2 == 0) {
                    swap(chars, 0, i);
                } else {
                    swap(chars, indexes[i], i);
                }
                System.out.println(new String(chars));
                indexes[i]++;
                i = 0;
            } else {
                indexes[i] = 0;
                i++;
            }
        }
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}

