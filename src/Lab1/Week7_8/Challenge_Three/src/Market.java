package Lab1.Week7_8.Challenge_Three.src;

import java.util.ArrayList;
import java.util.List;

public class Market {
    private Shelf shelfOne;
    private Shelf shelfTwo;

    public Market(Shelf shelfOne, Shelf shelfTwo) {
        this.shelfOne = shelfOne;
        this.shelfTwo = shelfTwo;
    }

    public Shelf getShelfOne() { return shelfOne; }
    public Shelf getShelfTwo() { return shelfTwo; }

    public double averageValueProducts() {
        List<Double> shelfPrices = new ArrayList<>();

        shelfPrices.add(shelfOne.getProductOne().getPrice());
        shelfPrices.add(shelfOne.getProductTwo().getPrice());
        shelfPrices.add(shelfOne.getProductThree().getPrice());

        shelfPrices.add(shelfTwo.getProductOne().getPrice());
        shelfPrices.add(shelfTwo.getProductTwo().getPrice());
        shelfPrices.add(shelfTwo.getProductThree().getPrice());

        double sum = 0;
        for (Double price : shelfPrices) {
            sum += price;
        }

        return sum / shelfPrices.size();
    }
}
