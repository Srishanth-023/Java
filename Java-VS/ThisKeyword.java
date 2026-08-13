class Human{
    private String name;
    private int age;

    // public Human(){
    //     name = "Sri";
    //     age = 19;
    // }

    // public void setName(String name){
    //     this.name = name;
    // }
    // public String getName(){
    //     return name;
    // }

    // // public void setAge(int age, Human human){
    // //     Human refObject = human;
    // //     refObject.age = age;
    // // }
    // public void setAge(int age){
    //     this.age = age;
    // }
    // public int getAge(){
    //     return age;
    // }


    // this() - Constructors (Constructor Overloading/Chaining)
    public void showDetails(){
        System.out.println(name + " : " + age);
    }

    public Human(String name){
        // this.name = name;
        // this.age = age;
        this(19, name);
    }

    public Human(int age, String name){
        this.name = name;
        this.age = age;
    }

}

public class ThisKeyword{
    public static void main(String[] args) {
        // Human human = new Human();

        // human.setName("Potter");
        // // human.setAge(20, human);
        // human.setAge(20);

        // System.out.println(human.getName() + " : " + human.getAge());

        Human human1 = new Human("Sri");
        Human human2 = new Human(20, "Potter");

        human1.showDetails();
        human2.showDetails();
    }
}