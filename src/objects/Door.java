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


    /*public Rectangle getBounds(){
        return new Rectangle(x, y, width, height);
    }*/

    @Override
    public void render(Graphics graphics) {
        graphics.setColor(color);
        graphics.fillOval(x, y, width, height);
    }

    @Override
    public void tick() {

    }
}
