package Lab1.Week9_10.Challenge_Two.src;

public class Rectangle extends Figure {
    double base;
    double height;

    public Rectangle() {
        this.base = 0;
        this.height = 0;
    }

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Rectangle(double x, double y, double base, double height) {
        super(x, y);
        this.base = base;
        this.height = height;
    }

    public double getBase() { return base; }
    public double getHeight() { return height; }
    public void setBase(double base) { this.base = base; }
    public void setHeight(double height) { this.height = height; }

    public double calculateArea() {
        return this.base * this.height;
    }

}
