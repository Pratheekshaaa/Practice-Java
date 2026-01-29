package is_a_relationship;

public class Samsung extends Mobile {

	double price;
	
	Samsung(String color,String brand, String memory,double price)
	{
		super(color,brand,memory);
		this.price=price;
	}
	public String toString()
	{
		return "   COLOR="+super.color+"\n   BRAND="+super.brand+"\n   MEMORY="+super.memory+"\n   PRICE="+price;
	}
}
