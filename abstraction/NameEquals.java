package abstraction;

public class NameEquals {
	String name;
	int id;
	double sal;
	NameEquals(String name,int id,double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	//method overriding (to compares state of 2 objects rather than ref of 2 objects)
	public boolean equals(Object o)
	{
		NameEquals n2=(NameEquals)o;
		return this.name.equals(n2.name) && this.id==n2.id && this.sal==n2.sal;
	}
	
	public static void main(String[] args) {
		NameEquals n1=new NameEquals("Prathiksha",01,60000.0);
		NameEquals n2=new NameEquals("Prathiksha",01,60000.0);
		System.out.println(n1.equals(n2));	//compares state of 2 objects
		System.out.println(n1==n2);	//compares reference of 2 objects

	}


}
