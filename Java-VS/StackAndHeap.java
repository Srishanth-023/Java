class Calculator{
    int num = 5;

    public int add(int n1, int n2){
        System.out.println(num);

        return n1 + n2;
    }
}

public class StackAndHeap{
    public static void main(String[] args){
        int data = 10;

        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();

        int result = obj1.add(1, 2);

        System.out.println(result);


        System.out.println(obj1.num);

        obj1.num = 1;

        System.out.println(obj1.num);
        System.out.println(obj2.num);

    }
}