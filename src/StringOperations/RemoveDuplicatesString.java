package StringOperations;

import java.util.Scanner;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input string: ");
        String input = scanner.nextLine();
        scanner.close();

        String result = removeDuplicates(input);
        System.out.println("Output: " + result);
    }

    public static String removeDuplicates(String input) {
        char[] chars = input.toCharArray();
        int length = chars.length;
        int tail = 1;

        for (int i = 1; i < length; ++i) {
            int j;
            for (j = 0; j < tail; ++j) {
                if (chars[i] == chars[j]) break;
            }
            if (j == tail) {
                chars[tail] = chars[i];
                ++tail;
            }
        }

        return new String(chars, 0, tail);
    }
}
