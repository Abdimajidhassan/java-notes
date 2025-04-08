package week7;

public class pool {
    private String name;
    private double length;

   public pool(String name, double length) {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
       if (length < 0 || length > 1000) {
           return;
       }

        this.length = length;
    }
}

