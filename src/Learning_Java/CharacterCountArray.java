package Learning_Java;

public class CharacterCountArray {

	public static void main(String[] args) {
		String input = "aaaabbbbdddddrrrrvvvvvssss";

        // Create an array to store the count of each character (assuming ASCII characters)
        int[] charCount = new int[128];

        // Iterate through the string and count each character
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charCount[currentChar]++;
        }

        // Print the character count
        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + "=" + charCount[i]);
            }
        }

	}

}
