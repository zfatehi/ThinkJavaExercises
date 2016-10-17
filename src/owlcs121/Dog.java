package owlcs121;

public class Dog {
    String name;
    String breed;
    double weight;
    boolean showdog;

    public Dog(String n, String b, double wt, boolean sd) {
        name = n;
        breed = b;
        weight = wt;
        showdog = sd;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isShowdog() {
        return showdog;
    }

    public void setName(String anotherName) {
        name = anotherName;
    }

    public void setBreed(String anotherBreed) {
        breed = anotherBreed;
    }

    public void setWeight(double amt) {
        weight = amt;
    }

    public void setShowdog(boolean sdog) {
        showdog = sdog;
    }
}
