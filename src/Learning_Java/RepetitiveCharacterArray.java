package Learning_Java;

public class RepetitiveCharacterArray {
	
	private static String findRepetitiveCharacters(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int count = 1;

            // Check for consecutive repetitive characters
            while (i < input.length() - 1 && input.charAt(i + 1) == currentChar) {
                count++;
                i++;
            }

            result.append(currentChar);
            if (count > 1) {
                result.append(count);
            }
        }

        return result.toString();
    }

	public static void main(String[] args) {
		String input1 = "aabbbcaabbc";
        String result1 = findRepetitiveCharacters(input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + result1);

        String input2 = "abcd";
        String result2 = findRepetitiveCharacters(input2);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + result2);

        String input3 = "aabccd";
        String result3 = findRepetitiveCharacters(input3);
        System.out.println("Input: " + input3);
        System.out.println("Output: " + result3);

	}

}
