class ConditionalStatements{
    public static void main(String[] args) {
        // If-Else-If
        // int x = 1;

        // if (x > 0){
        //     System.out.println("Positive");
        // } else {
        //     System.out.println("Negative");
        // }

        // int y = 2, z = 3;

        // if (x > y && x > z){
        //     System.out.println(x);
        // } else if (y > x && y > z){
        //     System.out.println(y);
        // } else{
        //     System.out.println(z);
        // }


        // Ternary
        // int age = 18;
        // String res;

        // res = (age >= 18) ? "Wow" : "Not so good";

        // System.out.println(res);

        // int num = 0;
        // String res = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        // System.out.println(res);


        // Switch
        // String num = "0";
        // switch (num) {
        //     case "0":
        //         System.out.println("Absent");
        //         break;
        //     case "1":
        //         System.out.println("Present");
        //         break;
        //     default:
        //         System.out.println("Not valid buddy");
        // }


        // Nested-If
        int age = 18;
        boolean isCitizen = false;

        if (isCitizen){
            if (age >= 18){
                System.out.println("You can vote");
            } else{
                System.out.println("You're too young to vote");
            }
        } else{
            System.out.println("You're not a citizen");
        }

    }
}