package aggregation;

public class Sim {
	private long simNo;
	String service_provider;

	public long getSimNo()
	{
		return simNo;
	}
	Sim(long simNo,String service_provider)
	{
		this.simNo=simNo;
		this.service_provider=service_provider;
	}
	
}
