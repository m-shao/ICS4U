import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(620, 620);
    }

    public void setup() {
        background(152, 190, 100);
    }

    public void draw() {
        background(152, 190, 100);
        drawSquares(10, 10, 600, 7);
    }

    public void drawSquares(int x, int y, int size, int level) {
        noFill();
        rect(x, y, size, size);
        if (level > 1) {
            level = level - 1;
            drawSquares(x, y, size / 2 - size / 10, level);
            drawSquares(x + size / 2 + size / 10, y, size / 2 - size / 10, level);
            drawSquares(x, y + size / 2 + size / 10, size / 2 - size / 10, level);
            drawSquares(x + size / 2 + size / 10, y + size / 2 + size / 10, size / 2 - size / 10, level);

        }
    }
}