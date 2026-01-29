package aggregation;
import java.util.Scanner;
public class BagDriver1 {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter bag name !");
		String bagname=sc.next();
		Bag1 bg=new Bag1(bagname);
		boolean exit=true;
		while(exit) {
		System.out.println("----Choose option----");
		System.out.println("1.ADD BOOK\t2.REMOVE BOOK\t3.UPDATE BOOK "
				+ "NAME\t4.DISPLAY BOOK DETAILS");
		int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("Enter book name ");
					String bname=sc.next();
					System.out.println("Enter book ID ");
					int bid=sc.nextInt();
					System.out.println("Enter book price ");
					double bprice=sc.nextDouble();
					bg.addBook(new Book1(bname,bid,bprice));
					System.out.println();
					break;					
				}				
			case 2:
				{
					bg.removeBook();
					System.out.println();
					break;
				}
			case 3:
				{
					bg.updateBook();
					System.out.println();
					break;
				}		
			case 4:
				{
					bg.displayBookDetails();
					System.out.println();
					break;
				}		
			case 5:
				{
					exit=false;
					System.out.println("THANK YOU :)");
					break;
				}		
			default:
				System.out.println("Invalid Input !!!");
			}
		}
	}
}
