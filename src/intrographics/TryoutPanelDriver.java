package intrographics;

import java.awt.Color;

public class TryoutPanelDriver {
    public static void main(String[] args) {
        DisplayWindow dw = new DisplayWindow();
        dw.addPanel(new TryoutPanel(Color.magenta.brighter()));
        dw.showFrame();
    }
}
