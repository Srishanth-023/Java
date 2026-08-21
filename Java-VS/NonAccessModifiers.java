abstract class A{
    public abstract void show();
}

class B extends A{
    @Override
    public void show(){
        System.out.println("Welcome");
    }
}

public class NonAccessModifiers{
    static int seconds = 60;
    public static void display(){
        System.out.println("Bravo");
    }
    public static void main(String[] args) {
        // final
        final int age = 18;
        // age = 19;
        System.out.println(age);

        // static
        System.out.println(seconds);

        // abstract
        B obj = new B();
        obj.show();

    }
}