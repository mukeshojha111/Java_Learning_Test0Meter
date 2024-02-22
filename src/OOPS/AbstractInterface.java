package OOPS;

/**
 an abstract class can implement an interface, and it may or may not provide implementations for all the methods declared in that interface. 
 However, if the abstract class does not provide implementations for all the interface methods, then any concrete subclass that extends the abstract 
 class must provide implementations for the remaining interface methods. 
 */
public class AbstractInterface {

	public static void main(String[] args) {
		MyConcreteClass obj = new MyConcreteClass();
        obj.method1();  // Output: Implementation of method1 in abstract class
        obj.method2(); 

	}

}
interface MyInterface {
    void method1();
    void method2();
}

abstract class MyAbstractClass implements MyInterface {
    // Implementation of method1 is provided here
    public void method1() {
        System.out.println("Implementation of method1 in abstract class");
    }
    
    // No implementation for method2 in the abstract class
}

class MyConcreteClass extends MyAbstractClass {
    // Concrete subclass must provide implementation for method2
    public void method2() {
        System.out.println("Implementation of method2 in concrete class");
    }
}