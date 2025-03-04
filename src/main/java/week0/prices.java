package week0;

public class prices {
    public static void main(String[] args) {
        String productName= "packet of spaghetti";//string for the pasta
        double price = 1.60;//price
        int quantity = 4;//

        double totalPrice = price * quantity;//price *q to get the total
        System.out.println(quantity + " of " + productName + " at $" + price + " each costs a total of $" + totalPrice);
    }//connect the string
}
