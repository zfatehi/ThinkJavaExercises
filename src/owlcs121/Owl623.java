package owlcs121;

import javax.swing.JOptionPane;

public class Owl623 {
    public static void main(String[] args) {
        /*
         * Java's JOptionPane class contains a method called 
         * showInputDialog, which allows a user to input a string 
         * by using an input dialog box.Add a statement to the simple 
         * application below that will create this dialog box. Your program 
         * should store the text that's been entered in the dialog box in the 
         * String variable name.
         */
        String name = "";
        name = JOptionPane.showInputDialog("Please enter your name.");
    }
}
