package Game;

import Clock.Clock;
import Player.PlayerInterFace;
import Player.Player;
import Time.Time;

import java.util.Scanner;

public class Game {
    private static boolean running = true;
    public static void main(String[] args) {

        PlayerInterFace player1 = new Player();
        PlayerInterFace player2 = new Player();

        Clock player1Clock = player1.getClock();
        Clock player2Clock = player2.getClock();
        Time time = new Time(0, 0, 5);
        player1Clock.setTime(time);
        player2Clock.setTime(time);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 'stop' to stop the thread: ");
            String input = scanner.nextLine();
            if (input.equals("s")) {
                running = false;
            }
            else if (input.equals("r")) {
                running = true;
                runner();
            }
        }
    }

    private static void runner(){
        Thread t1 = new Thread(() -> {
            while (running) {
                System.out.println("Running");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
    }
}
