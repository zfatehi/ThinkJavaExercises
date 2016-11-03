package cs121projects;

public class Employee {
    private int age;
    private String fName;
    private String lName;

    public Employee(String fn, String ln, int age) {
        this.age = age;
        fName = fn;
        lName = ln;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return fName;
    }

    public String getLasttName() {
        return lName;
    }

    public String toString() {
        return fName + " " + lName + " " + age;
    }
}
