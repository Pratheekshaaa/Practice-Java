package aggregation;
import java.util.Scanner;
public class BagDriver {
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter bag color");
			String color=sc.next();
			System.out.println("Enter bag price");
			double price=sc.nextDouble();
			System.out.println();	
			System.out.println("Enter book name");
			String book_name=sc.next();
			System.out.println("Enter book id");
			int book_id=sc.nextInt();
			System.out.println("Enter book price");
			double bprice=sc.nextDouble();
			
			Bag g=new Bag(color,price);
			g.addBook(new Book(book_name,book_id,bprice));
			System.out.println();
			System.out.println("----BAG DETAILS----");
			System.out.println("   COLOR-"+g.color);
			System.out.println("   PRICE-"+g.price);
			System.out.println("----BOOK DETAILS----");
			System.out.println("   NAME-"+g.b.getBookName());
			System.out.println("   ID-"+g.b.book_id);
			System.out.println("   PRICE-"+g.b.bprice);
			g.removeBook();
			}
	}


