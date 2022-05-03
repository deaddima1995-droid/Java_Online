package by.dmitry.course.classes.object.task6;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void changeTime(int newHour, int newMinute, int newSecond) {
        setHour(newHour + this.hour);
        setMinute(newMinute + this.minute);
        setSecond(newSecond + this.second);
    }

    public void changeHour(int newHour) {
        setHour(newHour + this.hour);
    }

    public void changeMinute(int newMinute) {
        setHour(newMinute + this.minute);
    }

    public void changeSecond(int newSecond) {
        setHour(newSecond + this.second);
    }

    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        this.hour = setNewValueFromRange(hour, 24);
    }

    public void setMinute(int minute) {
        this.minute = setNewValueFromRange(minute, 60);
    }

    public void setSecond(int second) {
        this.second = setNewValueFromRange(second, 60);
    }

    private int setNewValueFromRange(int newTime, int range) {
        if (newTime > 0 && newTime <= range) {
            return newTime;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Current Time{" +
                "hour = " + hour +
                ", minute = " + minute +
                ", second = " + second +
                '}';
    }
}
