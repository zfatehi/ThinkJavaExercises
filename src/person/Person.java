package person;

/**
 * <p>
 * Title: Person
 * </p>
 * <p>
 * Description: A class that contains information about a generic person.
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
public class Person implements Comparable {

    // member data
    private String name;
    private int age;
    private int height;
    private String phone;

    /**
     * constructor with four args.
     * 
     * @param n
     *            the person's name
     * @param ag
     *            the person's age
     * @param ht
     *            the person's height
     * @param p
     *            the person's phone number
     */
    public Person(String n, int ag, int ht, String p) {
        name = n;
        age = ag;
        height = ht;
        phone = p;
    }

    /**
     * get the name
     * 
     * @return String the name.
     */
    public final String getName() {
        return name;
    }

    /**
     * get the age.
     * 
     * @return int the age.
     */
    public final int getAge() {
        return age;
    }

    /**
     * get the height.
     * 
     * @return int the height.
     */
    public final int getHeight() {
        return height;
    }

    /**
     * get the phone number.
     * 
     * @return String the phone number.
     */
    public final String getPhoneNumber() {
        return phone;
    }

    /**
     * set the height.
     * 
     * @param newHeight.
     */
    public final void setHeight(int newHeight) {
        height = newHeight;
    }

    /**
     * Compares this object with the specified object for order.
     * 
     * @param o
     *            the Object to be compared.
     */
    public int compareTo(Object obj) {
        Person otherPerson = (Person) obj;
        return this.getAge() - otherPerson.getAge();
    }

    /**
     * get a String representation of the person's data.
     * 
     * @return String the representation of the data.
     */
    public String toString() {
        return getName() + " " + getAge() + " " + getPhoneNumber();
    }

}
