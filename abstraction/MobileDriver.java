package abstraction;
// 100% abstraction by using interface 
public class MobileDriver {
	public static void main(String[] args) 
	{	
		Mobile a=new Android();
		a.os();
		a.status();
		Mobile i=new Ios();
		i.os();	
		i.status();
		
	}
	
}
