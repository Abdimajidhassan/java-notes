package week3;

import static input.InputUtils.doubleInput;

public class milestokm {
    public static void main(String[] args) {
        double miles = doubleInput("enter a number of miles");
        double km = milesTOKm(miles);
        System.out.println(miles + "Milkes is equals to " + km + "kilometers");
    }

    private static double milesTOKm(double miles) {
        double km = miles * 1.6;
        return km;
    }
}
