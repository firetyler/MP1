package Time;

public class Time implements TimeInterFace{
    int hours ;
    int  minutes ;
    int seconds ;
    boolean t;
    public Time(){

    }
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    @Override
    public int getHour() {
        return this.hours;
    }

    @Override
    public void setHour(int hours) {

         this.hours= hours;
    }

    @Override
    public void setMinutes(int minutes) {
         this.minutes = minutes;
    }

    @Override
    public int getMinutes() {
        return this.minutes;
    }

    @Override
    public void setSeconds(int seconds) {
         this.seconds = seconds;
    }

    @Override
    public int getSeconds() {
        return this.seconds;
    }
}
