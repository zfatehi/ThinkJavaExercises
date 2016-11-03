package owlcs121;

public class LimeComparer {
    public static void main(String[] args) {
        PricedLime jacksLime = new PricedLime("India", 100);
        PricedLime jillsLime = new PricedLime("Mexico", 50);

        // Your job - using what you know about method accessibility for derived
        // classes - is to write statements that identify the country of origin
        // for the more expensive of the two limes. When you find the answer,
        // print the name of that country to the console.

        if (jacksLime.getPrice() > jillsLime.getPrice()) {
            System.out.println(jacksLime.getOrigin());
        } else if (jillsLime.getPrice() > jacksLime.getPrice()) {
            System.out.println(jillsLime.getOrigin());
        }

    }
}
