package is_a_relationship;

public class Cat extends Animal
{
	String color;

	Cat(int n_legs,int tail,String color)
	{
		super(n_legs,tail);
		this.color=color;;
	}
	
	void catDetails()
	{
		System.out.println("-----------Cat Bio Data-------------");
		System.out.println("No-of-legs ="+super.n_legs);
		System.out.println("No-of-tail ="+super.tail);
		System.out.println("Color ="+color);

		
	}

}
