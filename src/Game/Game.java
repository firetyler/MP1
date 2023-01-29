package Game;

import Clock.Clock;
import Player.PlayerInterFace;
import Player.Player;
import Time.Time;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PlayerInterFace player1 = new Player();
        PlayerInterFace player2 = new Player();

        Clock player1Clock = player1.getClock();
        Clock player2Clock = player2.getClock();

        System.out.println("Enter playtime (HH:MM:SS): ");
        String playTime = scanner.nextLine();
        String[] playTimeArray = playTime.split(":");

        player1Clock.setTime(new Time(Integer.parseInt(playTimeArray[0])
                                    ,Integer.parseInt(playTimeArray[1])
                                    ,Integer.parseInt(playTimeArray[2])));
        player2Clock.setTime(new Time(Integer.parseInt(playTimeArray[0])
                                    ,Integer.parseInt(playTimeArray[1])
                                    ,Integer.parseInt(playTimeArray[2])));

        Runner run1 = new Runner();
        Runner run2 = new Runner();
        Thread t1 = null;
        Thread t2 = null;
        boolean player1Turn = false;
        boolean player2Turn = true;



        while (true) {
            System.out.println("Enter 's' to complete turn: ");
            String input = scanner.nextLine();

            if (input.equals("s")) {
                if (player1Turn) {
                    player1Turn = false;
                    player2Turn = true;
                    t1 = run1.runner(player2Clock, "Player 2");
                    t1.start();
                    try {
                        t2.stop();
                    } catch (Exception e) {
                    }

                } else if (player2Turn) {
                    player2Turn = false;
                    player1Turn = true;
                    t2 = run2.runner(player1Clock, "Player 1");
                    t2.start();
                    try {
                        t1.stop();
                    } catch (Exception e) {
                    }
                }
            }
            else if(input.equals("r")){
                player1Turn = false;
                player2Turn = true;
                System.out.println("Enter new time (y/n):");
                String input2 = scanner.nextLine();
                if(input2.equals("y")){
                    System.out.println("Enter playtime (HH:MM:SS): ");
                    String playTime2 = scanner.nextLine();
                    playTimeArray = playTime2.split(":");

                    player1Clock.setTime(new Time(Integer.parseInt(playTimeArray[0])
                            ,Integer.parseInt(playTimeArray[1])
                            ,Integer.parseInt(playTimeArray[2])));
                    player2Clock.setTime(new Time(Integer.parseInt(playTimeArray[0])
                            ,Integer.parseInt(playTimeArray[1])
                            ,Integer.parseInt(playTimeArray[2])));
                }
                else{
                    player1Clock.setTime(new Time(Integer.parseInt(playTimeArray[0])
                            ,Integer.parseInt(playTimeArray[1])
                            ,Integer.parseInt(playTimeArray[2])));
                    player2Clock.setTime(new Time(Integer.parseInt(playTimeArray[0])
                            ,Integer.parseInt(playTimeArray[1])
                            ,Integer.parseInt(playTimeArray[2])));
                }
                t1.stop();
                t2.stop();
            }
        }
    }


}
