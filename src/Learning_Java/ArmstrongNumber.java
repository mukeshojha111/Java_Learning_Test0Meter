package Learning_Java;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number to Check for Armstrong Number or Not..!!");
		
		Scanner sc = new Scanner(System.in);
		
		int userNum = sc.nextInt();
		
		int temp = userNum;
		int num2=0;
		
		while(temp!=0)
		{
			num2 = num2+1;
			temp =  temp/10;
		}
		
		int temp2 =  userNum;
		int arm = 0;
		while(temp2!=0)
		{
			int mul = 1;
			int rem = temp2%10;
			for(int i=1; i<=num2; i++)
			{
				mul = mul * rem;
			}
			arm = arm + mul;
			temp2 = temp2 / 10;
		}

		 if(arm == userNum)
		 {
			 {
				 System.out.println(userNum+" is an Armstrong No.");
			 }
		 }else
		 {
			 System.out.println(userNum+" is not an Armstrong No.");
		 }
	}

}
