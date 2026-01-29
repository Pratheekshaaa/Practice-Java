package has_a_relationship;

public class Engine {
	int eid;
	String ebrand;
	
	Engine(int eid,String ebrand)
	{
		this.eid=eid;
		this.ebrand=ebrand;
	}
 void EngineDetails()
 {
	 System.out.println("\tid :"+eid);
	 System.out.println("\tbrand :"+ebrand);
 }
}
