package week1;

import static input.InputUtils.doubleInput;

public class temp {
    public static void main(String[] args) {
        double temp = doubleInput("enter todays temp in F:");//use double for the number
        if (temp > 32) {
            System.out.println("It's above freezing");// need a true or faluse state ment so use if and else
        }else{
            System.out.println("It's below freezing");
        }
    }
}
