package week5;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class snowfall {
    public static void main(String[] args) {
        Map<String, Double> snowfall = new HashMap<>();
        snowfall.put("Jan", 3.1);
        snowfall.put("Feb", 10.8);
        snowfall.put("Dec", 3.1);
        snowfall.put("Mar", 4.1);
        snowfall.put("Apr", 0.0);
        System.out.println(snowfall);
        double total = 0;
        for (double snow : snowfall.values()) {
            total += snow;

        }
        System.out.println("the total snow is: " + total);

        for (String month : snowfall.keySet()) {
            double snow = snowfall.get(month);
            System.out.println("The Snow in " + month + ": " + snow + "Inches");
        }
        snowfall.put("Fen", 12.4);
        System.out.println(snowfall);

        System.out.println("THE SNOW ON JANUARY IS " + snowfall.get("Jan") + " INCHES");
        System.out.println("The snow on July is " + snowfall.get("July") + " INCHES");

        if (snowfall.containsKey("July")) {
            System.out.println("there is snow in July");

        }else {
            System.out.println("there is no snow in July");
        }

        String newMonth = stringInput("enter name of month;");
        double newSnow = positiveDoubleInput("enter amount of snow for " + newMonth);

        Double snow = snowfall.get(newMonth);
        if (snow != null) {

            //if the user wants the change

            System.out.println("The hashmap already contains that month, " + newMonth + "snow = " + snow + "Inches");
            boolean overwrite  = yesNoInput("overwrite data?");
            if (overwrite) {
                snowfall.put(newMonth, newSnow);
            }else {
                System.out.println("data was not overwritten");
            }
        }else {
            snowfall.put(newMonth, newSnow);
        }
        System.out.println(snowfall);

    }
}
