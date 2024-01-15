package AccessModifiers;

class Test {
	 protected int x, y; 
	} 

class Class1 {
	public static void main(String args[]) {
		 Test t = new Test(); 
		 System.out.println(t.x + " " + t.y); 
		} 
}


// OUTPUT will be  0 0