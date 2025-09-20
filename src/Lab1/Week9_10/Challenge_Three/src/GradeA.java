package Lab1.Week9_10.Challenge_Three.src;

public class GradeA extends Grade {
    private double workScore;
    private double testScore;

    public GradeA() {
        workScore = 0;
        testScore = 0;
    }

    public GradeA(String startDate, String endDate, double workScore, double testScore) {
        super(startDate, endDate);
        this.workScore = workScore;
        this.testScore = testScore;
    }

    public double getWorkScore() { return workScore; }
    public double getTestScore() { return testScore; }
    public void setWorkScore(double workScore) { this.workScore = workScore; }
    public void setTestScore(double testScore) { this.testScore = testScore; }

    @Override
    public double calculateFinalGrade() {
        return (workScore * 0.3) + (testScore * 0.7);
    }

    @Override
    public String toString() {
        return "Grade A { " +
                "Work Score: " + workScore +
                ", Test Score: " + testScore +
                ", Final Grade: " + this.calculateFinalGrade() +
                " } " + super.toString();
    }
}
