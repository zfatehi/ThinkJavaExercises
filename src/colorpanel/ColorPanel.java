package colorpanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * <p>
 * Title: ColorPanel: This class demonstrates basic gui code and functionality.
 * </p>
 * <p>
 * Copyright: University of Massachusetts Amherst Copyright (c) 2004
 * </p>
 * <p>
 * Company: CCBIT University of Massachusetts Amherst
 * </p>
 * 
 * @author Robbie Moll
 * @version 1.0
 */
public class ColorPanel extends JPanel implements ActionListener {

    // define some colors to display
    public static final String RED = "red";
    public static final String BLUE = "blue";
    public static final String GREEN = "green";

    // the current color state
    public String currentColor;
    // the button that will change colors
    JButton changeColorButton;
    JButton quitButton;
    // the text field to take the user input
    JTextField userInput;
    // the text field to take the user input
    // the submit button
    JButton submitButton;

    public ColorPanel() {
        // create the change color button
        changeColorButton = new JButton("Change Color");
        // add the button to this class. Now the communication
        // is connected on both sides
        this.add(changeColorButton);
        // add the ActionListener, a reference
        // to this class, to the button
        changeColorButton.addActionListener(this);

        quitButton = new JButton("Quit");
        this.add(quitButton);
        quitButton.addActionListener(this);

        userInput = new JTextField(5);
        this.add(userInput);

        submitButton = new JButton("Submit");
        this.add(submitButton);
        submitButton.addActionListener(this);

        // initialize the color
        this.setBackground(Color.red);
        this.currentColor = RED;
        // set the initial size
        this.setPreferredSize(new Dimension(400, 200));
    }

    /**
     * This method allows the gui- this class- to take some action when some
     * event in the user interface is triggered. In this case, the component we
     * are interested in is the button: "changeColorButton". Since there is a
     * communication link between the button and this class, when the button is
     * clicked it will notify this class by calling the method actionPerformed.
     * This method will toggle between the three colors and set the background
     * of our gui. The The ActionEvent object that is passed to us identifies
     * the source of the event- in this case we are only interested in the
     * button, but you can imagine there could be many more components in our
     * gui that we would be listening to. contains the source of the event.
     * 
     * @param e
     *            the ActionEvent object
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == changeColorButton) {
            if (currentColor.equals(RED)) {
                setBackground(Color.blue);
                currentColor = BLUE;
            }

            else if (currentColor.equals(BLUE)) {
                setBackground(Color.green);
                currentColor = GREEN;
            }

            else if (currentColor.equals(GREEN)) {
                setBackground(Color.red);
                currentColor = RED;
            }
        } else if (e.getSource() == quitButton) {
            System.exit(0);
        } else if (e.getSource() == submitButton) {
            String enteredcolor = userInput.getText();
            if (enteredcolor.equals(RED)) {
                setBackground(Color.red);
                currentColor = RED;
            }

            else if (enteredcolor.equals(BLUE)) {
                setBackground(Color.blue);
                currentColor = BLUE;
            }

            else if (enteredcolor.equals(GREEN)) {
                setBackground(Color.green);
                currentColor = GREEN;
            } else {
                JOptionPane.showMessageDialog(this,
                        enteredcolor + " is not a color, dummy!");
            }
        }
    }

    // the method to start and run the gui
    public static void main(String[] args) {
        // create a frame to display our gui in
        JFrame frame = new JFrame("My Color Panel");
        // set the frame so that it will close on command
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create an instance of our gui
        ColorPanel newPanel = new ColorPanel();
        // set the gui into the frame
        frame.setContentPane(newPanel);
        // pack sets the size to the prefered values
        frame.pack();
        // now display the application
        frame.setVisible(true);
    }
}