package MethodsPractices;

public class StaticNonStatickExampleMethods {
	
	// Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Non-static method
    public void nonStaticMethod() {
        System.out.println("This is a non-static method.");
    }

	public static void main(String[] args) {
		
		// Call the static method using the class name
        StaticNonStatickExampleMethods.staticMethod();

        // Create an object of the class to call the non-static method
        StaticNonStatickExampleMethods instance = new StaticNonStatickExampleMethods();
        instance.nonStaticMethod();

	}

}
