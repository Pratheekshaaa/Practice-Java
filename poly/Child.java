package poly;//method overriding

class Parent {
    void show() {
        System.out.println("Parent class method");
    }
}

public class Child extends Parent {   
    void show() {
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.show();
    }
}
