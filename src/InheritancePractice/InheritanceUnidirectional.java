package InheritancePractice;

public class InheritanceUnidirectional {
	
	/**
	  Yes, Inheritance is an Unidirectional because <BR>
	  Child Class (Sub class) inherits properties and behaviors from <BR>
	  its Parent Class (Superclass, but the reverse is not true
	 */

	public static void main(String[] args) {

		Dog d1 = new Dog();
		
		d1.animalSound();
		d1.livingStyle();
  
	}

}

class Animal{
	
	void animalSound()
	{
		System.out.println("Different animal have different type of sound");
	}
}

class Dog extends Animal
{
	void livingStyle()
	{
		System.out.println("Pet Dog live with Human & wild lives in Jungle or streets");
	}
	
}