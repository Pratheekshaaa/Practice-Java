package has_a_relationship;
import java.util.Scanner;
public class CarDriver {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("----CAR---");
		System.out.println("Enter car id");
		int cid=sc.nextInt();
		System.out.println("Enter car name");
		String cname=sc.next();
		System.out.println("Enter car company");
		String company=sc.next();
		System.out.println("Enter car price");
		String price=sc.next();
		//early Instantiation
		Car c=new Car(cid,cname,company,price);
		System.out.println("-------CAR DETAILS------");
		c.CarDetails();
		System.out.println("-------Engine DETAILS------");
		c.e.EngineDetails();
		
	}

}
