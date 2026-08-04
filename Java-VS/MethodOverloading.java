public class MethodOverloading{
    public static void main(String[] args){
        // Class --> Multiple methods --> Same name --> Different parameters
        Calculator calc = new Calculator();

        // int num1 = 1;
        // int num2 = 2;
        // int num3 = 3;

        double num1 = 1.0;
        double num2 = 2.0;

        // int result = calc.add(num1, num2);
        // int result = calc.add(num1, num2, num3);
        double result = calc.add(num1, num2);
        System.out.println(result);
    }
}