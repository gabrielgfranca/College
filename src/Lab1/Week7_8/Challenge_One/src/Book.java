package Lab1.Week7_8.Challenge_One.src;

public class Book {
    private String title;
    private String author;
    private int publishYear;
    private double price;
    private int pageAmount;

    public Book(String title, String author, int publishYear, double price, int pageAmount) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.price = price;
        this.pageAmount = pageAmount;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getPublishYear() { return publishYear; }
    public void setPublishYear(int publishYear) { this.publishYear = publishYear; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getPageAmount() { return pageAmount; }
    public void setPageAmount(int pageAmount) { this.pageAmount = pageAmount; }

    public double pricePerPage() {
        if (this.pageAmount > 0)
            return price / pageAmount;
        else
            return 0.0;
    }
}
