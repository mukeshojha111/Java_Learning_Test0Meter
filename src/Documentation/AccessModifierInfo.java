package Documentation;

/**
 In Java, there are four access modifiers that control the visibility of classes, methods, and fields. 
 These access modifiers determine which other classes can access a particular class, method, or field. 
 
 
 1. Public: A member (class, method, or field) with the public access modifier is accessible from any other class, in same and different packages.
 2. Protected: A member with the protected access modifier is accessible within the same package and by subclasses, regardless of the package they belong to.
 3. Default (Package-Private): If no access modifier is specified, the member is accessible only within the same package.
 4. Private: A member with the private access modifier is only accessible within the same class.
 */

public class AccessModifierInfo {

	public int myField;
    public void myMethod() {
    }
	
}


class AccessModifierInfo1 {
    protected int myField;
    protected void myMethod() {
       
    }
}


class AccessModifierInfo2 {
    int myField; // Default access modifier
    void myMethod() {
       
    }
}

class AccessModifierInfo3 {
    private int myField;
    private void myMethod() {
        
    }
}