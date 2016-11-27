package timers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class TimerExample extends JPanel implements ActionListener {

    private boolean colorToggle = true;
    private Timer clock = new Timer(2000, this);

    public TimerExample() {
        setPreferredSize(new Dimension(500, 500));
        clock.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (colorToggle) {
            setBackground(Color.red);
        } else {
            setBackground(Color.green);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clock) {
            colorToggle = !colorToggle;
            repaint();
        }
    }
}