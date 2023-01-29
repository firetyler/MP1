package Clock;

import Time.Time;
import Time.TimeInterFace;

public class Clock implements ClockInterface{
    Time time;

    public Clock() {
    }
    public Clock(Time time) {
        this.time = time;
    }



    @Override
    public TimeInterFace getTime() {
        return this.time;
    }

    @Override
    public TimeInterFace setTime(TimeInterFace time) {
        return this.time = (Time) time;
    }

}
