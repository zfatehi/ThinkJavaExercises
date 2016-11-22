package intrographics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BabyPanel extends JPanel {
    public BabyPanel() {
        setPreferredSize(new Dimension(700, 300));
        setBackground(Color.red);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawLine(0, 0, 30, 150);
        g.drawLine(30, 150, 695, 150);
        g.drawString("good day!", 10, 15);
    }
}
