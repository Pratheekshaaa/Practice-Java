package poly;


public class MobileOSDriver
{
	//Method Shadowing----Compile Time Polymorphism
	public static void main(String[] args) 
	{
		MobileOS m=new MobileOS();
		m.display();
		System.out.println("==============================");
		m=new IOS();//Upcasting
		m.display();//MobileOS class method
		//Compile time Polymorphism
		System.out.println("=====================");
		MobileOS a=new Android();//Upcasting
		a.display();//MobileOS class method
		//Compile time Polymorphism
	}
}
