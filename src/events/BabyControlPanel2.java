package events;

import java.awt.Color;
import java.awt.Dimension;
// needed for event handling
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BabyControlPanel2 extends JPanel implements ActionListener {

    JButton quit = new JButton("Quit"); // make button object
    JButton blue = new JButton("Blue"); // make second button object

    public BabyControlPanel2() {
        setPreferredSize(new Dimension(700, 300));
        setBackground(Color.red);
        this.add(quit); // place button in panel
        this.add(blue); // add blue button
        quit.addActionListener(this); // panel is listener for button
        blue.addActionListener(this); // panel is listener for button

    }

    public void actionPerformed(ActionEvent e) { // what happens
        if (e.getSource() == quit) {
            // when panel hears button
            // System.exit(0);
            JOptionPane.showMessageDialog(this, "Quit touching me!");
        } else if (e.getSource() == blue) {
            // when panel hears button
            setBackground(Color.blue);
        }
    }
}
