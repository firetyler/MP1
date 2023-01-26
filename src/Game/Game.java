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
    }

}
