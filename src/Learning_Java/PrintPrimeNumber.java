package Learning_Java;

public class PrintPrimeNumber {

	public static void main(String[] args) {
		// Prime Nos - A no which is divisible by 1 and itself is know as prime Number
		
		int temp =0 , counter=0;
		System.out.print("20 Prime Numbers are: ");
		for(int i=2;i<=72;i++)
		{
		     for(int j=2; j<=i-1;j++)
		     {
		    	if(i%j==0)
		    	{
		    		temp = temp+1;
		    	}
		     }
		     if(temp==0)
		     {
		    	 System.out.print(i+"|");
		     }
		     else
		     {
		    	 temp=0;
		     }
		}
	}
}
