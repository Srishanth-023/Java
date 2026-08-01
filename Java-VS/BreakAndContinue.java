class BreakAndContinue{
    public static void main(String[] args) {
        // // Break in for loop
        // for (int i = 1; i <= 10; i++){
        //     // System.out.println(i);
        //     if (i == 6){
        //         break;
        //     }

        //     System.out.println(i);
        // }

        // // Continue in for loop
        // for (int i = 1; i <= 10; i++){
        //     // System.out.println(i);
        //     if (i == 6){
        //         continue;
        //     }

        //     System.out.println(i);
        // }

        // // Break in while loop
        // int num = 1;
        // while (num < 11){
        //     System.out.println(num);
        //     num++;

        //     if (num == 6){
        //         break;
        //     }
        // }

        // Continue in while loop
        int num = 1;
        while (num < 11){
            if (num == 6){
                num++;
                continue;
            }

            System.out.println(num);
            num++;
        }
    }
}