package growsquare;

import intrographics.DisplayWindow;

public class GrowDriver {

    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        GrowSquare p = new GrowSquare();
        d.addPanel(p);
        d.showFrame();
    }
}
