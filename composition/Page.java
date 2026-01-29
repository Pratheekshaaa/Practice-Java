package composition;

public class Page
{
	private String page_title;		//r
	private int page_no;			//r
	
	public String getPageTitle(String page_title)
	{
		return page_title;
	}
	public int getPageNo(int page_no)
	{
		return page_no;
	}
	Page(String page_title,int page_no)
	{
		this.page_title=page_title;
		this.page_no=page_no;
	}
	
	void prinPageAttributes()
	{
		System.out.println("PAGE TITLE-"+page_title+"\nPAGE NO-"+page_no);
	}

}
