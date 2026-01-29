package aggregation;

public class Book1 
{
	private String bname; 	//r,w
	int bid;		
	double bprice;	
	
	public String getBookName()
	{
		return bname;
	}
	public void setBookName(String new_bname)
	{
		bname=new_bname;
	}
	Book1(String bname,int bid,double bprice)
	{
		this.bname=bname;
		this.bid=bid;
		this.bprice=bprice;
		
	}
}
