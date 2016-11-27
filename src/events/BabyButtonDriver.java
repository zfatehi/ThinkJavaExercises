package events;

import intrographics.DisplayWindow;

public class BabyButtonDriver {

    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        BabyControlPanel p = new BabyControlPanel();
        d.addPanel(p);
        d.showFrame();
    }
}