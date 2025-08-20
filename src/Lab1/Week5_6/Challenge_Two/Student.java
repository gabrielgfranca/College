package Lab1.Week5_6.Challenge_Two;

public class Student {
    private String name;
    private String matriculation;
    private double gradeA;
    private double gradeB;

    public Student(String name, String matriculation, double gradeA, double gradeB) {
        this.name = name;
        this.matriculation = matriculation;
        this.gradeA = gradeA;
        this.gradeB = gradeB;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMatriculation() { return matriculation; }
    public String setMatriculation(String matriculation) { return this.matriculation = matriculation; }

    public double getGradeA() { return gradeA; }
    public double setGrade_A(double grade_B) { return this.gradeA =  grade_B; }

    public double getGradeB() { return gradeB; }
    public double setGrade_B(double grade_B) { return this.gradeB = grade_B; }

    public double calculateAverage() {
        return ((gradeA * 0.33) + (gradeB * 0.67));
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Matriculation: " + matriculation);
        System.out.println("Grade A: " + gradeA);
        System.out.println("Grade B: " + gradeB);
        System.out.println("Average: " + calculateAverage());
    }
}
