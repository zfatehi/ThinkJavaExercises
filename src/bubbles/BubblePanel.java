package bubbles;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BubblePanel extends JPanel implements ActionListener {

    JButton quit = new JButton("Quit");
    JButton bubbles = new JButton("Bubbles");
    JLabel counterLabel = new JLabel("Enter bubble count: ");
    JTextField counter = new JTextField(5);

    private int count;
    private Rectangle[] boxes;
    private BubbleModel m;

    public BubblePanel(BubbleModel m) { // pass reference to model
        setPreferredSize(new Dimension(700, 700));
        this.m = m;
        this.add(counterLabel);
        this.add(counter);
        this.add(bubbles);
        this.add(quit);
        bubbles.addActionListener(this);
        quit.addActionListener(this);
        setForeground(Color.blue);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBubbles(g);
    }

    public void drawBubbles(Graphics g) {
        if (boxes != null) {
            for (int j = 0; j < boxes.length; j++)
                g.drawOval(boxes[j].x, boxes[j].y, boxes[j].width, boxes[j].height);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quit)
            System.exit(0);
        if (e.getSource() == bubbles) {
            count = Integer.parseInt(counter.getText());
            boxes = m.makeBubbles(count);
            repaint();
        }
    }
}