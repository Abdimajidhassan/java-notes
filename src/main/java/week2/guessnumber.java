package week2;

import java.util.Random;

import static input.InputUtils.intInput;

public class guessnumber {
    public static void main(String[] args) {
        Random random = new Random();
        int SecretNumber = random.nextInt(100) + 1;
        int guess = intInput("guess the number");

        while (guess != SecretNumber) {
            System.out.println("thats wrong, try again!");
            if (guess < SecretNumber) {
                System.out.println("Guess Higher");
            }
            if (guess > SecretNumber) {
                System.out.println("Guess Lower");
            }
            guess = intInput("guess the number");
        }
        System.out.println("Correct");
    }
}
