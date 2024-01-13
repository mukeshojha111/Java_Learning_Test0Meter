package AbstractionTopics;

public class Abstract1 {
	
	/**
	Abstract class cannot be declared as final. If we mark a abstract class as final, it means that it cannot be extended by any other class and we cannot achieve the runtime polymorphism.
	so abstract class can be extended but cannot be made final. 
    an abstract class, by its nature, is meant to be subclassed. 
    Abstract classes provide a way to define a common interface for a group of related classes, and they may contain abstract methods that must be implemented by their subclasses. Therefore, marking an abstract class as final would contradict its purpose.
	 */

	public static void main(String[] args) {
		 
}

abstract class MyAbstractClass {
   
    public abstract void myAbstractMethod();

   
    public void myMethod1() {
        System.out.println("This is a concrete method in the abstract class.");
    }
}

}