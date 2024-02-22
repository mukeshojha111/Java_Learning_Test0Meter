package OOPS;

/**
Encapsulation : It helps in hiding the internal details of an object and exposing only what is necessary for the outside world to interact with.
                Encapsulation is the bundling of data (attributes or fields) and methods (functions) that operate on the data into a single unit, 
                often referred to as a class.


Abstraction : Abstraction involves simplifying complex systems by modeling classes based on essential properties and behavior.
              It focuses on what an object does rather than how it achieves its functionality.
*/

public class Encap_Abstract {

	public static void main(String[] args) {
		

	}

}

// Encapsulation Example

class bankAccount{
	
	private String accountHolder;
    private double balance;

    public void BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // Encapsulation: Hiding internal details (e.g., validation) behind a method
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        // Encapsulation: Controlling access to internal state
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        // Encapsulation: Providing controlled access to the internal state
        return balance;
    }
}


// Abstraction Example

abstract class Shape {
    abstract double calculateArea(); // Abstract method - no implementation details
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        // Abstraction: Providing the specific implementation for calculating the area
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        // Abstraction: Providing the specific implementation for calculating the area
        return length * width;
    }
}

