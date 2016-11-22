package intrographics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class TryoutPanel extends JPanel {

    private Color myColor;

    public TryoutPanel(Color c) {
        setPreferredSize(new Dimension(500, 400));
        myColor = c;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setForeground(myColor);
        g.drawString("top", 10, 50);
        g.drawLine(10, 60, 200, 60);
        g.drawString("middle", 10, 80);
        g.drawLine(10, 90, 200, 90);
        g.drawString("bottom", 10, 110);
        g.drawLine(10, 120, 200, 120);
        g.drawRect(200, 300, 100, 50);
        g.drawOval(200, 300, 100, 50);
        for (int j = 0; j < 9; j++)
            g.drawOval(50, 200, 10 + 20 * j, 210 - 20 * j);
    }
}
