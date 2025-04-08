package week7.Knockout_game;

import java.util.ArrayList;
import java.util.List;

public class diceCup {
    private List<dice> allDice;
    public diceCup(int numberOfDice) {
        allDice = new ArrayList<>();
        for (int i = 0; i < numberOfDice; i++) {
            dice dice = new dice();
            allDice.add(dice);
        }
    }
    public int rollall(){
        int total = 0;
        for ( dice dice : allDice) {
            int diceRoll = dice.roll();
            total = total + diceRoll;
        }
        return total;
    }
}
