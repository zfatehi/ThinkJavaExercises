package cs121.practice2;

import java.util.Arrays;
/*Create a subclass of the Employee class called the Programmer class. 
 * A programmer has the following attributes in addition to an employee:

The programmer's security level (a String): High, Medium, Low.
A list (array of Strings) of programming languages the programmer 
knows. The list contains at least one language.

Both of these attribute values are initialized in the Programmer constructor.
Write the method getSecurityClearance that takes no parameters and return the programmer's 
clearance level. 

Write the method getLanguages that take no parameters and returns the list (array) 
of programming languages. 

Write a setSecurityClearance method that returns no value and allows the security 
clearance of a programmer to be changed to a value passed in to the method. 

Override the Employee class toString method so that it returns a String that includes 
the Programmer class attributes as well as the Employee class attributes. 
Remember that subclasses do not have direct access to private variables in their 
superclass. The String your method returns must match the example below when it is printed. 
Note that you will have to iterate through the array to produce the correct output.

Example: consider this programmer:
A programmer named Samantha Jones employed 10 years with a high 
security clearance and knows Java, C++, and SQL. After the following code executes:

String [] s1 = {"Java","C++","SQL"};
Programmer p1= new Programmer("Samantha", "Jones", 10, "High",s1); 
System.out.print(p1.toString());

this output is displayed:


Name (first, last): Samantha Jones, Years: 10, Clearance: High, Languages: Java C++ SQL 

*/

public class Programmer extends Employee {
    String securityclearance;
    String[] languages;

    public Programmer(String fName, String lName, int yrs, String sc, String[] lang) {
        super(fName, lName, yrs);
        securityclearance = sc;
        languages = lang;
    }

    public String getSecurityClearance() {
        return securityclearance;
    }

    public String[] getLanguages() {
        return languages;
    }

    private String getLanguagesAsOneString() {
        String idiomas = "";
        for (int i = 0; i < languages.length; i++) {
            idiomas = idiomas + " " + languages[i];
        }
        return idiomas;
    }

    // easier but puts square brackets around result: we don't want this so
    // write "for" loop out
    private String getLanguagesAsOneString2() {
        return Arrays.toString(languages);
    }

    public String toString() {
        return super.toString() + ", Clearance: " + getSecurityClearance()
                + ", Languages:" + getLanguagesAsOneString();
    }
}