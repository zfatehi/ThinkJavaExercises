package timers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

public class RollHorizontal extends JPanel implements ActionListener {

    int width = 700;
    int height = 250;
    Timer ticker = new Timer(20, this); // 20 ms between signals
    int x = 0;
    int y = 200;
    int xVel = 2;
    JButton turn = new JButton("Turn");

    public RollHorizontal() {
        setPreferredSize(new Dimension(width, height));
        ticker.start();
        this.add(turn);
        turn.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.magenta);
        g.fillOval(x, y, 50, 50);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ticker) {
            if ((x < 650 && xVel > 0) || (x > 0 && xVel < 0))
                x += xVel; // shift ball to right or left 2 pixels
        }
        if (e.getSource() == turn) { // change direction of roll
            xVel = -xVel;
        }
        repaint();
    }
}