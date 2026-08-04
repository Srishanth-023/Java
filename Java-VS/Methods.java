class Mobile{
    public void playMusic(){
        System.out.println("Music playing...");
    }

    public void playGame(){
        System.out.println("Game launching...");
    }

    public String buyMeAPen(int cost){
        if (cost >= 10){
            return "Pen";
        }
        return "Nothing";
    }

    public long getPrice(long price){
        return price;
    }
}

public class Methods{
    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        mobile.playMusic();
        // mobile.playGame();

        int mrp = 10;
        String valueReturned = mobile.buyMeAPen(mrp);
        System.out.println(valueReturned);

        long price = 1000000000;
        System.out.println("MRP: " + mobile.getPrice(price));
    }
}