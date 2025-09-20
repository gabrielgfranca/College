package Lab1.Week9_10.Challenge_Three.src;

public class MyClass {
    private String code;
    private final Student[] students = new Student[3];

    public MyClass(String code, Student student1, Student student2, Student student3) {
        this.code = code;
        this.students[0] = student1;
        this.students[1] = student2;
        this.students[2] = student3;
    }

    public String getCode() { return code; }
    public Student getStudent1() { return students[0]; }
    public Student getStudent2() { return students[1]; }
    public Student getStudent3() { return students[2]; }
    public void setCode(String code) { this.code = code; }
    public void setStudent1(Student student1) { this.students[0] = student1; }
    public void setStudent2(Student student2) { this.students[1] = student2; }
    public void setStudent3(Student student3) { this.students[2] = student3; }

    public double averageClassNotes() {
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                sum += student.calculateFinalGrade();
                count++;
            }
        }
        return (count == 0) ? -1 : sum / count;
    }

    public void changeNotesGradeA(String studentName, double newWorkScore, double newTestScore) {
        for (Student student : students) {
            if (student != null && student.getName().equals(studentName)) {
                GradeA ga = (GradeA) student.getGradeA();
                ga.setWorkScore(newWorkScore);
                ga.setTestScore(newTestScore);
            }
        }
    }

    public void changeNotesGradeB(String studentName, double newActivityScore, double newSeminarScore, double newParticipationScore) {
        for (Student student : students) {
            if (student != null && student.getName().equals(studentName)) {
                GradeB gb = (GradeB) student.getGradeB();
                gb.setActivityScore(newActivityScore);
                gb.setSeminarScore(newSeminarScore);
                gb.setParticipationScore(newParticipationScore);
            }
        }
    }
}
