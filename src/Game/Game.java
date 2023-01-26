package Game;

import Clock.Clock;
import Player.PlayerInterFace;
import Player.Player;
import Time.Time;

public class Game {

    public static void main(String[] args) {
        PlayerInterFace player1 = new Player();
        PlayerInterFace player2 = new Player();

        Clock player1Clock = player1.getClock();
        Clock player2Clock = player2.getClock();
        Time time = new Time(0,0,5);
        player1Clock.setTime(time);
        player2Clock.setTime(time);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Player 1's clock is running");
            }
        });


    }

}
