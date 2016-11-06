package dicussion9;

public class Vehicle {
    String makerName;
    String model;
    double engineLiters;
    String VIN;
    String year;
    String color;

    public Vehicle(String make, String model, double engSz, String id, String year,
            String color) {
        makerName = make;
        this.model = model;
        engineLiters = engSz;
        VIN = id;
        this.year = year;
        this.color = color;
    }

    public String getMake() {
        return makerName;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public double getEngineLiters() {
        return engineLiters;
    }

    public String getVIN() {
        return VIN;
    }
}
