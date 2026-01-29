package poly;

public class CarDriver {
	//Variable Shadowing----Compile Time Polymorphism
		//Done with both static and non static variables
		public static void main(String[] args) 
		{
			Car c=new Car();
			System.out.println("Car speed "+c.speed+"Km/hr");
			System.out.println("===============================");
			Car a=new Alto();//Upcasting
			System.out.println("Car speed "+a.speed+"Km/hr");
			System.out.println("==============================");
			Car b=new Baleno();//Upcasting
			System.out.println("Car speed "+b.speed+"Km/hr");
		}

}
