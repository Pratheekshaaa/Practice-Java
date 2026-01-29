package aggregation;

public class Bag
{
	String color;
	double price;
	Book b;
	Bag(String color,double price)
	{
		this.color=color;
		this.price=price;
	}
	
	public void addBook(Book b)
	{
		this.b=b;
	}
	public void removeBook()
	{
		b=null;
		System.out.println("Book Removed !!");
	}
}
