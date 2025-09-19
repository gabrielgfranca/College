package Lab1.Week9_10.Challenge_Two.src;

public class Figure {
    private double x;
    private double y;

    public Figure() {
        this.x = 0;
        this.y = 0;
    }

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }

    @Override
    public String toString() {
        return "Figure { x=" + x + ", y=" + y + " }";
    }
}
