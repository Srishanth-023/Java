class Human{
    private String name;
    private int age;

    public Human(){
        name = "Sri";
        age = 19;
    }

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }

}

public class Encapsulation{
    public static void main(String[] args){
        Human human = new Human();
        // human.name = "Sri";
        // human.age = 19;

        human.setName("Potter");
        human.setAge(20);

        System.out.println(human.getName() + " : " + human.getAge());
    }
}