package MethodsPractices;

class Abcd {
    public int add(int i, int j) {
        return i + j;
    }
}

public class TestingClass {
	public static void main(String[] args) {
		
		Abcd a1 = new Abcd();
        int result = a1.add(a1.add(10, 20), a1.add(30, 40));
        System.out.println("Result: " + result);
	}
}

