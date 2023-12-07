package MethodsPractices;

public class VoidMethodsStatNonStat {

	// Static void method
    public static void staticVoidMethod() {
        System.out.println("This is a static void method.");
    }

    // Non-static void method
    public void nonStaticVoidMethod() {
        System.out.println("This is a non-static void method.");
    }
	
	public static void main(String[] args) {
	
		// Call the static void method using the class name
        staticVoidMethod();

        // Create an object of the class to call the non-static void method
        VoidMethodsStatNonStat instance = new VoidMethodsStatNonStat();
        instance.nonStaticVoidMethod();
    }

	}

