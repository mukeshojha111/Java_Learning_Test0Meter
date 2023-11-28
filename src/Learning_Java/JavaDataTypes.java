package Learning_Java;

public class JavaDataTypes {

	public static void main(String[] args) {
		/* ********Primitive Data Types********************
		   -----------Numeric Types----------------
		   byte - 1byte      
		   short - 2 bytes
		   int - 4 bytes
		   long -  8 bytes
		   
		   -----------Floating Types----------------
		   float-  4 bytes     12.1f
		   double - 8 bytes    12.10d
		   
		   -----------Character Type----------------
		    char -  ASCII - 1 byte
		            UNI Code - 2 bytes
		            
		   -----------Boolean Type----------------
		    boolean - 1bit    True/false       
		*/
		
		
		byte b1 = 100;
		short s1 = 150;
		int i1 = 1;
		long l1 = 23;
		float f1=12.34f;
		double d1=12.45D;
		char c1 = 'A';
		boolean b2= true;
		
		System.out.println("Byte value : "+b1);
		System.out.println("Short value : "+s1);
		System.out.println("int value : "+i1);
		System.out.println("long value : "+l1);
		System.out.println("float value : "+f1);
		System.out.println("double value : "+d1);
		System.out.println("Character value in ASCII: "+c1);
		System.out.println("Boolean value : "+b2);

	}

}
