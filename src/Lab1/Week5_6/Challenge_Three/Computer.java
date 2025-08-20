package Lab1.Week5_6.Challenge_Three;

public class Computer {
    private String mark;
    private int speed;
    private int year;
    private boolean isNew;

    public Computer(String mark, int speed, int year, boolean isNew) {
        this.mark = mark;
        this.speed = speed;
        this.year = year;
        this.isNew = isNew;
    }

    public String getMark() { return mark; }
    public void setMark(String mark) { this.mark = mark; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public boolean isNew() { return isNew; }
    public void setIsNew(boolean isNew) { this.isNew = isNew; }
}
