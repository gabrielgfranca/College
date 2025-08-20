package Lab1.Week5_6.Challenge_One;

public class Book {
    private String title;
    private String author;
    private int year;
    private double price;
    private int pages;

    public Book(String title, String author, int year, double price, int pages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
        this.pages = pages;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getPages() { return pages; }
    public void setPages(int pages) { this.pages = pages; }

    public double pricePerPage() {
        if (this.pages > 0) {
            return price / pages;
        } else {
            return 0.0;
        }
    }

    public void printBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + pages);
    }
}
