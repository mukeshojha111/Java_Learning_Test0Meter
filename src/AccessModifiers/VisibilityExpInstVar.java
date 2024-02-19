package AccessModifiers;

public class VisibilityExpInstVar {
	
	// Private instance variable
    private int privateVar;

    // Default (package-private) instance variable
    int defaultVar;

    // Protected instance variable
    protected int protectedVar;

    // Public instance variable
    public int publicVar;

    // Constructor to initialize instance variables
    public VisibilityExpInstVar(int privateVar, int defaultVar, int protectedVar, int publicVar) {
        this.privateVar = privateVar;
        this.defaultVar = defaultVar;
        this.protectedVar = protectedVar;
        this.publicVar = publicVar;
    }

    // Method to access instance variables
    public void printValues() {
        System.out.println("Private variable: " + privateVar);
        System.out.println("Default variable: " + defaultVar);
        System.out.println("Protected variable: " + protectedVar);
        System.out.println("Public variable: " + publicVar);
    }

    public static void main(String[] args) {
        // Creating an instance of the class
    	VisibilityExpInstVar instance = new VisibilityExpInstVar(1, 2, 3, 4);

        // Accessing instance variables through the instance
        instance.printValues();
    }

}
