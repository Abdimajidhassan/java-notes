package week2;

import static input.InputUtils.stringInput;

public class password {
    public static void main(String[] args) {
        String secretPassword = "Abdimajid";
        System.out.println();
        String userPassword = stringInput("Enter The password");

        int maxGuesses = 5;

        while ( ! userPassword.equals(secretPassword) && maxGuesses > 1) {
            System.out.println("Password Incorrect, access denied!");
            System.out.println("try again");
            userPassword = stringInput("Enter The password");
            maxGuesses--;
        }
        if (maxGuesses > 1) {
            System.out.println("Correct password! - access granted!");

        }
        else {
            System.out.println("Max guesses reached!");
            System.exit(0);
        }

    }



}
