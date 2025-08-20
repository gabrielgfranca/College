package Lab1.Week5_6.Challenge_One;

public class Client {
    private String name;
    private int age;
    private char gender;
    private String email;
    private String password;

    public Client(String name, int age, char gender, String email, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }

    public void printClientInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
