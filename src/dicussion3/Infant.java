package dicussion3;

public class Infant {
    private String name;
    private int age; // age in months

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

    public void setAge(int newAge) {
        age = newAge;
    }

    public void anotherMonth() {
        age = age + 1;
    }

}
