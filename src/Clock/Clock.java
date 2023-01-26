package Clock;

import Time.Time;
import Time.TimeInterFace;

public class Clock implements ClockInterface{
    Time time;
    boolean isRunning;
    public Clock(){

    }
    public Clock(Time time, boolean isRunning) {
        this.time = time;
        this.isRunning = isRunning;
    }



    @Override
    public TimeInterFace getTime() {
        return null;
    }

    @Override
    public TimeInterFace setTime() {
        return null;
    }

    @Override
    public boolean getIsRunning() {
        return false;
    }
}
