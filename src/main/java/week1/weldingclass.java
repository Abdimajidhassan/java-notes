package week1;

import static input.InputUtils.yesNoInput;

public class weldingclass {
    public static void main(String[] args) {
        boolean cottonclothes = yesNoInput("are you wearing cotton clothes");//userinput
        boolean woolClothes = yesNoInput("are you wearing wool clothes");
        boolean closedToeshoes = yesNoInput("are you wearing closed toeshoes");

        if (cottonclothes  || woolClothes  && closedToeshoes) {// || ifs or && is and
            System.out.println("You are dressed safe ");
        } else {
            System.out.println("You are not dressed safe ");
        }

    }
}
