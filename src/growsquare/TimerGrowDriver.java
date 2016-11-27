package growsquare;

import intrographics.DisplayWindow;

public class TimerGrowDriver {

    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        TimerGrowSquare p = new TimerGrowSquare();
        d.addPanel(p);
        d.showFrame();
    }
}
