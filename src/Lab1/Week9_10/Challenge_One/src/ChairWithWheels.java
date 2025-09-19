package Lab1.Week9_10.Challenge_One.src;

public class ChairWithWheels extends Chair {
    private Data lastMaintenance;

    public ChairWithWheels(Color color, Data lastMaintenance) {
        super(color);
        this.lastMaintenance = lastMaintenance;
    }

    public Data getLastMaintenance() { return lastMaintenance; }

    public void setLastMaintenance(Data lastMaintenance) {  this.lastMaintenance = lastMaintenance; }

    @Override
    public String toString() {
        return "ChairWithWheels { " +
                "Last Maintenance = " + lastMaintenance +
                ", " + super.toString() +
                " }";
    }
}
