class Anonymous{
    int age = 19;

    public void display(){
        System.out.println("In Anonymous");
    }
}

public class AnonymousObjects{
    public static void main(String[] args){
        // Anonymous anonymous;
        // anonymous = new Anonymous();

        // anonymous.display();

        new Anonymous().display();
        System.out.println(new Anonymous().age); // A new object would've been created while executing this line
    }
}