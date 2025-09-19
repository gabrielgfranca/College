package Lab1.Week9_10.Challenge_One.src;

public class Chair {
    private Color color;
    private Student student;

    public Chair(Color color) {
        this.color = color;
        this.student = null;
    }

    public Color getColor() { return color; }
    public Student getStudent() { return student; }

    public void setColor(Color color) { this.color = color; }
    public void setStudent(Student student) { this.student = student; }

    @Override
    public String toString() {
        return "Chair { " +
                "Color = " + color +
                ", Student = " + (student != null ? student.toString() : "Empty") +
                " }";
    }
}
