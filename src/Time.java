public class Time {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public static void main(String[]args){
        int cantAccess = 10;
        Time time = new Time();
        System.out.println(STR."Its currently, \{time.hours}:\{time.minutes}:\{time.seconds}");
    }

    public static void cantDo(){
        System.out.println(cantAccess); //will error cant access
    }

    public int getHours() {
        return hours;
    }
    public int getMinutes() {
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
