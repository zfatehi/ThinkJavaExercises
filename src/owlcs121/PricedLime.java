package owlcs121;

public class PricedLime extends Lime {
    private double price; // cost of a lime

    public PricedLime(String where, double amt) {
        super(where);
        price = amt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}