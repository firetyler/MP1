package Game;

import Clock.Clock;
import Player.PlayerInterFace;
import Player.Player;

public class Game {

    public static void main(String[] args) {
        PlayerInterFace player1 = new Player();
        PlayerInterFace player2 = new Player();

        Clock player1Clock = player1.getClock();
        Clock player2Clock = player2.getClock();

        player1Clock.setTime().setSeconds(5);
        player2Clock.setTime().setSeconds(5);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Player 1's clock is running");
            }
        });


    }

}
