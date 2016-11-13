package dicussion9;

public class Truck extends Vehicle {
    double maxWeight;

    public Truck(String make, String model, double engSz, String id, String year,
            String color, double maxWt) {
        super(make, model, engSz, id, year, color);
        maxWeight = maxWt;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public String toString() {
        return makerName + " " + model + " " + engineLiters + " " + VIN + " " + color
                + " " + year + ", " + maxWeight;
    }

}