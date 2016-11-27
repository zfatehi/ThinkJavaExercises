package menus;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MenuColorPanel extends JPanel implements ActionListener {

    JMenuBar b;
    JMenu menu = new JMenu("Colors");
    JMenuItem red = new JMenuItem("red");
    JMenuItem blue = new JMenuItem("blue");
    JMenuItem quit = new JMenuItem("Quit");

    public MenuColorPanel(JMenuBar bar) {
        setPreferredSize(new Dimension(500, 800));
        this.b = bar;
        b.add(menu);
        menu.add(red);
        menu.add(blue);
        menu.add(quit);
        red.addActionListener(this);
        blue.addActionListener(this);
        quit.addActionListener(this);
        setBackground(Color.white);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == quit)
            System.exit(0);
        if (e.getSource() == red)
            setBackground(Color.red);
        else if (e.getSource() == blue)
            setBackground(Color.blue);
    }
}