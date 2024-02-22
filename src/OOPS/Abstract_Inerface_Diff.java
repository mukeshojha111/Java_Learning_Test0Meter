package OOPS;

/**
 In Java, both abstract classes and interfaces are used to achieve abstraction, but they have some key differences. 
 Here are the main distinctions between abstract classes and interfaces:

1. Method Implementation:

Abstract Class: Can have both abstract (methods without a body) and non-abstract (methods with a body) methods. Abstract classes can provide a partial implementation of an interface.
Interface: Can only have abstract methods. All methods declared in an interface are implicitly abstract and do not have a method body. Prior to Java 8, interfaces could not contain concrete methods, but with Java 8, you can have default and static methods with implementations in interfaces.


2. Multiple Inheritance:

Abstract Class: Supports single inheritance, meaning a class can extend only one abstract class.
Interface: Supports multiple inheritance, meaning a class can implement multiple interfaces.
Constructor:

Abstract Class: Can have constructors, and they are invoked when a subclass is instantiated. Abstract classes can also have instance variables.
Interface: Cannot have constructors or instance variables (prior to Java 8). In Java 8 and later, interfaces can have static and default methods.

3. Access Modifiers:

Abstract Class: Can have access modifiers for its methods (public, private, protected, etc.).
Interface: All methods are implicitly public and abstract. Variables in interfaces are implicitly public, static, and final.
Fields (Variables):

Abstract Class: Can have instance variables (fields).
Interface: Can only have constants (public static final fields) and cannot have instance variables.

 */

public class Abstract_Inerface_Diff {
		public static void main(String[] args) {
		 Dolphin dolphin = new Dolphin("Flipper");
	        dolphin.makeSound();
	        dolphin.eat();
	        dolphin.swim();

	}

}

abstract class Animal11 {
    String name;
    
    abstract void makeSound();
    
    void eat() {
        System.out.println(name + " is eating");
    }
}

// Interface
interface Swimmer {
    void swim();
}

class Dolphin extends Animal11 implements Swimmer {
    Dolphin(String name) {
        this.name = name;
    }
    
    @Override
    void makeSound() {
        System.out.println("Dolphin makes clicking sounds");
    }

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming");
    }
}
