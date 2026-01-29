package is_a_relationship;

public class Nokia extends Mobile {

	double price;
	
	Nokia(String color,String brand, String memory,double price)
	{
		super(color,brand,memory);
		this.price=price;
	}
}
