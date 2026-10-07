package train;

public class WagonNode {
    private String wagonName;
    private WagonNode nextWagon;

    public WagonNode(String wagonName) {
        this.wagonName = wagonName;
    }

    public String getWagonName() {
        return wagonName;
    }

    public WagonNode getNextWagon() {
        return nextWagon;
    }

    public void setNextWagon(WagonNode nextWagon) {
        this.nextWagon = nextWagon;
    }

    @Override
    public String toString() {
        return this.wagonName;
    }

    // ----------------------------------------------------------------------
    // Assignment 6 (ignore these code lines in all prior assignments...)
    // ----------------------------------------------------------------------

    private WagonNode previousWagon;

    public WagonNode getPreviousWagon() {
        return previousWagon;
    }

    public void setPreviousWagon(WagonNode previousWagon) {
        this.previousWagon = previousWagon;
    }
}
