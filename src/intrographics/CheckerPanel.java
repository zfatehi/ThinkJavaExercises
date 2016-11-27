package intrographics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CheckerPanel extends JPanel {
    private Color firstColor, secondColor;
    private int size;
    private int cellSide = 30;

    public CheckerPanel(Color c1, Color c2, int size) {
        setPreferredSize(new Dimension(500, 400));
        firstColor = c1;
        secondColor = c2;
        this.size = size;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if ((row + col) % 2 == 0) {
                    g.setColor(secondColor);
                } else {
                    g.setColor(firstColor);
                }
                g.fillRect(cellSide * col, cellSide * row, cellSide, cellSide);

            }
        }

    }
}
