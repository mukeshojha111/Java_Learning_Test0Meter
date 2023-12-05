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
	}

}
