package growsquare;

import java.awt.Dimension;
import java.awt.Graphics;
// needed for event handling
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TimerGrowSquare extends JPanel implements ActionListener {

    private JButton quit = new JButton("Quit");
    private Timer clock;
    private int edge = 100;

    public TimerGrowSquare() {
        setPreferredSize(new Dimension(500, 500));
        this.add(quit);
        quit.addActionListener(this);
        clock = new Timer(100, this);
        clock.start();

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(0, 0, edge, edge);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quit) {
            System.exit(0);
        }
        if (e.getSource() == clock) {
            edge = edge + 4;
            repaint();
        }
    }
}