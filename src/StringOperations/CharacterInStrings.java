package StringOperations;

public class CharacterInStrings {
	public static void main(String[] args) {
        String input = "this is javaa";
        int count = countCharacters(input);
        System.out.println("Number of characters: " + count);
    }

    public static int countCharacters(String input) {
        int count = 0;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                count++;
            }
        }
        
        return count;
    }

}
