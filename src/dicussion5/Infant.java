package dicussion5;

public class Infant {

    private String name;
    private int age;

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

    public void addAnotherMonth() {
        age = age + 1;
    }

    public String toString() {
        return "Infant name: " + name + ", age (in months): " + age;
    }
}
