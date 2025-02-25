package week3;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class Creditsneed {
    public static void main(String[] args) {
        int required = intInput("how many credits do you need to graduate");
        int creditsEarned = intInput("how many credits have you earned");
        int needed = calculateCreditsNeed(required, creditsEarned);
        System.out.println("you need " + needed + " credits");
    }
    public static int calculateCreditsNeed(int needed ,int earned) {
        int crg = needed - earned;
        return crg;


    }
}
