package week3;

import static input.InputUtils.doubleInput;

public class squares {
    public static void main(String[] args) {
        double number = doubleInput("please enter a number and ill square it");//first code that will run
        double squared = square(number);
        //for the void remove sout and double squared so its square(number); or pub static void
        System.out.println("the square of " + number + " is " + squared);
    }//end the method could be void too
     public static double square(double n) {
        double sq = n * n;
        return sq ;
    }
}
