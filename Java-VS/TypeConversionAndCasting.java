class TypeConversionAndCasting{
    public static void main(String[] args) {
        // byte b = 127;
        // int a = 12;

        // b = (byte)a;

        // System.out.println(a);

        // float f = 1.1f;
        // int a = 12;

        // // f = a;
        // a = (int)f;

        // System.out.println(a);


        // // Type promotion
        // byte a = 10, b = 30;

        // int result = a * b;

        // System.out.println(result);



        // // Widening conversion (Automatic)
        // int myInt = 9;
        // double myDouble = myInt; // Automatic casting: int to double

        // System.out.println(myInt);
        // System.out.println(myDouble);

        // // Narrwoing casting (Manual)
        // byte b = 127;
        // int a = 12;

        // b = (byte)a;

        int max = 600;
        int user = 586;
        
        float percentage = ((float)user / (float)max) * 100;
        
        System.out.println(percentage);
    }
}