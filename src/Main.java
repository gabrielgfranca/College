import Lab1.Week5_6.Challenge_One.Book;
import Lab1.Week5_6.Challenge_One.Client;
import Lab1.Week5_6.Challenge_Two.Student;

public class Main {
    public static void main(String[] args) {
        // Challenge One
        Book book1 = new Book("Book One", "Gabriel", 2023, 39.90, 271);
        Book book2 = new Book("Book Two", "Gabriel", 2024, 42.90, 314);
        Book book3 = new Book("Book Three", "Gabriel", 2025, 52.90, 298);
        Client client1 = new Client("França", 19, 'M', "client1@gmail.com", "1234");
        Client client2 = new Client("Gregori", 21, 'M', "client2@gmail.com", "233444");
        Client client3 = new Client("Mariana", 20, 'F', "client3@gmail.com", "222110");

        // Challenge Two
        Student gabriel = new Student("Gabriel", "1585258", 5.0, 9.0);
        Student gregori = new Student("Gregori", "2254879", 8.0, 2.0);
        Student mariana = new Student("Mariana", "0085994", 7.0, 1.0);
    }
}