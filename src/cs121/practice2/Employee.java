package cs121.practice2;

public class Employee {
    private String firstName;
    private String lastName;
    private int yearsEmployed;

    public Employee(String fName, String lName, int yrs) {
        firstName = fName;
        lastName = lName;
        yearsEmployed = yrs;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsEmployed() {
        return yearsEmployed;
    }

    public void addToYearsEmployed(int amt) {
        yearsEmployed += amt;
    }

    public String toString() {
        return ("Name (first, last): " + firstName + " " + lastName + ", Years: "
                + yearsEmployed);
    }
}