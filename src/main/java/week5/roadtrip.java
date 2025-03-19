package week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static input.InputUtils.positiveIntInput;

public class roadtrip {
    public static void main(String[] args) {
        Map<String, Integer> distances = new HashMap<>();
        distances.put("Duluth", 154);
        distances.put("Stillwater", 26);
        distances.put("Brainerd", 127);
        distances.put("Ely", 242);
        distances.put("Red Wing", 54);
        System.out.println(distances);

        int maxDrivingDistance = positiveIntInput("enter the max distance you want to drive?");

        List<String> citiesInrange = new ArrayList<>();

        for(String city: distances.keySet()) {
            int distance = distances.get(city);
            if(distance <= maxDrivingDistance) {
                //System.out.println(city + " is " + distance + " miles away");
                citiesInrange.add(city);
            }
        }
        if(citiesInrange.isEmpty()) {
            System.out.println("No driving distance");
        }else {
            System.out.println("Here are the cities in range" + citiesInrange.size() + "cities ");
            for(String city: citiesInrange) {
                System.out.println(city);
            }
        }
    }
}
