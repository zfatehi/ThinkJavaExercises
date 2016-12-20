package exam3;

import intrographics.DisplayWindow;

public class DisplayTriangleDriver {

    public static void main(String[] args) {
        DisplayWindow d = new DisplayWindow();
        DisplayTrianglePanel p = new DisplayTrianglePanel();
        d.addPanel(p);
        d.showFrame();
    }

}
