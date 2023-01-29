package Game;

import Clock.Clock;

public class Runner {

    public static Thread runner(Clock playerClock,String name) {


        //00H 00M 00S
        //00H 00M 01S
        //00H 00M 02S
        return new Thread(() -> {
            while (true) {
                if (playerClock.getTime().getSeconds() == 0) {
                    if (playerClock.getTime().getMinutes() == 0) {
                        if (playerClock.getTime().getHour() == 0) {
                            //Gameover
                            System.out.println("Gameover");
                            break;
                        } else {
                            playerClock.getTime().setHour(playerClock.getTime().getHour() - 1);
                            playerClock.getTime().setMinutes(59);
                            playerClock.getTime().setSeconds(59);
                        }
                    } else {
                        playerClock.getTime().setMinutes(playerClock.getTime().getMinutes() - 1);
                        playerClock.getTime().setSeconds(59);
                    }
                } else {
                    playerClock.getTime().setSeconds(playerClock.getTime().getSeconds() - 1);
                }
                try {
                    System.out.println(name + ": " + playerClock.getTime().getHour() + "H "
                            + playerClock.getTime().getMinutes() + "M "
                            + playerClock.getTime().getSeconds() + "S");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
    }

}
