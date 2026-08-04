public class Scope{
    public static void main(String[] args) {
        // Method scope
        int num = 100;
        System.out.println(num);
        // int num = 100; // This will cause error


        // Block scope
        if (num > 50){
            int newNum = 50;
            System.out.println(newNum);
        }

        // System.out.println(newNum); // This will cause error


        // Loop scope
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        for (int i = 5; i >= 1; i--){
            System.out.println(i);
        }

    }
}