package InheritancePractice;

public class SingleMultlevelHiraticalMultipleInhertance {

/**
  Single Level - Parent----> Child    example : Class Animal1 ----> Dog1 
  
  Multi Level - Grand Parent ----> Parent ----- > Child    example : Class Animal1 ----> Dog1 -----> Cat1
  
  Hirarical -  Parent ----- > Child 1               example : Class Animal1 ----> Dog1 
                      ------> Child 2                                       ----> Pig1
  
  Multiple -  Parent1 +  Parent2 ----- > Child 1
                                 ------> Child 2
                                 
        
 * */	
	
	
	public static void main(String[] args) {
		
	
		// Single Level
		
		Dog1 d1 =  new Dog1();
		
		d1.animalSound1();
		
		d1.livingStyle1();
	
		System.out.println("*********************************\n");
	// Multi Level Inhertance
		
		Cat1 c1 = new Cat1();
		
		c1.animalSound1();
		c1.livingStyle1();
		c1.walking();
		System.out.println("*********************************\n");
		
		
		// Hirarical Inhertance
		
		Pig1 p1 = new Pig1();
		
		p1.animalSound1();
		p1.sleeping();

	}

}

// Single Inheritance

class Animal1{
	
	void animalSound1()
	{
		System.out.println("Different animal have different type of sound");
	}
}

class Dog1 extends Animal1       
{
	void livingStyle1()
	{
		System.out.println("Pet Dog live with Human & wild lives in Jungle or streets");
	}
	
}

//Multi level Inheritance
class Cat1 extends Dog1       
{
	void walking()
	{
		System.out.println("cat can walk");
	}
	
}

//Hirarical Inheritance

class Pig1 extends Animal1{
	
	void sleeping()
	{
		System.out.println("pig sleeps in mud");
	}
}
