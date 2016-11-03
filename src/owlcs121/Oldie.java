package owlcs121;

/**
 * This class contains data and methods pertaining to an oldie- i.e. someone
 * over the age of, oh say 30. The datum contained in this class is: whether or
 * not this person is a Perry Como fan. This class derives from Person.
 */
public class Oldie extends Person {
    public Oldie(String n, int a) {
        super(n, a);
    }

    private boolean perryComoFan;

    public boolean isPerryComoFan() {
        return perryComoFan;
    }

    public void setPerryComoFan(boolean f) {
        perryComoFan = f;
    }

    public void print() {
        // System.out.println("Name: " + getName());
        // System.out.println("Age: " + getAge());
        // System.out.println("Perry Fan: " + perryComoFan);
        // Instead:
        super.print();
        System.out.println("Perry Fan: " + perryComoFan);
    }
}
