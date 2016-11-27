package events;

import intrographics.DisplayWindow;

public class SquareDriver {

    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        SquarePanel p = new SquarePanel();
        d.addPanel(p);
        d.showFrame();
    }
}
