package Lab1.Week9_10.Challenge_Three.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // === Create Students ===
        System.out.print("Enter the class code: ");
        String code = sc.nextLine();

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");

            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            // Grade A
            System.out.print("Enter Work Score (Grade A): ");
            double workScore = sc.nextDouble();
            System.out.print("Enter Test Score (Grade A): ");
            double testScore = sc.nextDouble();
            sc.nextLine(); // consume leftover newline

            GradeA ga = new GradeA("01/01/2025", "30/06/2025", workScore, testScore);

            // Grade B
            System.out.print("Enter Activity Score (Grade B): ");
            double activityScore = sc.nextDouble();
            System.out.print("Enter Seminar Score (Grade B): ");
            double seminarScore = sc.nextDouble();
            System.out.print("Enter Participation Score (Grade B): ");
            double participationScore = sc.nextDouble();
            sc.nextLine(); // consume leftover newline

            GradeB gb = new GradeB("01/01/2025", "30/06/2025", activityScore, seminarScore, participationScore);

            students[i] = new Student(name, ga, gb);
        }

        // === Create Class ===
        MyClass myClass = new MyClass(code, students[0], students[1], students[2]);

        // === Print average grade ===
        System.out.println("\nClass Average Grade: " + myClass.averageClassNotes());

        // === Check if students passed ===
        System.out.println("\n--- Results ---");
        for (Student student : students) {
            double finalGrade = student.calculateFinalGrade();
            if (finalGrade >= 6.0) {
                System.out.println("Student " + student.getName() + ": Passed!");
            } else {
                System.out.println("Student " + student.getName() + ": Needs Grade C.");
            }
        }

        sc.close();
    }
}
