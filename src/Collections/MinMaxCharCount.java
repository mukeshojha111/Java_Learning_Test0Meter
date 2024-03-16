package Collections;

import java.util.HashMap;

public class MinMaxCharCount {
	public static void main(String[] args) {
        String input = "abbcbabbbab";
        
        // Creating a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Counting characters in the input string
        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        
        // Finding maximum and minimum count
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;
        char maxChar = ' ';
        char minChar = ' ';
        
        for (char key : charCountMap.keySet()) {
            int count = charCountMap.get(key);
            if (count > maxCount) {
                maxCount = count;
                maxChar = key;
            }
            if (count < minCount) {
                minCount = count;
                minChar = key;
            }
        }
        
        // Output
        System.out.println("Max - " + maxChar + "-" + maxCount);
        System.out.println("Min - " + minChar + "-" + minCount);
    }
}
