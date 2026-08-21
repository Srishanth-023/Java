class A{
    public void show(){
        System.out.println("In A show");
    }
}

class B extends A{
    @Override
    public void show(){
        System.out.println("In B show");
    }
}

class C extends A{
    @Override
    public void show(){
        System.out.println("In C show");
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        // Dynamic Method Dispatch
        A obj = new A(); // Type A but the object belongs to B 
        obj.show();

        obj = new B(); // New object will get created
        obj.show();

        obj = new C(); // New object will get created
        obj.show();
    }
}