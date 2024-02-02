package StringOperations;

public class StringInterningExample {
    public static void main(String[] args) {
        // Creating Strings using double quotes
        String str1 = "hello";
        String str2 = "hello";

        // Checking if str1 and str2 reference the same String instance
        boolean areEqualReferences = str1 == str2;
        System.out.println("Are str1 and str2 referencing the same String instance? " + areEqualReferences);

        // Using intern() method to explicitly intern a String
        String str3 = new String("hello").intern();
        boolean areEqualReferencesAfterInterning = str1 == str3;
        System.out.println("Are str1 and str3 referencing the same String instance after interning? " + areEqualReferencesAfterInterning);
    }
}

/**

 What is Interning?
 Interning is a process by which multiple references to the same String literal are replaced with a single reference to a shared instance of that String. 
 
 How String store in java?
 String literals in Java are stored in a special memory area called the "string pool." 
 */

