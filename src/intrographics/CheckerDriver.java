package intrographics;

import java.awt.Color;

public class CheckerDriver {
    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        CheckerPanel p = new CheckerPanel(Color.blue, Color.red, 6);
        d.addPanel(p);
        d.showFrame();
    }
}
