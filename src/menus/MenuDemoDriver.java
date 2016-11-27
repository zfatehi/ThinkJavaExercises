package menus;

import javax.swing.JMenuBar;

import intrographics.DisplayWindow;

public class MenuDemoDriver {

    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        JMenuBar menuBar = new JMenuBar();
        d.setJMenuBar(menuBar);
        MenuColorPanel p = new MenuColorPanel(menuBar);
        d.addPanel(p);
        d.showFrame();
    }
}
