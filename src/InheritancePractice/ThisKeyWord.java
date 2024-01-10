package InheritancePractice;

public class ThisKeyWord {
	
	    int value;
	
       ThisKeyWord(int a)
       {
    	   this.value = a; // this keyword used at Constructor level
          
    	   System.out.println("Value in Constructor: "+value);
       
       }
	
	public void test(int b)
	{
		 this.value = b;   // this keyword used at variable level
		 System.out.println("Value in test Method: "+value);
	}
	
	public void test1()
	{
		test(10); // this keyword used at Method level
		System.out.println("Value in test1 Method: "+value);
	}
	public static void main(String[] args) {
		
		ThisKeyWord t1 = new ThisKeyWord(5);
		t1.test(4);
		t1.test1();
	}
}
