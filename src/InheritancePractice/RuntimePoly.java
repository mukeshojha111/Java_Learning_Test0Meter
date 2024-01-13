package InheritancePractice;

public class RuntimePoly {
	
	/**
	 
	 
	 Car2 class is parent class and object created in Main method and called the method of Maruti class which is child class, 
	 so will get the error as  " The method method2() is undefined for the type Car2" because we cannot call child method in parent class
	 
	 */

	public static void main(String[] args) {
		Car2 c1 = new Maruti();
//		c1.method2(); error in this line 
		
		c1.method1();

}
}

class Car2 {

	public void method1() {

		System.out.println("Car-method1");
	}

}

class Maruti extends Car2 {
	
	public void method1() {
	
		System.out.println("Maruti-method1");
	}

	public void method2() {
		
		System.out.println("Maruti-method2");
	}
}