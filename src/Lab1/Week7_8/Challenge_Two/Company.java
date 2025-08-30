package Lab1.Week7_8.Challenge_Two;

public class Company {
    private String name;
    private Cashier employeeOne;
    private Cashier employeeTwo;

    public Company(String name, Cashier employeeOne, Cashier employeeTwo) {
        this.name = name;
        this.employeeOne = employeeOne;
        this.employeeTwo = employeeTwo;
    }

    public Company(String name) {
        this.name = name;
        this.employeeOne = null;
        this.employeeTwo = null;
    }

    public Company() {
        this.name = "Unknown";
        this.employeeOne = null;
        this.employeeTwo = null;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Cashier getEmployeeOne() { return employeeOne; }
    public void setEmployeeOne(Cashier employee_one) { this.employeeOne = employee_one; }

    public Cashier getEmployeeTwo() { return employeeTwo; }
    public void setEmployeeTwo(Cashier employeeTwo) { this.employeeTwo = employeeTwo; }

    public void printInfo() {
        System.out.println(" ");
        System.out.println("Company Information's");
        System.out.println("    Company name: " + name);
        employeeOne.printInfo();
        System.out.println(" ");
        employeeTwo.printInfo();
    }
}
