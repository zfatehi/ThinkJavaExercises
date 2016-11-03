package owlcs121;

/**
 * This class contains data and methods pertaining to a college kid. The datum
 * contained in this class is: grade point average- gpa. This class derives from
 * Person.
 */

public class CollegeKid extends Person {
    public CollegeKid(String n, int a) {
        super(n, a);
    }

    private double gpa;

    public double getGPA() {
        return gpa;
    }

    public void setGPA(double g) {
        gpa = g;
    }

    public void print() {
        // System.out.println("Name: " + getName());
        // System.out.println("Age: " + getAge());
        // System.out.println("GPA: " + gpa);
        // Instead:
        super.print();
        System.out.println("GPA: " + gpa);
    }
}