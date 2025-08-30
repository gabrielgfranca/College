package Lab1.Week7_8.Challenge_Two;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final int EMPLOYEE_LIMIT = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Cashier> cashiers = new ArrayList<>();

        for (int i = 0; i < EMPLOYEE_LIMIT; i++) {
            System.out.print("Employee name: ");
            String name = input.nextLine();

            System.out.print("Employee address: ");
            String address = input.nextLine();

            System.out.print("Employee gender: ");
            char gender = input.nextLine().charAt(0);

            System.out.print("Employee calculator color: ");
            String color = input.nextLine();

            Calculator calculator = new Calculator(color);
            Cashier cashier = new Cashier(name, address, gender, calculator);

            cashiers.add(cashier);
        }

        System.out.print("Company name: ");
        String name = input.nextLine();

        Company company = new Company(name, cashiers.get(0),  cashiers.get(1));

        company.printInfo();
    }
}
