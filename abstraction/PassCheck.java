package abstraction;
import java.util.Scanner;
public class PassCheck {
	String name;
	int pass;
	
	
	PassCheck(String name,int pass)
	{
		this.name=name;
		this.pass=pass;
	}
	public boolean equals(Object o)
	{
		PassCheck p=(PassCheck)o;
		return this.name.equals(p.name) && this.pass==p.pass;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PassCheck p1=new PassCheck("Chinnu",1234);
		System.out.println("Enter old username");
		String old_name=sc.next();
		System.out.println("Enter old password");
		int old_pass=sc.nextInt();
		PassCheck p=new PassCheck(old_name,old_pass);
		if(p1.equals(p))
		{
			System.out.println("Enter new username");
			String old_name1=sc.next();
			System.out.println("Enter new password");
			int old_pass1=sc.nextInt();
		}
		
		
	}

}
