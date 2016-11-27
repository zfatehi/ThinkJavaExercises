package bubbles;

import intrographics.DisplayWindow;

public class BubbleDriver {

    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        BubbleModel m = new BubbleModel();
        BubblePanel b = new BubblePanel(m);
        d.addPanel(b);
        d.showFrame();
    }
}