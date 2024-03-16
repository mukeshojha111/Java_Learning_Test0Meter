package StringOperations;

public class CapitalizeFirstLetter {

	public static void main(String[] args) {
        String sentence = "this is a test sentence";
        String capitalizedSentence = capitalizeFirstLetter(sentence);
        System.out.println(capitalizedSentence);
    }

    public static String capitalizeFirstLetter(String sentence) {
        char[] chars = sentence.toCharArray();
        boolean capitalizeNext = true;

        for (int i = 0; i < chars.length; i++) {
            if (capitalizeNext && Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                capitalizeNext = false;
            } else if (Character.isWhitespace(chars[i])) {
                capitalizeNext = true;
            }
        }

        return new String(chars);
    }
}