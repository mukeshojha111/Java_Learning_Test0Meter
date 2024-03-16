package Learning_Java;

import java.util.Scanner;

public class Pallindrome2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    public static boolean checkPalindrome(String input) {
        input = input.replaceAll("\\s+", ""); // Remove whitespace

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
