package week3;

public class maraton {
    public static void main(String[] args) {
        //double value = 10;
        //value = value * 1.10;
        //System.out.println(value);

        double currentDistance = 1;
        double targetDistance = 26.2;
        double percentIncrease = 1.10; // use to increase by 10%

        int week = 1;
        // loop until the current distance is greater than the target distance
        //the loop will count the number of weeks
        while (currentDistance < targetDistance) {
            System.out.println(week + " " + currentDistance);
            currentDistance = currentDistance * percentIncrease;//increase by %10
            week++; // count the number of week
        }//need to print one more line - the distance that will be great
        System.out.println(week + " " + currentDistance);


    }
}
