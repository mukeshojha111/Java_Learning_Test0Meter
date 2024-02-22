package OOPS;

public class abstractDemo {

	public static void main(String[] args) {
		Dog myDog = new Dog("Buddy");

        // Calling methods
        myDog.makeSound();  // Output: Woof! Woof!
        myDog.sleep();   

	}

}
abstract class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
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
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name);
    }

    // Implementation of the abstract method
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}