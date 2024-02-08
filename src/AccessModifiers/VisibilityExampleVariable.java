package AccessModifiers;

public class VisibilityExampleVariable {
    
    // Private static variable
    private static int privateVariable = 10;

    // Default (package-private) static variable
    static int defaultVariable = 20;

    // Protected static variable
    protected static int protectedVariable = 30;

    // Public static variable
    public static int publicVariable = 40;

    public static void main(String[] args) {
        // Accessing static variables within the same class
        System.out.println("Private variable within the same class: " + privateVariable);
        System.out.println("Default variable within the same class: " + defaultVariable);
        System.out.println("Protected variable within the same class: " + protectedVariable);
        System.out.println("Public variable within the same class: " + publicVariable);

        // Creating an object to access static variables from outside the class
        VisibilityExampleVariable obj = new VisibilityExampleVariable();

        // Uncommenting the lines below will result in compilation errors due to private and default variable visibility
         System.out.println("Private variable outside the class: " + obj.privateVariable);
         System.out.println("Default variable outside the class: " + obj.defaultVariable);

        // Accessing static variables outside the class using an object
        System.out.println("Protected variable outside the class: " + obj.protectedVariable);
        System.out.println("Public variable outside the class: " + obj.publicVariable);
    }
}
