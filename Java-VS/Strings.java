class Strings{
    public static void main(String[] args){
        // String name = "Sri";
        // System.out.println(name);

        // String name = new String("Sri"); // This is what happens when line 3 gets executed
        // System.out.println(name);
        // System.out.println(name.hashCode());
        // System.out.println(name.length());
        // System.out.println(name.charAt(0));
        // System.out.println("Hello " + name);
        // System.out.println(name.concat("shanth"));


        // // Mutability vs Immutability (StringBuffer & StringBuilder)
        // String name = new String("Sri");
        // name = name + "shanth";

        // System.out.println(name);

        // String s1 = "abc";
        // String s2 = "abc"; 

        // System.out.println(s1 == s2); // s2 = "abd" --> false
        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());

        // System.out.println();

        // // StringBuffer & StringBuilder
        // StringBuffer stringBuffer1 = new StringBuffer();
        // StringBuffer stringBuffer2 =  new StringBuffer("Sri");
        // System.out.println(stringBuffer1.capacity());
        // System.out.println(stringBuffer2.capacity());

        // stringBuffer2.append("shanth");
        // System.out.println(stringBuffer2);

        // String name = stringBuffer2.toString();
        // System.out.println(name);


        // // Position of
        // String greet = "Hello World";
        // System.out.println(greet.indexOf("World"));


        // Special characters
        System.out.println("abc, \"abc\", abc"); // \, \n, \t, \b, \r - Carriage return, \f - From feed
        System.out.println("I\'m");
    }
}