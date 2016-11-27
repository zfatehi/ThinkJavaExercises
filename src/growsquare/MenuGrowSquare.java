package growsquare;

import java.awt.Dimension;
import java.awt.Graphics;
// needed for event handling
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuGrowSquare extends JPanel implements ActionListener {

    JMenuBar b;
    JMenu growMenu = new JMenu("Grow");
    JMenuItem quit = new JMenuItem("Quit");
    JMenuItem grow = new JMenuItem("Grow");
    int edge = 100;

    public MenuGrowSquare(JMenuBar bar) {
        setPreferredSize(new Dimension(500, 500));
        b = bar;
        b.add(growMenu);
        growMenu.add(quit);
        quit.addActionListener(this);
        growMenu.add(grow);
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
