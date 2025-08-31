package Lab1.Week7_8.Chanllenge_Three.src;

import java.util.Scanner;

public class Main {
    static final String productOneName = "Softener";
    static final String productTwoName = "Toothpaste";
    static final String productThreeName = "Condensed Milk";
    static final String productFourName = "Curtain";
    static final double productFourPrice = 167.98;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Market market;
        Shelf shelfOne, shelfTwo;
        Product productOne, productTwo,  productThree, productFour;

        double productOnePrice = validPrice(input, productOneName);
        double productTwoPrice = validPrice(input, productTwoName);
        double productThreePrice = validPrice(input, productThreeName);

        Data productOneData = new Data(10,4,2014);
        Data productTwoData = new Data(5,5,2015);
        Data productThreeData  = new Data(4,12,2012);
        Data productFourData  = new Data(13,10,2025);

        productOne = new Product(productOneName, productOnePrice, productOneData);
        productTwo = new Product(productTwoName, productTwoPrice, productTwoData);
        productThree = new Product(productThreeName, productThreePrice, productThreeData);
        productFour = new Product(productFourName, productFourPrice, productFourData);

        shelfOne = new Shelf(productOne, productTwo, productThree);
        shelfTwo = new Shelf();
        shelfTwo.setProductOne(productFour);

        market = new Market(shelfOne, shelfTwo);

        System.out.println(market.getShelfOne().getProductOne().printInfo());
        System.out.println(market.getShelfOne().getProductTwo().printInfo());
        System.out.println(market.getShelfOne().getProductThree().printInfo());
        System.out.println(market.getShelfTwo().getProductOne().printInfo());

        Product mostExpensiveProductOnMarket;
        if (market.getShelfOne().mostExpensiveProduct().getPrice() > market.getShelfTwo().mostExpensiveProduct().getPrice())
            mostExpensiveProductOnMarket = market.getShelfOne().mostExpensiveProduct();
        else
            mostExpensiveProductOnMarket = market.getShelfTwo().mostExpensiveProduct();
        System.out.println("The most Expensive Product is: " + mostExpensiveProductOnMarket.toString());
    }

    public static double validPrice(Scanner input, String productName) {
        double price;
        do {
            System.out.print("Type the price of the product: " + productName + ": ");
            price = input.nextDouble();
            if (price <= 0) {
                System.out.println("Invalid price entered");
            }
        } while (price <= 0);
        return price;
    }

}
