package MethodsPractices;

public class ExampleMethods {

    // Static method with int return type
    public static int staticAdd(int i, int j) {
        int k = i + j;
        return k;
    }

    // Non-static method with int return type
    public int nonStaticAdd(int i, int j) {
        int k = i + j;
        return k;
    }

    public static void main(String[] args) {
        // Call the static method with int return type using the class name
        int resultStatic = ExampleMethods.staticAdd(5, 10);
        System.out.println("Result from static method: " + resultStatic);

        // Create an instance of the class to call the non-static method with int return type
        ExampleMethods instance = new ExampleMethods();
        int resultNonStatic = instance.nonStaticAdd(15, 20);
        System.out.println("Result from non-static method: " + resultNonStatic);
    }
}