package owlcs121;

public class Driver {
    public static void main(String[] args) {
        double distance = 400.48;
        double fuel = 21.4;
        AutoTrip myTrip = new AutoTrip(distance, fuel);
        System.out.print("My car traveled " + myTrip.getDistance() + " miles ");
        System.out.println("on " + myTrip.getFuel() + " gallons of gasoline.");
        double mileage = myTrip.getMPG(); // get miles per gallon
        System.out.println("My mileage was " + mileage + ".");
    }
}
