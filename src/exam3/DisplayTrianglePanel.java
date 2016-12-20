package exam3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisplayTrianglePanel extends JPanel implements ActionListener {

    private int x1 = 150, y1 = 150;
    private int x2 = 250, y2 = 250;
    private int x3 = -1, y3 = -1;
    JLabel xLabel = new JLabel("X value: ");
    JLabel yLabel = new JLabel("Y value: ");
    JTextField x = new JTextField(5);
    JTextField y = new JTextField(5);
    JButton displaytriangle = new JButton("Display Triangle");

    public DisplayTrianglePanel() {
        setPreferredSize(new Dimension(600, 400));
        this.add(xLabel);
        this.add(x);
        this.add(yLabel);
        this.add(y);
        this.add(displaytriangle);
        displaytriangle.addActionListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(x1, y1, 5, 5);
        g.fillOval(x2, y2, 5, 5);
        g.drawLine(x1, y1, x2, y2);
        if (x3 >= 0 && y3 >= 0) {
            g.fillOval(x3, y3, 5, 5);
            g.drawLine(x1, y1, x3, y3);
            g.drawLine(x2, y2, x3, y3);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == displaytriangle) {
            x3 = Integer.parseInt(x.getText());
            y3 = Integer.parseInt(y.getText());
            repaint();
        }
    }
}
