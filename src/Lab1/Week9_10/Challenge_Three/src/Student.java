package Lab1.Week9_10.Challenge_Three.src;

public class Student {
    private String name;
    private Grade gradeA;
    private Grade gradeB;

    public Student(String name, Grade gradeA, Grade gradeB) {
        this.name = name;
        this.gradeA = gradeA;
        this.gradeB = gradeB;
    }

    public String getName() { return name; }
    public Grade getGradeA() { return gradeA; }
    public Grade getGradeB() { return gradeB; }
    public void setName(String name) { this.name = name; }
    public void setGradeA(Grade gradeA) { this.gradeA = gradeA; }
    public void setGradeB(Grade gradeB) { this.gradeB = gradeB; }

    public double calculateFinalGrade(){
        double gA = gradeA.calculateFinalGrade() * 0.33;
        double gB = gradeB.calculateFinalGrade() * 0.67;
        return gA + gB;
    }

    @Override
    public String toString() {
        return "Student { " +
                "name=" + name +
                ", gradeA=" + gradeA.toString() +
                ", gradeB=" + gradeB.toString() +
                " }";
    }
}
