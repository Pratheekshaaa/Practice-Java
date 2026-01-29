package composition;
public class Book
{
	String bname;
	int bid;
	double price;
	String author;
	Page p;
	
	Book(String bname,int bid,double price,String author,Page p)
	{
		this.bname=bname;
		this.bid=bid;
		this.price=price;
		this.author=author;
		this.p=p;
	}
	 
void printBookAttributes()
{
	System.out.println("NAME-"+bname+"\nID-"+bid+"\nPRICE-"+price+"\nAUTHOR-"+author);
}
}
