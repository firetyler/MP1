package Player;

import Clock.Clock;
import Time.Time;

public class Player implements PlayerInterFace{
    Clock clock;
    public Player() {

        this.clock = new Clock();
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }

    public Clock getClock() {
        return this.clock;
    }


}
