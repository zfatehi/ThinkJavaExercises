package growsquare;

import javax.swing.JMenuBar;

import intrographics.DisplayWindow;

public class MenuGrowDriver {

    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        JMenuBar bar = new JMenuBar();
        d.setJMenuBar(bar);
        MenuGrowSquare p = new MenuGrowSquare(bar);
        d.addPanel(p);
        d.showFrame();
    }
}
