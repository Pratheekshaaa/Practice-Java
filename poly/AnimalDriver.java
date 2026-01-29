package poly;

public class AnimalDriver
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		a.place();
		a.type();
		a.sound();//Animal class methods called
		System.out.println("=======================");
		a=new Dog();//upcasting
		a.place();
		a.type();
		a.sound();//Dog class methods
		//Runtime Polymorphism where methods are called based on runtime object
		System.out.println("================================");
		Animal c=new Cat();//Upcasting
		c.place();
		c.type();
		c.sound();//cat class methods
		//Runtime Polymorphism where methods are called based on runtime object
	}
}
