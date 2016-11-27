package events;

import intrographics.DisplayWindow;

public class BabyButtonDriver2 {

    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        BabyControlPanel2 p = new BabyControlPanel2();
        d.addPanel(p);
        d.showFrame();
    }
}