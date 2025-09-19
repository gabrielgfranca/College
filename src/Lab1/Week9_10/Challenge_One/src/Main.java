package Lab1.Week9_10.Challenge_One.src;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Create 4 chairs for the room ---
        Chair[] chairs = new Chair[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Chair " + (i + 1) + ":");

            // Ask for chair color
            System.out.print("Enter R value (0-255): ");
            int r = input.nextInt();
            System.out.print("Enter G value (0-255): ");
            int g = input.nextInt();
            System.out.print("Enter B value (0-255): ");
            int b = input.nextInt();
            Color color = new Color(r, g, b);

            // Ask for chair type
            System.out.print("Enter chair type (table/wheels/normal): ");
            String type = input.next();

            // Create chair based on type
            if (type.equalsIgnoreCase("table")) {
                System.out.print("Enter table width: ");
                int width = input.nextInt();
                System.out.print("Enter table depth: ");
                int depth = input.nextInt();
                chairs[i] = new ChairWithTable(color, width, depth);
            } else if (type.equalsIgnoreCase("wheels")) {
                System.out.print("Enter last maintenance date (day month year): ");
                int day = input.nextInt();
                int month = input.nextInt();
                int year = input.nextInt();
                Data lastMaintenance = new Data(day, month, year);
                chairs[i] = new ChairWithWheels(color, lastMaintenance);
            } else {
                chairs[i] = new Chair(color); // normal chair
            }
        }

        // --- Create the room ---
        System.out.print("Enter room name: ");
        input.nextLine(); // consume newline
        String roomName = input.nextLine();
        Room room = new Room(roomName, chairs[0], chairs[1], chairs[2], chairs[3]);

        // --- Print room information ---
        System.out.println(room.toString());

        // --- Try to let 6 students enter the room ---
        for (int i = 1; i <= 6; i++) {
            System.out.print("Enter student " + i + " name: ");
            String studentName = input.nextLine();
            System.out.print("Enter student " + i + " age: ");
            int studentAge = input.nextInt();;
            Student student = new Student(studentName, studentAge);

            System.out.print("Which type of chair do you want (table/wheels)? ");
            String chairType = input.nextLine();

            Chair c = room.enterStudent(student, chairType);
            if (c != null) {
                System.out.println("Student sat on chair: " + c.toString());
            } else {
                System.out.println("No available chair for student " + studentName);
            }
        }

        // --- Print areas of all table chairs ---
        System.out.println("\nTable areas:");
        for (Chair c : room.getChairs()) {
            if (c instanceof ChairWithTable) {
                ChairWithTable tableChair = (ChairWithTable) c;
                int area = tableChair.getTableWidth() * tableChair.getTableDepth();
                System.out.println("Table area: " + area + " units²");
            }
        }

        // --- Print last maintenance of wheel chairs ---
        System.out.println("\nLast maintenance dates of chairs with wheels:");
        for (Chair c : room.getChairs()) {
            if (c instanceof ChairWithWheels) {
                ChairWithWheels wheelChair = (ChairWithWheels) c;
                System.out.println("Chair: " + wheelChair.getLastMaintenance().toString());
            }
        }

        // --- Search for a student and show chair color ---
        System.out.print("\nEnter a student name to search: ");
        String searchName = input.nextLine();
        Chair foundChair = null;

        for (Chair c : room.getChairs()) {
            if (c.getStudent() != null && c.getStudent().getName().equalsIgnoreCase(searchName)) {
                foundChair = c;
                break;
            }
        }

        if (foundChair != null) {
            int R = foundChair.getColor().getR();
            int G = foundChair.getColor().getG();
            int B = foundChair.getColor().getB();
            JFrame frame = new JFrame();
            frame.setSize(200, 200);
            frame.getContentPane().setBackground(new java.awt.Color(R, G, B)); // set color
            frame.setVisible(true);
        } else {
            System.out.println("Student not found in the room.");
        }

        input.close();
    }
}
