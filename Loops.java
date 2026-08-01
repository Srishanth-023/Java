class Loops{
    public static void main(String[] args) {
        // // While loop
        // int num = 1;
        // int sum = 0;

        // while (num < 3) { 
        //     sum += num;
        //     num++;
        // }

        // System.out.println(sum);


        // // Do - While loop
        // do { 
        //     sum += num;
        //     num++;
        // } while (num < 3); // num > 3

        // System.out.println(sum);


        // // Nested While loop
        // int i = 1, sum1 = 0, sum2 = 0;

        // while (i < 3){
        //     sum1 += i;

        //     int j = 1;
        //     while (j < 3){
        //         sum2 += j;
        //         j++;
        //     }

        //     i++;
        // }

        // System.out.println(sum1);
        // System.out.println(sum2);


        // For loop
        // for (int i = 0; i < 3; i++){
        //     System.out.println(i);
        // }

        // System.out.println();

        // for (int i = 2; i >= 0; i--){
        //     System.out.println(i);
        // }


        // // Nested For loop
        // for (int i = 1; i <= 7; i++){
        //     System.out.println("Day " + i + ": ");
        //     for (int j = 1; j <= 24; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // // Star patter
        // for (int i = 0; i < 5; i++){
        //     for (int j = 0; j < 5; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // // Multiplication table
        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 3; j++) {
        //         System.out.println(i + " * " + j + " = " + (i * j));
        //     }

        //     System.out.println();
        // }


        // // For-each loop
        // String[] fruits = {"Apple", "Banana"};

        // for (String fruit : fruits){
        //     System.out.println(fruit);
        // }


        // Factorial
        int factorial = 1;

        for (int i = 1; i <= 5; i++){
            factorial *= i;
        }

        System.out.println(factorial);

    }
}