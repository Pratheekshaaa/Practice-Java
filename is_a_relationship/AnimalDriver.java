package is_a_relationship;
import java.util.Scanner;
public class AnimalDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of inputs~~~");
		int n=sc.nextInt();
		Animal a[]=new Animal[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("====DOG DATA====");
			System.out.println("enter no of legs");
			int n_legs=sc.nextInt();
			System.out.println("enter no of tail");
			int tail=sc.nextInt();
			System.out.println("enter dog breed");
			String d_breed=sc.next();
			System.out.println("enetr dog price");
			double dprice=sc.nextDouble();
			a[i]=new Dog(n_legs,tail,d_breed,dprice);
		}
		for(int i=0;i<n;i++)
		{
			if(a[i] instanceof Dog)
			{
				System.out.println("==================================");
				Dog d=(Dog)a[i];
				d.dogDetails();
				System.out.println("==================================");
			}
		}
		for(int j=0;j<n;j++)
		{
			System.out.println();
			System.out.println("====CAT DATA====");
			System.out.println("enter no of legs");
			int n1_legs=sc.nextInt();
			System.out.println("enter no of tail");
			int tail1=sc.nextInt();
			System.out.println("enter cat color");
			String color=sc.next();
			a[j]=new Cat(n1_legs,tail1,color);
			Cat c=(Cat)a[j];
			//Cat c=new Cat(n1_legs,tail1,color);
		}
		for(int j=0;j<n;j++)
		{
			if(a[j] instanceof Cat)
			{
				System.out.println("==================================");
				Cat c=(Cat)a[j];
				c.catDetails();
				System.out.println("==================================");
			}
			
		}
	}
}
