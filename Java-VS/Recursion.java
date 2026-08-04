class RecursiveProblemSolver{
    public int addNumbersFromOneToTen(int num){
        if (num > 10){ // num < 1
            return 0;
        }

        return num + addNumbersFromOneToTen(num + 1); // num + addNumbersFromOneToTen(num - 1)
    }

    public int addNumbersOfARange(int start, int end){
        if (start > end){
            return 0;
        }

        return start + addNumbersOfARange(start + 1, end);
    }

    public void countdown(int timer){
        if (timer > 0){
            System.out.print(timer + " ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            
            countdown(timer - 1);
        }
    }

    public int factorial(int num){
        if (num > 0){
            return num * factorial(num - 1);
        }

        return 1;
    }
}

public class Recursion{
    public static void main(String[] args) {
        RecursiveProblemSolver rps = new RecursiveProblemSolver();

        // int result = rps.addNumbersFromOneToTen(1); // 10
        // int result = rps.addNumbersOfARange(50, 100);
        // int result = rps.countdown(10);
        // rps.countdown(10);
        int result = rps.factorial(10);
        System.out.println(result);
        
    }
}