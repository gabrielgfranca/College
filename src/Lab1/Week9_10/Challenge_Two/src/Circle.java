package Lab1.Week9_10.Challenge_Two.src;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        this.radius = 0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public double calculateArea() {
        double PI = 3.14;
        return PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle { Radius= " + radius + super.toString() + " }";
    }
}
