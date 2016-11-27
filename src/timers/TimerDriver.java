package timers;

import intrographics.DisplayWindow;

public class TimerDriver {
    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        TimerExample p = new TimerExample();
        d.addPanel(p);
        d.showFrame();
    }
}
