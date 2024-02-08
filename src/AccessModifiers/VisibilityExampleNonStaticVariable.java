package AccessModifiers;

public class VisibilityExampleNonStaticVariable {
	private int privateVariable = 10;

    // Default (package-private) non-static variable
    int defaultVariable = 20;

    // Protected non-static variable
    protected int protectedVariable = 30;

    // Public non-static variable
    public int publicVariable = 40;


    public static void main(String[] args) {
		
    	// Creating an object to access non-static variables within the same class
    	VisibilityExampleNonStaticVariable obj = new VisibilityExampleNonStaticVariable();

        System.out.println("Private variable within the same class: " + obj.privateVariable);
        System.out.println("Default variable within the same class: " + obj.defaultVariable);
        System.out.println("Protected variable within the same class: " + obj.protectedVariable);
        System.out.println("Public variable within the same class: " + obj.publicVariable);

	}
            
}
