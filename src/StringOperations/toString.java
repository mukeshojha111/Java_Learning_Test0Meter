package StringOperations;

public class toString {

	public static void main(String[] args) {
	
		stringtest st = new stringtest();
		
		System.out.println(st);
	}
	
	
}

class stringtest{
	
	int i = 10;
	
	public void m1()
	{
		
	}
	
	public String toString() {
        return "Object created for class StringTest\n" +
               "instance variable i = " + i ;
    }
}