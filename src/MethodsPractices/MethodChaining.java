package MethodsPractices;

class A {
    A method1() {
        System.out.println("Method 1");
        return this;
    }

    A method2() {
        System.out.println("Method 2");
        return this;
    }
}

public class MethodChaining {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
        a1.method1().method2();
	}

}
