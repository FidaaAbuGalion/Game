package objects;

import level.Level;

import java.awt.*;

public class Platforms extends Items {

    /*int x, y, width, height;
    public Color color;
    public Platforms(byte id, int x, int y, int width, int height) {
        super(id);
    }*/
    int x, y, width, height;
    public Color color;
    public Platforms(byte id, int x, int y, int width, int height, Color color) {
        super(id);
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillRect(x, y, width, height);
    }

    @Override
    public void tick() {

    }


}
