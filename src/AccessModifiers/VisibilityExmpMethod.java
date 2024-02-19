package AccessModifiers;

public class VisibilityExmpMethod {
	
	private static void privateMethod() {
        System.out.println("Private method");
    }

    // Default (package-private) static method
    static void defaultMethod() {
        System.out.println("Default method");
    }

    // Protected static method
    protected static void protectedMethod() {
        System.out.println("Protected method");
    }

    // Public static method
    public static void publicMethod() {
        System.out.println("Public method");
    }

    public static void main(String[] args) {
        // Accessing the methods within the same class
        privateMethod();
        defaultMethod();
        protectedMethod();
        publicMethod();
    }

}
