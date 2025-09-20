package Lab1.Week9_10.Challenge_Three.src;

public class GradeB extends Grade {
    private double activityScore;
    private double seminarScore;
    private double participationScore;

    public GradeB() {
        this.activityScore = 0;
        this.seminarScore = 0;
        this.participationScore = 0;
    }

    public GradeB(String startDate, String endDate, double activityScore, double seminarScore, double participationScore) {
        super(startDate, endDate);
        this.activityScore = activityScore;
        this.seminarScore = seminarScore;
        this.participationScore = participationScore;
    }

    public double getActivityScore() { return activityScore; }
    public double getSeminarScore() { return seminarScore; }
    public double getParticipationScore() { return participationScore; }
    public void setActivityScore(double activityScore) { this.activityScore = activityScore; }
    public void setSeminarScore(double seminarScore) { this.seminarScore = seminarScore; }
    public void setParticipationScore(double participationScore) { this.participationScore = participationScore; }

    @Override
    public double calculateFinalGrade() {
        return (activityScore * 0.3) + (seminarScore * 0.6) + (participationScore * 0.1);
    }

    @Override
    public String toString() {
        return "Grade B { " +
                "Activity Score: " + activityScore +
                ", Seminar Score: " + seminarScore +
                ", Participation Score: " + participationScore +
                ", Final Grade: " + this.calculateFinalGrade() +
                " } " + super.toString();
    }
}
