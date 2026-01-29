package abstraction;

public class AnimalDriver {
	public static void main(String[] args) {
		Animal d=new Deer();//Upcasting
		d.voice();
		d.type();
		Animal t=new Tiger();//Upcasting
		t.voice();
		t.type();
		
	}
	

}
