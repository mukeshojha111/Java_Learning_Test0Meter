package InheritancePractice;

public class UrbanBank extends Bank{

	 void branchName()
		{
	    	System.out.println("This is Urban Bank Branch Name..");
		}
}

class bankHDFC extends UrbanBank{
	
	void hdfcBank()
	{
    	System.out.println("This is HDFC Bank which comes under Urban Bank..");
	}
	
}

class bankSBI extends UrbanBank{
	
	void SBIBank()
	{
    	System.out.println("This is SBI Bank which comes under Urban Bank..");
	}
	
}