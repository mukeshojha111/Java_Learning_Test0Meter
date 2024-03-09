package Learning_Java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MaxCharacterFrequencyFilerReader {
	
	
	// Text file location https://github.com/mukeshojha111/Java_Learning_Test0Meter/blob/main/src/Learning_Java/TestMaxCharFile
	public static void main(String[] args) {
        // Step 1: Create a file and add some text
        String filePath = "D:\\Eclipse Editor\\GIT\\Java_Learning_Test0Meter\\src\\Learning_Java\\TestMaxCharFile"; 
        createFile(filePath, "heyyyyyyyyyyyyyyyyyyyyyyyyyyy344444444443gfwergwvwvtneterwgwgwweewfwefwefqwdqwenmsssssssssssssssssssssssssssssssssssssssdessssssaefe");

        // Step 2: Read the file and save its content into a string
        String fileContent = readFile(filePath);

        // Step 3: Find the maximum character frequency
        char maxChar = findMaxCharacterFrequency(fileContent);

        // Print the result
        System.out.println("Maximum character frequency: " + maxChar);
    }

    private static void createFile(String filePath, String content) {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
        }
    }

    private static String readFile(String filePath) {
        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return content.toString();
    }

    private static char findMaxCharacterFrequency(String content) {
        int[] charCount = new int[Character.MAX_VALUE];
        char maxChar = '\0';
        int maxCount = 0;

        // Iterate through the string and count each character
        for (int i = 0; i < content.length(); i++) {
            char currentChar = content.charAt(i);
            charCount[currentChar]++;

            // Update maxChar and maxCount if a new maximum is found
            if (charCount[currentChar] > maxCount) {
                maxCount = charCount[currentChar];
                maxChar = currentChar;
            }
        }

        return maxChar;
    }

}
