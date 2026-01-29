package aggregation;
import java.util.Scanner;
public class Bag1 {
	String bagname;
	Book1 b;
	Bag1(String bagname)
	{
		this.bagname=bagname;
	}
	public void addBook(Book1 b)
	{
		if(this.b==null)
		{
			this.b=b;
		}
		else
		{
			System.out.println("Book is already in bag!!");
		}
	}
	public void removeBook()
	{
		if(b==null)
		{
			System.out.println("No book in bag to remove!!");
		}
		else
		{
			b=null;
			System.out.println("Book is removed from bag");
		}
	}
	public void updateBook()
	{
		if(b==null)
		{
			System.out.println("No book in bag to update!!");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter new book name ! ");
			String new_bname=sc.next();
			b.setBookName(new_bname);
		}	
	}
	public void displayBookDetails()
	{
		if(b==null)
		{
			System.out.println("No book to display!!");
		}
		else
		{
			System.out.println("----BOOK DETAILS----");
			System.out.println("  book name-"+b.getBookName());
			System.out.println("  book ID-"+b.bid);
			System.out.println("  book price-"+b.bprice);
		}		
	}
	}
