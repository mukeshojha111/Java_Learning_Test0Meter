package OOPS;

/**
 Yes, an abstract class in Java can contain a main method.
  
 */
public class Main {

	public static void main(String[] args) {
		Dog myDog = new Dog("Buddy");

        // Calling methods
        myDog.makeSound();  // Output: Woof! Woof!
        myDog.sleep(); 

	}

}
abstract class Animal1 {
    private String name;

    // Constructor
    public Animal1(String name) {
        this.name = name;
    }

    // Abstract method
    abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping");
    }
}

// Concrete subclass
class Dog1 extends Animal1 {
    // Constructor
    public Dog1(String name) {
        super(name);
    }

    // Implementation of the abstract method
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}