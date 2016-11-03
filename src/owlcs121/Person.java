package owlcs121;

/**
 * This class contains data and methods pertaining to a person. The data
 * contained in this class are: name and age.
 */

public class Person {

    private String name;
    private int age;

    public Person(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
