package week1;

import static input.InputUtils.*;

public class userinputs {
    public static void main(String[] args) {

        String userName = stringInput("please enter your name: ");//need user input
        System.out.println("welcome " + userName);//connect with welcome

        int howManyClasses = positiveIntInput("how many classes are you taking?");

        String units = "classes";
        if (howManyClasses == 1) {
            units = "class";
        }
        System.out.println("You are taking " + howManyClasses + " classes");
    }

}
