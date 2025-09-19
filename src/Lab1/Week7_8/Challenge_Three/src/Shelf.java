package Lab1.Week7_8.Challenge_Three.src;

public class Shelf {
    private Product productOne;
    private Product productTwo;
    private Product productThree;

    public Shelf(Product productOne, Product productTwo, Product productThree) {
        this.productOne = productOne;
        this.productTwo = productTwo;
        this.productThree = productThree;
    }

    public Shelf() {
        this.productOne = null;
        this.productTwo = null;
        this.productThree = null;
    }

    public Product getProductOne() { return productOne; }
    public Product getProductTwo() { return productTwo; }
    public Product getProductThree() { return productThree; }

    public void setProductOne(Product productOne) { this.productOne = productOne; }
    public void setProductTwo(Product productTwo) { this.productTwo = productTwo; }
    public void setProductThree(Product productThree) { this.productThree = productThree; }

    public Product mostExpensiveProduct(){
        Product mostExpensiveProduct = null;

        if (productOne != null) {
            mostExpensiveProduct = productOne;
        }

        if (productTwo != null && (mostExpensiveProduct == null || productTwo.getPrice() > mostExpensiveProduct.getPrice())) {
            mostExpensiveProduct = productTwo;
        }

        if (productThree != null && (mostExpensiveProduct == null || productThree.getPrice() > mostExpensiveProduct.getPrice())) {
            mostExpensiveProduct = productThree;
        }

        return mostExpensiveProduct;
    }

    @Override
    public String toString(){
        return "Shelf {" +
                "\n  Product One: " + (productOne != null ? productOne.printInfo() : "empty") +
                "\n  Product Two: " + (productTwo != null ? productTwo.printInfo() : "empty") +
                "\n  Product Three: " + (productThree != null ? productThree.printInfo() : "empty") +
                "\n}";
    }
}
