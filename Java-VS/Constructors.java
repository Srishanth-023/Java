class Human{
    private String name;
    private int age;

    public Human(){
        this.name = "Sri";
        this.age = 19;
    }

    public Human(String name){
        // this.name = name;
        // age = 20;
        // this();
        this(name, 20);
    }   

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

}

public class Constructors{
    public static void main(String[] args){
        Human human1 = new Human();
        Human human2 = new Human("Potter");
        Human human3 = new Human("Spidey", 25);

        System.out.println(human1.getName() + " : " + human1.getAge());
        System.out.println(human2.getName() + " : " + human2.getAge());
        System.out.println(human3.getName() + " : " + human3.getAge());
    }
}