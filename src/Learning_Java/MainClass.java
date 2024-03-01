package Learning_Java;

public class MainClass {

	public static void main(String[] args) {
		
		C c1 = new C();
		c1.test();

	}
}

class A{
	void test() {
	
	}
}

class B extends A{
	protected void test() {
		
	}
}
 class C extends B{
	 public void test() {
		
	 }
 }