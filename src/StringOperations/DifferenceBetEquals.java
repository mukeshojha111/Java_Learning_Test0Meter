package StringOperations;

public class DifferenceBetEquals {

	
	/**
	   == operator compares the memory addresses of the object, not their actual content in String.
	   equals() method checks if the sequences of characters in the strings are the same.
	 */
	public static void main(String[] args) {
		
		
		String s1 = "Hello Java";
		
		String s2 = new String("Hello Java");
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		

	}

}
