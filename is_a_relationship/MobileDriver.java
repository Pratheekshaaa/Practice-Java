package is_a_relationship;
import java.util.Scanner;
public class MobileDriver 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Mobile m=null;
		boolean exit=true;
		while(exit)
		{	System.out.println("--1.CHOOSE MOBILE\t2.DISPLAY MOBILE\t3.EXIT--");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:
				{
					System.out.println("1.SAMSUNG\t 2.ONE PLUS\t3.NOKIA");
					int ch=sc.nextInt();
					switch(ch)
					{
						case 1:
						{
							System.out.println("Samsung SELECTED!!");
							System.out.println("Enter color");
							String color=sc.next();
							System.out.println("enter brand");
							String brand=sc.next();
							System.out.println("enter memory");
							String memory=sc.next();
							System.out.println("enter price");
							double price=sc.nextDouble();
							m=new Samsung(color,brand,memory,price);
						}
						break;
						case 2:
						{
							System.out.println("OnePlus SELECTED!!");
							System.out.println("Enter color");
							String color=sc.next();
							System.out.println("enter brand");
							String brand=sc.next();
							System.out.println("enter memory");
							String memory=sc.next();
							System.out.println("enter price");
							double price=sc.nextDouble();
							m=new OnePlus(color,brand,memory,price);
						}
						break;
						case 3:
						{
							System.out.println("Nokia SELECTED!!");
							System.out.println("Enter color");
							String color=sc.next();
							System.out.println("enter brand");
							String brand=sc.next();
							System.out.println("enter memory");
							String memory=sc.next();
							System.out.println("enter price");
							double price=sc.nextDouble();
							m=new Nokia(color,brand,memory,price);
						}
						break;
						default:
							System.out.println("INVALID INPUT!!!");	
					}	
				}
				break;
				case 2:
				{				
					if(m instanceof Samsung)
					{
						Samsung s=(Samsung)m;
						System.out.println("=====Samsung details=====");
						System.out.println(s);
						System.out.println("=======================");
					}
					else if(m instanceof OnePlus)
					{
						OnePlus o=(OnePlus)m;
						System.out.println("=====OnePlus details=====");
						System.out.println(o);
						System.out.println("=======================");
					}
					else if(m instanceof Nokia)
					{
						Nokia n=(Nokia)m;
						System.out.println("=====Nokia details=====");
						System.out.println("   COLOR="+n.color);
						System.out.println("   BRAND="+n.brand);
						System.out.println("   MEMORY="+n.memory);
						System.out.println("   PRICE="+n.price);
						System.out.println("=======================");
					}
					if(m==null) {
						System.out.println("No Mobile choosed!");
					}
				}
				break;
				case 3:
				{
					exit=false;
					System.out.println("THANK YOU :)");
				}
				break;
			}
		}
	}
}
