// class Calculator{
//     public void printSomething(){
//         System.out.println("Inside the method add() - Inside Calculator class");
//     }

//     public int additionOperation(int num1, int num2){
//         int result = num1 + num2;
//         return result;
//     }
// }


public class ClassesObjectsAndMethods{
    public static void main(String[] args) {
        // System.out.println("In signature");

        // Calculator calc = new Calculator();

        // calc.printSomething();

        // int val1 = 1, val2 = 2;
        // System.out.println(calc.additionOperation(val1, val2));
        // int res = calc.additionOperation(val1, val2);
        // System.out.println(res);

        Calculator calc1 = new Calculator();
        System.out.println(calc1.x);
        Calculator calc2 = new Calculator();
        System.out.println(calc2.x);
        calc2.x = 1;
        System.out.println(calc2.x);
        
    }
}