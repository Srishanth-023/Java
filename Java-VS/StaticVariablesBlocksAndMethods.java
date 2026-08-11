class Mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // public static void display(Mobile mobile){
    //     System.out.println(mobile.brand + " : " + mobile.price + " : " + name);
    // }

    public Mobile(){
        brand = "Samsung";
        price = 1000;
        System.out.println("Inside Constructor");
    }

    static{
        name = "Foldable smartphone";
        System.out.println("Inside Static block");
    }

}

public class StaticVariablesBlocksAndMethods{
    public static void main(String[] args) {
        // Mobile mobile1 = new Mobile();
        // mobile1.brand = "Apple";
        // mobile1.price = 2000;
        // // mobile1.name = "Smart Phone";
        // Mobile.name = "Smart Phone";

        // Mobile mobile2 = new Mobile();
        // mobile2.brand = "Pixel";
        // mobile2.price = 1500;
        // // mobile2.name = "Smart Phone";
        // Mobile.name = "Smart Phone";

        // mobile1.show();
        // mobile2.show();

        // Mobile.name = "New tech mobile"; // Changing the name would change it in every object created

        // mobile1.show();
        // mobile2.show();

        // System.out.println();

        // Mobile.display(mobile1);


        Mobile mobile1 = new Mobile();

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Pixel";
        mobile2.price = 1500;
        // mobile2.name = "Smart Phone";
        // Mobile.name = "Smart Phone";

        mobile1.show();
        mobile2.show();
    }
}