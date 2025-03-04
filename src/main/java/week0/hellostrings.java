package week0;

public class hellostrings {
    public static void main(String[] args) {
        String name = "abdimajid";//need a String to make my name  uppercase
        String nameInuppercase = name.toUpperCase();
        System.out.println(nameInuppercase);//print name


        String nameInlowercase = name.toLowerCase();//need string to low the uppercase
        System.out.println(nameInlowercase);


        int charactersInName = name.length();//need the lengeth on my name which is 9
        System.out.println("there are " + charactersInName + " characters in your name");

    }
}
