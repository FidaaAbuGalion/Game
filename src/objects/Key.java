package objects;

import javax.swing.*;
import java.awt.*;

public class Key extends Items {

    int x, y, width, height;

    public Key(byte id, int x, int y) {
        super(id);
        this.x = x;
        this.y = y;

    }

    @Override
    public void render(Graphics graphics) {
        ImageIcon icon = new ImageIcon("src/Files/key 2d (2).png");
        graphics.drawImage(icon.getImage(),this.x,this.y,30,30,null);
    }

    @Override
    public void tick() {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

