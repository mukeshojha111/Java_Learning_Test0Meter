package Learning_Java;

public class Temperature_Scale {

	//  Program to convert Celcius in Fahrenheit and Kelvin.
	public static void main(String[] args) {
	
		double temp_Input = 50.4;
		System.out.println("Temperature in Celsius is : "+temp_Input);
		// Celcius to Fahrenheit 
		
		double faht_Temp = 1.8 * temp_Input + 32;
		System.out.println(temp_Input+" Celsius = "+faht_Temp+" Fahrenheit");
		
		// Celcius to Kelvin
		
		double kel_Temp = temp_Input + 273.15;
		System.out.println(temp_Input+" Celsius = "+kel_Temp+" Kelvin");

	}

}
