package InheritancePractice;

public class ExtendsKeywordUsage {
	
	
/**
   Create a Parent Class and Method methodParentClass1 <BR>
   Create a Child Class and Method methodChildClass1 extending Parent in it <BR>
   Created object of Child class in Main method and called the method of child and parent, so no issue occurred.
   Created object of Parent class in Main method and called the method of child and parent, so issue occurred when we called child class method.   
 */

	public static void main(String[] args) {
		
		ChildClass1 cc1 = new ChildClass1();
		cc1.methodParentClass1();
		cc1.methodChildClass1();
		
		ParentClass1 pc1 = new ParentClass1();
		pc1.methodParentClass1();
	//	pc1.methodChildClass1();   The method methodChildClass1() is undefined for the type ParentClass1
	}

}

class ParentClass1{
	
	void methodParentClass1()
	{
		System.out.println("This is Method of Parent Class!!");
	}
}

class ChildClass1 extends ParentClass1{
	
	void methodChildClass1()
	{
		System.out.println("This is Method of Child Class!!");
	}
}