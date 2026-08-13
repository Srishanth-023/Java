// class A extends Object{
//     public A(){
//         super();
//         System.out.println("In A");
//     }

//     public A(int number){
//         super();
//         System.out.println("In A (int)");
//     }
// }

// class B extends A{
//     public B(){
//         super();
//         // super(1);
//         System.out.println("In B");
//     }

//     public B(int number){
//         // super(1);
//         // this();
//         System.out.println("In B (int)");
//     }
// }

// class C extends B{
//     public C(){
//         super();
//         System.out.println("In C");
//     }
// }

class A extends Object{
    // int number = 5;

    public void displayDetail(){
        System.out.println("From A");
    }
}

class B extends A{
    // int number = 1;

    // public void display(){
    //     System.out.println(number);
    //     System.out.println(super.number);
    // }

    @Override // Error checking and Code readability
    public void displayDetail(){
        super.displayDetail();
        System.out.println("From B");
    }
}

public class ThisAndSuperMethods{
    public static void main(String[] args) {
        B obj = new B();
        // C obj = new C();
        
        obj.displayDetail();
    }
}