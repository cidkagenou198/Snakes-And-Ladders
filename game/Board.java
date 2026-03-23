package game;

import java.util.*;

public class Board {
    public int size;
    Map<Integer, Integer> snakes = new HashMap<>();
    Map<Integer, Integer> ladders = new HashMap<>();
    Random r = new Random();

    public Board(int n) {
        this.size = n * n;

        generateSnakes(n);   
        generateLadders(n);   
    }

    void generateSnakes(int count) {
        while (snakes.size() < count) {
            int head = r.nextInt(size - 1) + 2;
            int tail = r.nextInt(head - 1) + 1;

            if (!snakes.containsKey(head) && !ladders.containsKey(head)) {
                snakes.put(head, tail);
            }
        }
    }

    void generateLadders(int count) {
        while (ladders.size() < count) {
            int start = r.nextInt(size - 1) + 1;
            int end = r.nextInt(size - start) + start + 1;

            if (!ladders.containsKey(start) && !snakes.containsKey(start)) {
                ladders.put(start, end);
            }
        }
    }

    public int applyMove(int pos) {
        if (snakes.containsKey(pos)) {
            System.out.println("Snake: " + pos + " -> " + snakes.get(pos));
            return snakes.get(pos);
        }

        if (ladders.containsKey(pos)) {
            System.out.println("Ladder: " + pos + " -> " + ladders.get(pos));
            return ladders.get(pos);
        }

        return pos;
    }
}