package Lab1.Week7_8.Challenge_One.src;
import java.util.ArrayList;
import java.util.List;
import  java.util.Scanner;

public class Main {
    static final int ARRAY_LIMIT = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Client> clients = new ArrayList<>();

        for (int i = 0; i < ARRAY_LIMIT; i++) {
            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter your age: ");
            int age = input.nextInt();
            input.nextLine();

            System.out.print("Enter your gender: ");
            char gender = input.nextLine().charAt(0);

            System.out.print("Enter your email: ");
            String email = input.nextLine();

            System.out.print("Enter your password: ");
            String password = input.nextLine();

            System.out.print("Enter your book name: ");
            String title = input.nextLine();

            System.out.print("Enter the book author: ");
            String author = input.nextLine();

            System.out.print("Enter the book publish year: ");
            int publishYear = input.nextInt();
            input.nextLine();

            System.out.print("Enter the book price: ");
            double price = input.nextDouble();
            input.nextLine();

            System.out.print("Enter the book page amount: ");
            int pageAmount = input.nextInt();
            input.nextLine();

            Book book = new Book(title, author, publishYear, price, pageAmount);
            Client client = new Client(name, age, gender, email, password, book);

            clients.add(client);
        }

        System.out.println("\nClients Information`s");
        for (Client actualClient : clients) {
            actualClient.printInformation();
            System.out.print("\n");
        }
    }
}
