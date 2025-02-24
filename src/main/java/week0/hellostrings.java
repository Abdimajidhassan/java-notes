package week0;

public class hellostrings {
    public static void main(String[] args) {
        String name = "abdimajid";
        String nameInuppercase = name.toUpperCase();
        System.out.println(nameInuppercase);


        String nameInlowercase = name.toLowerCase();
        System.out.println(nameInlowercase);


        int charactersInName = name.length();
        System.out.println("there are " + charactersInName + " characters in your name");

    }
}
