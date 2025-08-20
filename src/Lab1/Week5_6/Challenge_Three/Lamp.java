package Lab1.Week5_6.Challenge_Three;

public class Lamp {
    private boolean isOne;

    public Lamp(boolean isOne) {
        this.isOne = isOne;
    }

    public boolean isOn() { return isOne; }
    public void setIsOn(boolean isOne) { this.isOne = isOne; }
}
