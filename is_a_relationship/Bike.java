package is_a_relationship;

public class Bike extends Vehicle {
	String color;

	Bike(String brand,double price,int no_of_wheels,String color)
	{
		super(brand,price,no_of_wheels);
		this.color=color;
	}
	void bikeDetails()
	{
		System.out.println("-----------Bike Details-----------");
		System.out.println("    Brand="+super.brand);
		System.out.println("    Price="+super.price);
		System.out.println("    No.Of.Wheels="+super.no_of_wheels);
		System.out.println("    Color="+color);
		System.out.println("-----------------------------------");
		
	}
}
