package Lab1.Week7_8.Chanllenge_Three.src;

public class Data {
    private int day;
    private int month;
    private int year;

    public Data(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }

    public void setDay(int day) { this.day = day; }
    public void setMonth(int month) { this.month = month; }
    public void setYear(int year) { this.year = year; }

    public boolean isBefore(int dayRef, int monthRef, int yearRef) {
        if (year < yearRef) return true;
        if (year == yearRef && month < monthRef) return true;
        if (year == yearRef && month == monthRef && day < dayRef) return true;
        return false;
    }
    
    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
