package week1;

import static input.InputUtils.positiveDoubleInput;

public class milesmctc {
    public static void main(String[] args) {
        double miles = positiveDoubleInput("how many miles from your home to mctc?" );
        double km = miles / 1.6;
        System.out.println("you live " + km + " Kilometers from school.");

        // does the use live more that 10 miles
        if (miles > 10){
            System.out.println("you live more that 10 miles away from school.");
        } else if (miles == 10){
            System.out.println("you live exactly 10 miles away from school.");
        }
        else {
            System.out.println("you live less than 10 miles away from school.");
        }


    }
}
