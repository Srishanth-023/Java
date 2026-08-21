import modifiers.A;

class C extends A{
    // Protected
    public void getAge(){
        System.out.println(age);
    }
}

public class AccessModifiers{

    private static int marks = 99;

    public static void main(String[] args) {
        // A objA = new A();
        // System.out.println(objA.age);

        C objC = new C();
        objC.getAge();

        System.out.println(marks);
    }
}