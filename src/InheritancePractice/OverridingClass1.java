package InheritancePractice;

/** 
 If Method have default access modifier in Test1 (Parent Class) then it will not have any compilation error.
 
 If Method have public access modifier in Test1 (Parent Class) then it will have compilation error. so we need to make all the method as public.
  
 If Method have protected access modifier in Test1 (Parent Class) then it will have compilation error. so we need to make all the method as protected. 
 
 If Method have private access modifier in Test1 (Parent Class) then it will have compilation error. so we need to make all the method as private. 
 */

class OverridingClass1 {
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();		
		Test3 t3 = new Test3();

		t1.test1();
		t2.test1();
		t3.test1();
		
	}

}


class Test1{

protected void test1()
	{
		System.out.println("Test1 Method");	
	}
}


class Test2 extends Test1{

protected void test1()
	{
	 System.out.println("Test1---->Test2 Method");	
	}
}


class Test3 extends Test2{

protected void test1()
	{
	 System.out.println("Test2---->Test3 Method");	
	}
}
