package week1;

import static input.InputUtils.stringInput;

public class campareString {
    public static void main(String[] args) {
        String collage = stringInput("which collage do you attend?");
        if(collage.equalsIgnoreCase("MCTC")){
            System.out.println("YAY, MCTC");
        }else {
            System.out.println("Too bad, You should Check out MCTC");
        }
    }
}
