package week1;

import static input.InputUtils.*;

public class prices2 {
    public static void main(String[] args) {
        String productName= stringInput("what is the name of the product?");
        double price = positiveDoubleInput("what does " + productName + " cost?"  );
        int quantity = positiveIntInput("How many " + productName + " to sell?");

        double totalPrice = price * quantity;
        System.out.println(quantity + " of " + productName + " cost $"
                + price + " each cost $" + totalPrice);

    }


}
