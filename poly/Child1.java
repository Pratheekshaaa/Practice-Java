package poly;//method shadowing
class Parent1
{
	static void display()
	{
		System.out.println("Parent class");
	}
}
class Child1 extends Parent1 {
	static void display()
	{
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		Parent1 p=new Child1();
		p.display();
	}

}
