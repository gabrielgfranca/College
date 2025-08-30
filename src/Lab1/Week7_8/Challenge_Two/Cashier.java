package Lab1.Week7_8.Challenge_Two;

public class Cashier {
    private  String name;
    private String address;
    private char gender;
    private Calculator calculator;

    public Cashier() {
        this.name = "Unknown";
        this.address = "Unknown";
        this.gender = 'm';
        this.calculator = null;
    }

    public Cashier(String name, String address, char gender, Calculator calculator) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.calculator = calculator;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public char getGender() { return gender; }
    public void setGender(char gender) { this.gender = gender; }

    public Calculator getCalculator() { return calculator; }
    public void setCalculator(Calculator calculator) { this.calculator = calculator; }

    public double addition(double a, double b) { return calculator.addition(a, b); }
    public double subtraction(double a, double b) { return calculator.subtraction(a, b); }
    public double multiplication(double a, double b) { return calculator.multiplication(a, b); }
    public double division(double a, double b) { return calculator.division(a, b); }
    public int square(int a) { return calculator.square(a); }
    public int cube(int a) { return calculator.cube(a); }

    public void printInfo() {
        System.out.println("Cashier Information's");
        System.out.println("    Name: " + name);
        System.out.println("    Address: " + address);
        System.out.println("    Gender: " + gender);
        calculator.printInfo();
    }
}
