package abstraction;

public class Ios implements Mobile {

	public void os()
	{
		System.out.println("IOS os");
	}
	public void status()
	{
		System.out.println("IOS removed");
	}
	
		/*     public static void status()
				{
					System.out.println("IOS removed");
				}
				
			*/  //Child class ios does not inherit static method from interface  
}
