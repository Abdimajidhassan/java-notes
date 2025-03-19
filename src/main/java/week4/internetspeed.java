package week4;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.positiveDoubleInput;

public class internetspeed {
    public static void main(String[] args) {
        List<Double> speeds = new ArrayList<>();

        int totalHours = 12;

        for (int hour = 0; hour < totalHours; hour++) {
            double speed = positiveDoubleInput("enter the internet speed for hour " + hour);
            speeds.add(speed);
        }
        System.out.println("all the speed are;");

        for (int hour = 0; hour < speeds.size(); hour++) {
            double speed = speeds.get(hour);
            System.out.printf("Hour: %d Speed %.2f\n", hour, speed);
        }
        int zeroCount = 0;
        for (double speed : speeds) {
            if (speed == 0) {
                zeroCount++;
            }
        }
        System.out.println("number of times speed was 0 (no connection) ; " + zeroCount);

        while ( speeds.contains(0.0) ) {
            speeds.remove(0.0);
        }
        System.out.println(speeds);

        double total = 0;
        for (double speed : speeds) {
            total = total + speed;

        }
        double average = total / speeds.size();
        System.out.println("average speed is " + average);


    }

}
