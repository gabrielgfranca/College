package Lab1.Week9_10.Challenge_Two.src;

import java.awt.*;
import java.util.Random;

public class Main {
    static final int ARRAY_SIZE = 4;

    public static void main(String[] args) {
        Random rand = new Random();
        Figure[] figures = new Figure[ARRAY_SIZE];
        double x = rand.nextDouble() * 100;
        double y = rand.nextDouble() * 100;

        for (int i = 0; i < ARRAY_SIZE; i++) {
            // Circle
            if (rand.nextBoolean()) {
                double radios = rand.nextDouble() * 10;
                figures[i] = new Circle(x,  y, radios);
            }
            // Triangle
            else {
                double base = rand.nextDouble() * 10;
                double height = rand.nextDouble() * 10;
                figures[i] = new Rectangle(x, y, base, height);
            }
        }

        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (figures[i] instanceof Circle) {
                System.out.printf("Circle with radius %.2f has area %.2f\n",
                        ((Circle) figures[i]).getRadius(),
                        ((Circle) figures[i]).calculateArea());
            } else {
                System.out.printf("Rectangle with base %.2f and height %.2f has area %.2f\n",
                        ((Rectangle) figures[i]).getBase(),
                        ((Rectangle) figures[i]).getHeight(),
                        ((Rectangle) figures[i]).calculateArea());
            }
        }
    }
}
