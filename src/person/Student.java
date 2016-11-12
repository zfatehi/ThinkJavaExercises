package person;

/**
 * <p>
 * Title: Student
 * </p>
 * <p>
 * Description: Subclass of Person, containing information about students.
 * </p>
 * <p>
 * Copyright: CCBIT University of Massachusetts Copyright (c) 2003
 * </p>
 * <p>
 * Company: University of Massachusetts
 * </p>
 * 
 * @author Robbie Moll
 * @version 1.0
 */
class Student extends Person {

    private double gpa;

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
     *            grade point average
     */
    public Student(String n, int ag, int ht, String p, double g) {
        super(n, ag, ht, p);
        gpa = g;
    }

    /**
     * get the GPA.
     * 
     * @return double the GPA.
     */
    public double getGPA() {
        return gpa;
    }

    /**
     * set the GPA.
     * 
     * @param newGPA
     */
    public void setGPA(double newGPA) {
        gpa = newGPA;
    }

    /**
     * get a String representation of the student's data.
     * 
     * @return String the representation of the data.
     */
    public String toString() {
        return super.toString() + " " + getGPA();
    }

}