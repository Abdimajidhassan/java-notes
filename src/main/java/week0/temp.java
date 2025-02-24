package week0;

public class temp {
    public static void main(String[] args) {
        //string and int varibale to store the date
        String currentMonth = "January";
        int dayofMonth = 11;

        //double variable to store the high and low temp
        double forecastHigh = 19.4;
        double forecastLow = -10.2;
//Printing all the info together.
        double tempDiffrence = forecastHigh - forecastLow;
        System.out.println("on" + currentMonth + dayofMonth + " The diffrence between the high and low is " + tempDiffrence);
    }
}
