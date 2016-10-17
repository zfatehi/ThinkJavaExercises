package owlcs121;

public class PetDriver {
    public static void main(String[] args) {
        int weight = 40;
        Pet doggie = new Pet("Rover", weight);
        System.out.println("my pet's name is " + doggie.getName());
        System.out.println("my pet's weight is " + doggie.getWeight());
    }
}
