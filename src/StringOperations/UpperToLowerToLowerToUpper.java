package StringOperations;

public class UpperToLowerToLowerToUpper {

    public static void main(String[] args) {
        String originalString = "Hello World";

        // Convert to lowercase
        String lowerCaseString = toLowerCase(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Lowercase String: " + lowerCaseString);

        // Convert lowercase to uppercase
        String upperCaseString = toUpperCase(lowerCaseString);
        System.out.println("Uppercase String: " + upperCaseString);

        // Convert uppercase to lowercase
        lowerCaseString = toLowerCase(upperCaseString);
        System.out.println("Lowercase String: " + lowerCaseString);
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }
}