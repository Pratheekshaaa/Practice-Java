package is_a_relationship;

public class Dog extends Animal
{
	String d_breed;
	double dprice;
	Dog(int n_legs,int tail,String d_breed,double dprice)
	{
		super(n_legs,tail);
		this.d_breed=d_breed;
		this.dprice=dprice;
	}
	void dogDetails()
	{
		System.out.println("-----------Dog Bio Data-------------");
		System.out.println("No-of-legs ="+super.n_legs);
		System.out.println("No-of-tail ="+super.tail);
		System.out.println("Breed ="+d_breed);
		System.out.println("Price ="+dprice);
		
	}
}
