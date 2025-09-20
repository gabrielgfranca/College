package Lab1.Week9_10.Challenge_Three.src;

public abstract class Grade {
    private String startData;
    private String endData;

    public Grade() {
        this.startData = null;
        this.endData = null;
    }

    public Grade(String dataStart, String dataEnd) {
        this.startData = dataStart;
        this.endData = dataEnd;
    }

    public String getStartData() { return startData; }
    public String getEndData() { return endData; }
    public void setStartData(String startData) { this.startData = startData; }
    public void setEndData(String endData) { this.endData = endData; }

    public abstract double calculateFinalGrade();

    @Override
    public String toString() {
        return "Grade{ " +
                "Start Data=" + startData +
                ", End Data=" + endData +
                " }";
    }
}
