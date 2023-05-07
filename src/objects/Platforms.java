package objects;


import java.awt.*;

public class Platforms extends Items {

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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
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
