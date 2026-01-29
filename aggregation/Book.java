package aggregation;

public class Book {

	private String book_name;
	int book_id;
	double bprice;
	
	public String getBookName()
	{
		return book_name;
	}
	
	Book(String book_name,int book_id,double bprice)
	{
		this.book_name=book_name;
		this.book_id=book_id;
		this.bprice=bprice;
	}
	
}
