package Lab1.Week7_8.Chanllenge_Three.src;

public class Product {
    static final int DAY = 25;
    static final int MONTH = 4;
    static final int YEAR = 2023;

    private String name;
    private double price;
    private Data validity;

    public Product(String name, double price, Data validity) {
        this.name = name;
        this.price = price;
        this.validity = validity;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public Data getValidity() { return validity; }

    public void setName(String name) { this.name = name; }
    public void setPrice(double price) { this.price = price; }
    public void setValidity(Data validity) { this.validity = validity; }

    public boolean isExpired() {
        return validity.isBefore(DAY, MONTH, YEAR);
    }

    public String printInfo() {
        return name + " - R$" + price + (isExpired() ? " (VENCIDO)" : " (VÁLIDO)");
    }

    @Override
    public String toString() {
        return printInfo();
    }
}
