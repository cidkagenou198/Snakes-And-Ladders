package game;

import java.util.Random;

public class Dice {
    Random r = new Random();

    public int roll() {
        return r.nextInt(6) + 1; //random numbers from 1 to 6
    }
}