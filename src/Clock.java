public class Clock implements Readable{
    int hours;
    int mins;
    int sec;

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMins(int mins) {
        this.mins = mins;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }

    public int getHours() {
        return hours;
    }

    public int getMins() {
        return mins;
    }

    public int getSec() {
        return sec;
    }

    public void tick(){
        sec++;
        if (sec==60){
            sec=0;
            mins++;
        }
        if (mins==60){
            mins=0;
            hours++;
        }
        if(hours==24){
            hours=0;
        }
    }

    @Override
    public String readTime() {
        return String.format("%02d %02d %02d", hours, mins, sec);
    }
}
