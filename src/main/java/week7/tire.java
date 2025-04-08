package week7;

public class tire implements Comparable<tire>{
    private String name;
    private double price;
    private int warranty;

    public tire(String name, double price, int warranty) {
        this.name = name;
        this.price = price;
        this.warranty = warranty;
    }
    public double priceper1000miles(){
        double priceper100miles = (this.price / warranty) * 1000;
        return priceper100miles;
    }
    public double costForSet(){
        return this.price * 4;
    }
    @Override
    public String toString() {
        double priceper100miles = priceper1000miles();
        return String.format("%s cost $%.2f per tire. cost per 1000 miles is $%.2f", this.name,
                this.price, priceper100miles);
    }
    @Override
    public int compareTo(tire anotherTire) {
       return Double.compare(this.priceper1000miles(), anotherTire.priceper1000miles());
        //return this.name.compareTo(anotherTire.name);
    }

}
