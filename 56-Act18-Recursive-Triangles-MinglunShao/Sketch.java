import processing.core.PApplet;

public class Sketch extends PApplet {

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        background(152, 190, 100);
    }

    public void draw() {
        translate(width / 2, height / 2); // sets the 0,0 point to be the centre of the screen
        background(255);
        drawTriangle(0, -150, 400, 500, 5);
    }

    public void drawTriangle(double x, double y, double height, double base, int level) {
        noFill();

        double x2 = x - base / 2;
        double x3 = x + base / 2;
        double y23 = y + height;

        height /= 3;
        base /= 3;

        triangle((float) x, (float) y, (float) x2, (float) y23, (float) x3, (float) y23);

        if (level > 1) {
            level -= 1;
            drawTriangle(x, y, height, base, level);
            drawTriangle(x - base / 2, y + height, height, base, level);
            drawTriangle(x + base / 2, y + height, height, base, level);
            drawTriangle(x, y + height * 2, height, base, level);
            drawTriangle(x - base, y + height * 2, height, base, level);
            drawTriangle(x + base, y + height * 2, height, base, level);
        }
    }
}