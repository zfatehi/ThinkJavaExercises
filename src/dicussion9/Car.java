package dicussion9;

public class Car extends Vehicle {
    double luggageCap;
    double passengerCap;

    public Car(String make, String model, double engSz, String id, String year,
            String color, double lugCap, double passCap) {
        super(make, model, engSz, id, year, color);
        luggageCap = lugCap;
        passengerCap = passCap;
    }

    public double getLuggageCap() {
        return luggageCap;
    }

    public double getPassengerCap() {
        return passengerCap;
    }

    public String toString() {
        return makerName + " " + model + " " + engineLiters + " " + VIN + " " + year
                + ", " + luggageCap + ", " + passengerCap;
    }

}