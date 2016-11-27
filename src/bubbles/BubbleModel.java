package bubbles;

import java.awt.Rectangle;
import java.util.Random;

public class BubbleModel {

    private Rectangle[] boxes; // will be outlines for oval-shaped bubbles
    private int sizeRange = 150;
    private int posRange = 400;

    Random r = new Random();

    public BubbleModel() {
    }

    Rectangle ranRect() {
        int x = r.nextInt(posRange);
        int y = r.nextInt(posRange);
        int width = r.nextInt(sizeRange);
        int height = r.nextInt(sizeRange);

        Rectangle rec = new Rectangle(x, y, width, height);
        return rec;
    }

    public Rectangle[] makeBubbles(int count) {
        boxes = new Rectangle[count];
        for (int j = 0; j < count; j++)
            boxes[j] = ranRect();
        return boxes;
    }
}