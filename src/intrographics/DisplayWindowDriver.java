package intrographics;

public class DisplayWindowDriver {
    public static void main(String[] args) {
        DisplayWindow dw = new DisplayWindow();
        dw.addPanel(new BabyPanel());
        dw.showFrame();
    }
}
