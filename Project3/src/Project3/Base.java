package Project3;

public class Base {
	//declare private protected and public
	
	int varDefault = 10;
	public int varPublic = 20;
	private int varPrivate = 30;
	protected int varProtected = 40;
	
	void methodDefault ()
	{
		System.out.println("Default access Baseclass");
		System.out.println("Default variable :"+varDefault);
	}
	void methodPublic ()
	{
		System.out.println("Default access Baseclass");
		System.out.println("Default variable :"+varPublic);
	}
	void methodPrivate ()
	{
		System.out.println("Default access Baseclass");
		System.out.println("Default variable :"+varPrivate);
	}
	void methodProtected ()
	{
		System.out.println("Default access Baseclass");
		System.out.println("Default variable :"+varProtected);
	}
}
