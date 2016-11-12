package person;

/***
 * <p>
 * Title:Employee
 * </p>
 * *
 * <p>
 * Description:Subclass of Person,contains information about employees.
 * </p>
 * *
 * <p>
 * Copyright:CCBIT University of Massachusetts Copyright(c)2003
 * </p>
 * *
 * <p>
 * Company:University of Massachusetts
 * </p>
 * *@author Robbie Moll
 * 
 * @version 1.0
 */
class Employee extends Person {

    private double salary;

    /**
     * constructor with five args.
     * 
     * @param n
     *            the name
     * @param ag
     *            the age
     * @param ht
     *            the height
     * @param p
     *            the phone number
     * @param the
     *            salary
     */
    public Employee(String n, int ag, int ht, String p, double s) {
        super(n, ag, ht, p);
        salary = s;
    }

    /**
     * Get the salary.
     * 
     * @return double the salary.
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Raise the employee's salary by a given percent.
     * 
     * @param percentRaise
     */
    public void raise(double percentRaise) {
        salary *= (1 + percentRaise);
    }

    /**
     * get a String representation of the employee's data.
     * 
     * @return String the representation of the data.
     */
    public String toString() {
        return super.toString() + " $" + getSalary();
    }

}
