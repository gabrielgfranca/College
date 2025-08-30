package Lab1.Week7_8.Challenge_Two;

public class Calculator {
    private int memory = 0;
    private String color;

    public Calculator(String color) {
        this.color = color;
    }

    public int getMemory() { return memory; }
    public void setMemory(int memory) { this.memory = memory; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public double addition(double a, double b) { return a + b; }
    public double subtraction(double a, double b) { return a - b; }
    public double multiplication(double a, double b) { return a * b; }
    public double division(double a, double b) { return a / b; }
    public int square(int a) { return a * a; }
    public int cube(int a) { return a * a * a; }

    public void printInfo() {
        System.out.println("Calculator information's:");
        System.out.println("    Memory: " + memory);
        System.out.println("    Color: " + color);
    }
}
