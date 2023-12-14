package MulipleClassProject;

public class CalculatorMethodOverLoading {

	// Sum method with 2 Parameters of int type
	
	 int SumCal(int i, int j)
	{
		int a1 =  i+j;
		System.out.println("Sum of Mehtod SumCal is: "+a1);
		return a1;
	}
	 
	// Sum method with 3 Parameters of int type
	 int SumCal1(int i, int j, int a)
		{
			int a2 =  SumCal(i, j)+a;
			System.out.println("Sum of Mehtod SumCal1 is: "+a2);
			return a2;
		}
	
	// Sum method with 2 Parameters of double type
	 double SumCal2(double i, double j)
		{
			double a3 =  i+j;
			System.out.println("Sum of Mehtod SumCal2 is: "+a3);
			return a3;
		}
	 
	// Sum method with 2 Parameters of float type
	 float SumCal3(float i, float j)
		{
			float a4 =  i+j;
			System.out.println("Sum of Mehtod SumCal3 is: "+a4);
			return a4;
		}
	 
	public static void main(String[] args) {
		
		CalculatorMethodOverLoading cmo = new CalculatorMethodOverLoading();
		cmo.SumCal(10, 20);
		cmo.SumCal1(5, 6, 7);
		cmo.SumCal2(15.23, 12.67);
		cmo.SumCal3(10.5f, 5.0f);
	}

}
