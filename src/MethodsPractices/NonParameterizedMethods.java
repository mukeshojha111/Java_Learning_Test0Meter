package MethodsPractices;

public class NonParameterizedMethods {

    // Static non-parameterized method
    public static void staticNonParameterizedMethod() {
        System.out.println("This is a static non-parameterized method.");
    }

    // Non-static non-parameterized method
    public void nonStaticNonParameterizedMethod() {
        System.out.println("This is a non-static non-parameterized method.");
    }

    public static void main(String[] args) {
        // Call the static non-parameterized method using the class name
        staticNonParameterizedMethod();

        // Create an instance of the class to call the non-static non-parameterized method
        NonParameterizedMethods instance = new NonParameterizedMethods();
        instance.nonStaticNonParameterizedMethod();
    }
}