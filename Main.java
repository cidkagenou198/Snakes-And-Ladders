import game.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int players = sc.nextInt();

        System.out.print("Enter difficulty (easy/hard): ");
        String level = sc.next();
        Game g = new Game(n, players);
        g.play();
    }
}