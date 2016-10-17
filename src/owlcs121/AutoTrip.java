package owlcs121;

public class AutoTrip {

    private double distance;
    private double fuel;

    public AutoTrip(double miles, double gallons) {
        distance = miles;
        fuel = gallons;
    }

    public double getDistance() {
        return distance;
    }

    public double getFuel() {
        return fuel;
    }

    public double getMPG() {
        return distance / fuel;
    }
}
