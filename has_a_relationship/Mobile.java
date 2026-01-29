package has_a_relationship;

public class Mobile {
	String mbrand;
	String model;
	int price;
	Sim s;
	
	Mobile(String mbrand,String model,int price,Sim s)
	{
		this.mbrand=mbrand;
		this.model=model;
		this.price=price;
		this.s=s;
	}

}
