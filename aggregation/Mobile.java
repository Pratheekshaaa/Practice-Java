package aggregation;

public class Mobile {
	String brand;
	String ram;
	double price;
	Sim s;
	Mobile(String brand,String ram,double price)
	{
		this.brand=brand;
		this.ram=ram;
		this.price=price;
	}
	public void insertSim(Sim s)
	{
		this.s=s;
	}
	public void removeSim()
	{
		s=null;
		System.out.println("Sim Removed!!");
	}

}
