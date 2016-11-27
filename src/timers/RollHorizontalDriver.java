package timers;

import intrographics.DisplayWindow;

public class RollHorizontalDriver {
    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        RollHorizontal p = new RollHorizontal();
        d.addPanel(p);
        d.showFrame();
    }
}
