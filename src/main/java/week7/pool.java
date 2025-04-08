package week7;

public class pool {
    private String name;
    private double length;

    pool(String name, double length) {
        this.name = name;
        this.length = length;

    }

    public double distanceforlaps(int laps) {
        //10 laps of 50 = 500meters
        double total = laps * this.length;
        return total;

    }

    @Override
    public String toString() {
        String description = this.name + " pool is " + this.length + " meters long";
        return description;

    }
}

