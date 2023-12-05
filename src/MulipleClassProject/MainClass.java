package MulipleClassProject;

public class MainClass {

	public static void main(String[] args) {
		
		Human h1 = new Human();
		h1.age = 10;
		h1.name = "Mukesh";
		h1.gender = "Male";
		System.out.println("This is Human Class...\n"+h1.age);
		System.out.println(h1.name);
		System.out.println(h1.gender);
		h1.run();
		
		Laptop l1 = new Laptop();
		l1.brand = "Lenovo";
		l1.model = "XTZ1234";
		l1.processor = "Intel";
		l1.ramSize = "8 Gb";
		System.out.println("\nThis is Laptop Class...\n"+l1.brand);
		System.out.println(l1.model);
		System.out.println(l1.processor);
		System.out.println(l1.ramSize);
		l1.work();
		
		SportMan s1 = new SportMan();
		s1.name = "Virat Kohli";
		s1.position = "3rd";
		s1.sport = "Cricket";
		s1.team = "INDIA";
		System.out.println("\nThis is SportMan Class...\n"+s1.name);
		System.out.println(s1.position);
		System.out.println(s1.sport);
		System.out.println(s1.team);
		s1.play();
		
		TestCase tc1 = new TestCase();
		
		tc1.description = "Testcase 1";
		tc1.name = "Name 1";
		tc1.status = "Pass";
		System.out.println("\nThis is TestCase Class...\n"+tc1.name);
		System.out.println(tc1.description);
		System.out.println(tc1.status);
		tc1.scenario();
		
		Car car1 = new Car();
		car1.color ="Blue";
		car1.make = "Made In India";
		car1.model = "TATA EON";
		car1.year = 2014;
		System.out.println("\nThis is Car Class...\n"+car1.color);
		System.out.println(car1.make);
		System.out.println(car1.model);
		System.out.println(car1.year);
		car1.drive();
		
		Book b1 = new Book();
		b1.author = "xyz";
		b1.genre = "horror";
		b1.pages = 100;
		b1.title = "Title";
		System.out.println("\nThis is Book Class...\n"+b1.author);
		System.out.println(b1.genre);
		System.out.println(b1.pages);
		System.out.println(b1.title);
		b1.read();
		
		Dog d1 = new Dog();
		d1.age = 11;
		d1.breed = "Pomelian";
		d1.name = "Jio";
		System.out.println("\nThis is Book Class...\n"+d1.age);
		System.out.println(d1.breed);
		System.out.println(d1.name);
		d1.bark();
		
		
	}

}
