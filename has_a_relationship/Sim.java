package has_a_relationship;

public class Sim {

	private String service_provider;
	private String network;
	private Long simno;
	
	public String getServiceProvider()
	{
		return service_provider;
	}
	public String getNetwork()
	{
		return network;
	}
	public Long getSimno()
	{
		return simno;
	}
	
	Sim(String service_provider,String network,Long simno)
	{
		this.service_provider=service_provider;
		this.network=network;
		this.simno=simno;
	}
	void SimDetails()
	{
		System.out.println("service provider ="+getServiceProvider());
		System.out.println("network ="+getNetwork());
		System.out.println("sim number ="+getSimno());
	}
	
}
