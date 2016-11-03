package owlcs121;

public class DairyFarm extends Farm {
    private int cows; // number of cows on farm

    public DairyFarm(String who, int acres, int ct) {
        super(who, acres);
        cows = ct;
    }

    public int getCows() {
        return cows;
    }

    public void setCows(int c) {
        cows = c;
    }

    /**
     * cowDensity, which takes no arguments, and which returns (as a double
     * value) the number of cows per acre on a DairyFarm.
     */
    public double cowDensity() {
        return ((double) cows) / getAcres();
    }
}
