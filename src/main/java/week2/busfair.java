package week2;

import static input.InputUtils.doubleInput;

public class busfair {
    public static void main(String[] args) {

       String[] dayNames = {"monday", "Tuesday", "Wednesday", "Thursday", "Friday"};


        double total =0;
        for (int day = 0; day < dayNames.length; day++) {//nned the for to make sure the info is not wrong and starts at 0 to last
            String dayName = dayNames[day];//
            double dayExpense = doubleInput("on " + dayName + "what did you spend on the bus fares on the day "//user input
            );
            total = total + dayExpense;//total number

        }
        System.out.println("for the week, tou spent $" + total + " For bus fares");
        // System.out.printf("total for the week = $%.2f", total);
    }
}
