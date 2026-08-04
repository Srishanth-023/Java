class Calculator{
    // int x = 0;

    // public void printSomething(){
    //     System.out.println("Inside the method add() - Inside Calculator class");
    // }

    // public int additionOperation(int num1, int num2){
    //     int result = num1 + num2;
    //     return result;
    // }



    // Method Overloading
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2){
        return num1 + num2;
    }
}
