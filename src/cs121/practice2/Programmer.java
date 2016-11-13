package cs121.practice2;

import java.util.Arrays;

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