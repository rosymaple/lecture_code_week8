package week7.knockout_game;

import java.util.Random;

public class Dice {

    public int roll() {

        Random rnd = new Random();
        return rnd.nextInt(6) + 1;      // add 1 so the range is between 1 and 6

    }


}
