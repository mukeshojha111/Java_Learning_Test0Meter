package StringOperations;

public class ReverseStringWithSpaces {

    public static void main(String[] args) {
        String input = "Hello World, Java is awesome!";
        String reversedString = reverseStringWithSpaces(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }

    public static String reverseStringWithSpaces(String input) {
        char[] chars = input.toCharArray();
        int length = chars.length;

        // Reverse the entire string
        reverse(chars, 0, length - 1);

        // Adjust the spaces to their original positions
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                reverse(chars, i + 1, length - 1);
            }
        }

        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}