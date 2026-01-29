package composition;
import java.util.Scanner;
public class BookDriver {

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("----BOOK DETAILS----");
			System.out.println("Enter book name");
			String bname=sc.next();
			System.out.println("Enter book id");
			int bid=sc.nextInt();
			System.out.println("Enter book price");
			double price=sc.nextDouble();
			System.out.println("Enter book author");
			String author=sc.next();
			System.out.println("----PAGE DETAILS----");
			System.out.println("Enter page title");
			String page_title=sc.next();
			System.out.println("Enter page number");
			int page_no=sc.nextInt();
			Book b=new Book(bname,bid,price,author,new Page(page_title,page_no));
			b.printBookAttributes();
			b.p.prinPageAttributes();
		}

	}


