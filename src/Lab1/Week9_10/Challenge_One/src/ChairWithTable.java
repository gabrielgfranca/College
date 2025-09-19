package Lab1.Week9_10.Challenge_One.src;

public class ChairWithTable extends Chair {
    private int tableWidth;
    private int tableDepth;

    public ChairWithTable(Color color, int tableWidth, int tableDepth) {
        super(color);
        this.tableWidth = tableWidth;
        this.tableDepth = tableDepth;
    }

    public int getTableWidth() { return tableWidth; }
    public int getTableDepth() { return tableDepth; }

    public void setTableWidth(int tableWidth) { this.tableWidth = tableWidth; }
    public void setTableDepth(int tableDepth) { this.tableDepth = tableDepth; }

    @Override
    public String toString() {
        return "ChairWithTable { " +
                "Table Width = " + tableWidth +
                ", Table Depth = " + tableDepth +
                ", " + super.toString() +
                " }";
    }
}
