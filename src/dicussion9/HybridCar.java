package dicussion9;

public class HybridCar extends Car {
    double batteryCap;

    public HybridCar(String make, String model, double engSz, String id, String year,
            String color, double lugCap, double passCap, double batteryCap) {
        super(make, model, engSz, id, year, color, lugCap, passCap);
        this.batteryCap = batteryCap;
    }
}
