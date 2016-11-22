package intrographics;

import java.awt.Container;

import javax.swing.JFrame;

public class BabyGraphics {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Starter Work");
        Container c = frame.getContentPane();
        BabyPanel p = new BabyPanel();
        c.add(p); // add panel to frame's container
        frame.pack(); // prepares frame for display
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
