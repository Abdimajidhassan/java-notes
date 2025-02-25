package week3;

import static input.InputUtils.doubleInput;
//need to know how much gas used of the miles driven
public class mpgcalculator {
    public static void main(String[] args) {
        double miles = doubleInput("enter number of miles driven");//string for the info required from you
        double gas = doubleInput("enter number of gas used;");//need the int of used gas

        double mpg = milespergallon(miles, gas);
        System.out.println("the mpg for the journey is " + mpg + " miles per gallon");

    }
    public static double milespergallon(double miles, double gallonofgas) {//creat a ps for the second part of info
        double mpg = miles / gallonofgas;
        return mpg;
    }
}
