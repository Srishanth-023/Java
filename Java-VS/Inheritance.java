// A <-- B | Single Inheritance
// A <-- B <-- C | Multi-level Inheritance
// Multiple Inheritance is not possible

// class Calculator{
//     public int add(int num1, int num2){
//         return num1 + num2;
//     }

//     public int subtract(int num1, int num2){
//         return num1 - num2;
//     }
// }

// class AdvancedCalculator extends Calculator{
//     public int multiply(int num1, int num2){
//         return num1 * num2;
//     }

//     public int divide(int num1, int num2){
//         return num1 / num2;
//     }
// }

// class VeryAdvancedCalculator extends AdvancedCalculator{
//     public double power(int num1, int num2){
//         return Math.pow(num1, num2);
//     }
// }

class Car{
    protected String brandName = "BMW";
    public void display(){
        System.out.println("In Car");
    }
}

class BMW extends Car{
    protected String modelName = "M3";
}

public class Inheritance{

    // String modelName = "M3";
    public static void main(String[] args) {
        // VeryAdvancedCalculator calc = new VeryAdvancedCalculator();
        // int num1 = 2;
        // int num2 = 3;

        // int r1 = calc.add(num1, num2);
        // int r2 = calc.subtract(num1, num2);
        // int r3 = calc.multiply(num1, num2);
        // int r4 = calc.divide(num1, num2);
        // double r5 = calc.power(num1, num2);

        // System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

        // Inheritance obj = new Inheritance();
        BMW obj = new BMW();
        obj.display();
        System.out.println(obj.brandName + " " + obj.modelName);
    }
}