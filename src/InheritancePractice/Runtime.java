package InheritancePractice;

public class Runtime {

	/**
	 Runtime polymorphism, also known as late binding, is a concept in object-oriented programming (OOP) 
	 where a specific method or function call at runtime rather than at compile time.
	 */
	
	public static void main(String[] args) {
		
		Animal2 dog = new Dog2();
        Animal2 cat = new Cat2();

        dog.makeSound(); // Output: Woof! Woof!
        cat.makeSound(); // Output: Meow!
		
		
	}

}
class Animal2 {
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Derived class 1
class Dog2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Derived class 2
class Cat2 extends Animal2 {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}