package week3;

import static input.InputUtils.intInput;

public class count {
    public static void main(String[] args) {
        int smallNumber = intInput("enter a small number");
        int bigNumber = intInput("enter a big number");
        System.out.println("i will count from " + smallNumber + " to " + bigNumber);
        count(smallNumber, bigNumber);
    }
    //methed that dont need return/ void
    public static void count(int min, int max) {
        for(int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }
}
