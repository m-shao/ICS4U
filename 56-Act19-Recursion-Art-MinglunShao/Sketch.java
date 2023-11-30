import processing.core.PApplet;

public class Sketch extends PApplet {
    double ang = 0;
    double s = 100;
    double initAngle = 0;
    double hue;
    boolean direction;

    public void settings() {
        size(600, 600);

    }

    public void setup() {
        background(152, 190, 100);
    }

    public void draw() {
        colorMode(HSB);
        background(152, 190, 100);
        ang += 0.0015;
        s += 0.0005;
        initAngle += Math.PI / 3000;
        hue = (hue + 0.5) % 255;
        fill((float) hue, 255, 255);
        drawSquare((double) width / 2, (double) height / 2, s, initAngle);
    }

    public void drawSquare(double x, double y, double len, double angle) {
        if (len <= 0)
            return;

        rect((float) x, (float) y, (float) (x + Math.sin(angle) * len) / 10, (float) (x + Math.sin(angle) * len) / 10);
        if (keyPressed) {
            direction = !direction;
        }
        if (direction) {
            drawSquare(x + Math.sin(angle) * len, y + Math.cos(angle) * len, len - 1, angle - ang);
        } else {
            drawSquare(x - Math.sin(angle) * len, y - Math.cos(angle) * len, len - 1, angle - ang);
        }
    }
}