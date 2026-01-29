package aggregation;
import java.util.Scanner;
public class MobileDriver {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter brand");
		String brand=sc.next();
		System.out.println("Enter ram");
		String ram=sc.next();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		Mobile m=new Mobile(brand,ram,price);
		System.out.println();
		System.out.println("Enter SIM no");
		long simNo=sc.nextLong();
		System.out.println("Enter service provider");
		String service_provider=sc.next();
		m.insertSim(new Sim(simNo,service_provider));
		System.out.println();
		System.out.println("----MOBILE DETAILS----");
		System.out.println("BRAND-"+m.brand);
		System.out.println("RAM-"+m.ram);
		System.out.println("PRICE-"+m.price);
		System.out.println("----SIM DETAILS----");
		System.out.println("SIM No-"+m.s.getSimNo());
		System.out.println("SERVICE PROVIDER-"+m.s.service_provider);
		m.removeSim();
		}
}
