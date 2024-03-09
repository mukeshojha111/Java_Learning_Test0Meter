package Learning_Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) {
		String filePath = "D:\\Eclipse Editor\\GIT\\Java_Learning_Test0Meter\\src\\Learning_Java\\Testfilereader";

        try {
            // Step 1: Read the file and save its content into a string
            String fileContent = readFile(filePath);

            // Step 2: Find the frequency of each character
            findCharacterFrequency(fileContent);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

	}
	
	
private static String readFile(String filePath) throws IOException {
    StringBuilder content = new StringBuilder();
    
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }
    }

    return content.toString();
}

private static void findCharacterFrequency(String content) {
    int[] charCount = new int[Character.MAX_VALUE];

    // Iterate through the string and count each character
    for (int i = 0; i < content.length(); i++) {
        char currentChar = content.charAt(i);
        charCount[currentChar]++;
    }

    // Print the character frequency
    for (int i = 0; i < charCount.length; i++) {
        if (charCount[i] > 0) {
            System.out.println((char) i + ": " + charCount[i]);
        }
    }
}
}