package is_a_relationship;
import java.util.Scanner;
public class VehivleDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		Vehicle v=null;
		while(exit)
		{
			System.out.println("1.CHOOSE VEHICLE\t2.VEHICLE DETAILS");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				{
					System.out.println("1.Car\t 2.Bike");
					int ch=sc.nextInt();
					switch(ch)
					{
						case 1:
							{
								System.out.println("-------------------------");
								System.out.println("     Car Selected!!!   ");
								System.out.println("-------------------------");
								System.out.println("Enter car brand");
								String brand=sc.next();
								System.out.println("Enter car price");
								double price=sc.nextDouble();
								System.out.println("Enter car wheels");
								int no_of_wheels=sc.nextInt();
								System.out.println("Enter car color");
								String color=sc.next();
								v=new Car(brand,price,no_of_wheels,color);
								System.out.println("-------------------------");
							}
						break;
						case 2:
							{
								System.out.println("-----------------------------");
								System.out.println("     Bike Selected!!!   ");
								System.out.println("-----------------------------");
								System.out.println("Enter bike brand");
								String brand=sc.next();
								System.out.println("Enter bike price");
								double price=sc.nextDouble();
								System.out.println("Enter bike wheels");
								int no_of_wheels=sc.nextInt();
								System.out.println("Enter bike color");
								String color=sc.next();
								v=new Bike(brand,price,no_of_wheels,color);
								System.out.println("-----------------------------");
							}
							break;
							default:
								System.out.println("Invalid Input!!!");
								break;
			
					}
		}
		break;
			case 2:
			{
				if(v==null)
				{
					System.out.println("No Vehicle is selected!!!");
				}
				else if(v instanceof Car)
				{
					Car c=(Car)v;
					c.carDetails();
				}
				else if(v instanceof Bike)
					{
						Bike b=(Bike)v;
						b.bikeDetails();
					}
			}
			break;
			case 3:
			{
				exit=false;
				System.out.println("THANK YOU :)");
			}
			break;
			default:
				System.out.println("Invalid Input!!!");
				break;
				}
		}
	}
}
