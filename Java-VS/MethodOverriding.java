// class A{
//     public void display(){
//         System.out.println("In A");
//     }

//     public void config(){
//         System.out.println("In A config");
//     }
// }

// class B extends A{
//     @Override
//     public void display(){
//         System.out.println("In B");
//     }
// }

class Calculator{
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }
}

class AdvancedCalculator extends Calculator{
    @Override
    public int add(int num1, int num2){
        return num1 + num2 + 1;
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        // B obj = new B();
        // obj.display();
        // obj.config();

        AdvancedCalculator calc = new AdvancedCalculator();
        int num1 = 2;
        int num2 = 3;

        int r1 = calc.add(num1, num2);
        int r2 = calc.subtract(num1, num2);
        System.out.println(r1 + " " + r2);
    }
}