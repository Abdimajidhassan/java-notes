package week7.Knockout_game;

import java.util.Random;

public class dice {
    public int roll(){
        Random rnd = new Random();
        return rnd.nextInt(6) + 1;//range 1 to 6
    }
}
