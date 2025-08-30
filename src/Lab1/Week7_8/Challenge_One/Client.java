package Lab1.Week7_8.Challenge_One;

public class Client {
    private String name;
    private int age;
    private char gender;
    private String email;
    private String password;
    private Book book;

    public Client(String name, int age, char gender, String email, String password, Book book) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.book = book;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public char getGender() { return gender; }
    public void setPublishYear(char gender) { this.gender = gender; }

    public String getEmail() { return email; }
    public void setPrice(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Book getBook() { return book; }
    public void setBook(Book book) { this.book = book; }

    public void printInformation() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Gender: %c\n", gender);
        System.out.printf("Email: %s\n", email);
        System.out.printf("Password: %s\n", password);
        System.out.printf("The client %s has the book: %s, and the price per page is %.2f\n", name, book.getTitle(), book.pricePerPage());
    }
}
