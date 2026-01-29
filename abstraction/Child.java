package abstraction;

public class Child {
	String name;
	int id;
	double sal;
	Child(String name,int id,double sal)
	{
		this.name=name;
		this.id=id;
		this.sal=sal;
	}
	//method overriding (to return state of object rather than ref of object)
	public String toString()
	{
		return "Name:"+name+"ID:"+id+"Sal"+sal;
	}
	public static void main(String[] args) {
		Child c1=new Child("Prathiksha",01,60000.0);
		Child c2=new Child("Prathiksha",01,60000.0);
		System.out.println(c1.toString()); //use explicitly
		System.out.println(c2);				//use implicitly
	}

}
