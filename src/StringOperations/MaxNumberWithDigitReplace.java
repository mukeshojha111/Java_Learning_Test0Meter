package StringOperations;

import java.util.Scanner;

public class MaxNumberWithDigitReplace {
	
	private static int findMaxNumberWithDigitReplace(int number, int digit) {
        int maxNumber = Integer.MIN_VALUE;

        String numStr = Integer.toString(number);
        int numLength = numStr.length();

        for (int i = 0; i < numLength; i++) {
            if (numStr.charAt(i) == Character.forDigit(digit, 10)) {
                int replacedNum = Integer.parseInt(numStr.substring(0, i) + numStr.substring(i + 1));

                if (replacedNum > maxNumber) {
                    maxNumber = replacedNum;
                }
            }
        }

        return maxNumber;
    }

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.println("Enter a digit to replace:");
        int digit = scanner.nextInt();

        int maxNumber = findMaxNumberWithDigitReplace(number, digit);

        System.out.println("Maximum number after digit replace: " + maxNumber);
	}

}
