package StringOperations;

public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        String sentence = "hello world! this is a sample sentence.";

        String capitalizedSentence = capitalizeFirstLetter(sentence);

        System.out.println("Original Sentence: " + sentence);
        System.out.println("Capitalized Sentence: " + capitalizedSentence);
    }

    public static String capitalizeFirstLetter(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = Character.toUpperCase(word.charAt(0));
                result.append(firstLetter).append(word.substring(1)).append(" ");
            } else {
                // Handle multiple spaces between words
                result.append(" ");
            }
        }

        return result.toString().trim(); // Remove trailing space
    }
}