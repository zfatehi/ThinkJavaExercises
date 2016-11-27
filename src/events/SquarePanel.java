package events;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
// needed for event handling
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SquarePanel extends JPanel implements ActionListener {
    // make button object
    JButton quit = new JButton("Quit");
    JButton square = new JButton("Square");
    JTextField x = new JTextField(5);
    JTextField y = new JTextField(5);
    // location of rectangle northwest corner
    private int xpos, ypos;

    public SquarePanel() {
        setPreferredSize(new Dimension(475, 125));
        setBackground(Color.green);
        // place quit button in panel
        this.add(quit);
        // panel is listener for quit button
        quit.addActionListener(this);
        // place square button in panel
        this.add(square);
        // panel is listener for square button
        square.addActionListener(this);
        // add position input components to panel
        x.setText("0");
        y.setText("0");
        this.add(x);
        this.add(y);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(xpos, ypos, 50, 50);
    }

    // This method specifies listener actions
    public void actionPerformed(ActionEvent e) {
        // quit button signal
        if (e.getSource() == quit)
            // terminate program
            System.exit(0);
        else
        // square button signal
        if (e.getSource() == square) {
            // get x-corner location from text area
            xpos = Integer.parseInt(x.getText());
            // get y-corner location from text area
            ypos = Integer.parseInt(y.getText());
            repaint();
        }
    }
}