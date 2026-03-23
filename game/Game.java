package game;

import java.util.*;

public class Game {
    Board board;
    Queue<Player> queue;
    Dice dice;

    public Game(int n, int players) {
        board = new Board(n);
        dice = new Dice();
        queue = new LinkedList<>();

        for (int i = 1; i <= players; i++) {
            queue.add(new Player(i));
        }
    }

    public void play() {
        int target = board.size;

        while (queue.size() > 1) {

            Player current = queue.poll();

            int roll = dice.roll();
            System.out.println("Player " + current.id + " rolled " + roll);

            int next = current.pos + roll;

            if (next <= target) {
                next = board.applyMove(next);
                current.pos = next;
            } else {
                System.out.println("Move skipped (out of board)");
            }

            System.out.println("Player " + current.id + " at " + current.pos);

            if (current.pos == target) {
                System.out.println("Player " + current.id + " WON");
             
            } else {
                queue.add(current); 
            }

            System.out.println("------------------");
        }

        System.out.println("Game Over");
    }
}