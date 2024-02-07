package StringOperations;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Mukesh";
		int name_length=name.length();
		String strngRevese="";
		for(int i=name_length-1;i>=0;i--)
		{
			strngRevese = strngRevese+name.charAt(i);	
		}
		
		System.out.println(strngRevese);
	}

}
