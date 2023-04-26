package objects;


import java.awt.*;

public class Door extends Items {

    int x, y, width, height;
    public Color color;
    public Door(byte id, int x, int y, int width, int height, Color color) {
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
