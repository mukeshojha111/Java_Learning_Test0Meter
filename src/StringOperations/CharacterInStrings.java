package StringOperations;

public class CharacterInStrings {

	public static void main(String[] args) {
		
		String  s1 = "this is java";
		String s2 = s1.replaceAll("this is java", "thisisjava");
		System.out.println("Length of String: "+s2.length());
		
		String s3 = "Checking the Data";
		String s4 = s3.replaceAll("Checking the Data", "CheckingtheData");
		System.out.println("Length of String: "+s4.length());


	}

}
