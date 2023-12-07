package MethodsPractices;

public class ParameterizedStatNonStatMethods {

	// Static method with parameters
	public static void staticMethodWithParameters(String message) {
		System.out.println("Static method with parameter: " + message);
	}

	// Non-static method with parameters
	public void nonStaticMethodWithParameters(int number) {
		System.out.println("Non-static method with parameter: " + number);
	}

	public static void main(String[] args) {
		// Call the static method with parameters using the class name
		ParameterizedStatNonStatMethods.staticMethodWithParameters("Hello, World!");

		// Create an instance of the class to call the non-static method with parameters
		ParameterizedStatNonStatMethods instance = new ParameterizedStatNonStatMethods();
		instance.nonStaticMethodWithParameters(42);
	}
}
