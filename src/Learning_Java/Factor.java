package Learning_Java;

public class Factor {

	public static void main(String[] args) {
		
		int num = 10;
		
		System.out.println("Factors of Number "+num+" are..");
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
			  System.out.println(i);
			}
		}

	}

}
