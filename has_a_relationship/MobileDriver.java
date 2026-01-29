package has_a_relationship;
import java.util.Scanner;
public class MobileDriver {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of mob and sim details you want to enter");
		int n=sc.nextInt();
		Mobile m[]=new Mobile[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("----Mobile "+(i+1)+"---");
			System.out.println("Enter mobile brand, model, price!! ");
			String mbrand=sc.next();
			String model=sc.next();
			int price=sc.nextInt();
			System.out.println("----SIM "+(i+1)+"---");
			System.out.println("Enter sim service provider,network,sim no!!!");
			String service_provider=sc.next();
			String network=sc.next();
			long simno=sc.nextLong();
			m[i]=new Mobile(mbrand,model,price,new Sim(service_provider, network, simno));

		}
		for(int i=0;i<n;i++)
		{
			System.out.println("----Mobile "+(i+1)+" Details---");
			System.out.println("brand ="+m[i].mbrand);
			System.out.println("model ="+m[i].model);
			System.out.println("price ="+m[i].price);
			System.out.println("----ENGINE "+(i+1)+" Details---");
		    m[i].s.SimDetails();
		    System.out.println();
	
		}
		
		}
		
	}

