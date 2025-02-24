package week0;

public class pizzaRolls {
    public static void main(String[] args) {
        // we want to share pizza rolls with friend
        double pizzaRolls = 50;
        int people = 7;
        double totalperPizzaRolls = pizzaRolls / people;
        System.out.println("each person gets " + totalperPizzaRolls + " pizza rolls");
        // when you do %.1f toy reduce the decimals and use souf for formating
        System.out.printf("each person gets %.1f pizza rolls", totalperPizzaRolls);

    }
}
