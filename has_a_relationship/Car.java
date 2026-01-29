package has_a_relationship;

public class Car {
	int cid;
	String cname;
	String company;
	String price;
	Engine e=new Engine(1,"Rolls Royce");
	
	Car(int cid,String cname,String company,String price)
	{
		this.cid=cid;
		this.cname=cname;
		this.company=company;
		this.price=price;
	}
	 
	void CarDetails()
	 {
		 System.out.println("\tid :"+cid);
		 System.out.println("\tname :"+cname);
		 System.out.println("\tcompany :"+company);
		 System.out.println("\tprice :"+price);
	 }

}
