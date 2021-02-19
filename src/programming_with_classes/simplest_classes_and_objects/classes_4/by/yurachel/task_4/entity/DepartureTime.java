package programming_with_classes.simplest_classes_and_objects.classes_4.by.yurachel.task_4.entity;

public class DepartureTime {
    private int hour;
    private int minute;
    private int seconds;


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public DepartureTime(int hour, int minute, int seconds) {
        if (hour < 0 || hour > 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
        if (minute < 0 || minute > 60) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
        if (seconds < 0 || seconds > 60) {
            this.seconds = 0;
        } else {
            this.seconds = seconds;
        }
    }

    public int getFullTime() {
        return this.seconds + this.minute * 60 + this.hour * 3600;
    }

    @Override
    public String toString() {
        return "" + hour + ':' + minute + ':' + seconds + '.';
    }
}
