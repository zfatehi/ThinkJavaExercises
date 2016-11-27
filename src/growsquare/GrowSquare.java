package growsquare;

import java.awt.Dimension;
import java.awt.Graphics;
// needed for event handling
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class GrowSquare extends JPanel implements ActionListener {

    private JButton quit = new JButton("Quit"); // a quit button
    private JButton grow = new JButton("Grow"); // a grow button
    private int edge = 100;

    public GrowSquare() {
        setPreferredSize(new Dimension(500, 500));
        this.add(quit);
        quit.addActionListener(this);
        this.add(grow);
        grow.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(0, 0, edge, edge);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quit) {
            System.exit(0); // quit!
        }
        if (e.getSource() == grow) {
            edge = edge + 20; // grow each edge by 20
            repaint();
        }
    }
}
