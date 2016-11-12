package infant;

public class Infant implements Comparable {

    private String name;
    private int age; // in months

    public Infant(String who, int months) {
        name = who;
        age = months;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void anotherMonth() {
        age = age + 1;
    }

    public int compareTo(Object other) {
        Infant otherInfant = (Infant) other;
        int othernamelen = otherInfant.getName().length();
        int thisnamelen = this.getName().length();
        return thisnamelen - othernamelen;
    }
}