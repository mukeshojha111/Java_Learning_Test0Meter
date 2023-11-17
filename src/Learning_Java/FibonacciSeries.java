package Learning_Java;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
         int num = 10;
         
         System.out.println("Fibonacci Series..");
         int a=0;
         int b=1;
         int c;
         System.out.println(a);
         System.out.println(b);
         for(int i=0; i<=num ;  i++)
         {
        	 c = a+b;
        	 System.out.println(c);
        	 a=b;
        	 b=c;
         }

	}

}
