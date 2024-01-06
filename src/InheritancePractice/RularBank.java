package InheritancePractice;

public class RularBank extends Bank{

	public void managerName()
	{
		System.out.println("This is Rular Bank which comes under RBI..");
		rbiGuideLine();
	}
}

class bankJSKB extends RularBank{
	
	void JSKBBank()
	{
    	System.out.println("This is JSKB Bank which comes under Rular Bank..");
	}
	
}