package InheritancePractice;

public class IsaHasaRelationship {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.startCar();
	}

}

class Engine {
	void start() {
		System.out.println("Engine starting");
	}
}

class Car {

	private Engine engine;

	Car() {
		this.engine = new Engine();
	}

	void startCar() {
		System.out.println("Car is starting");
		engine.start();
	}
}
