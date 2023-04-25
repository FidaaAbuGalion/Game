package objects;

import java.awt.*;

public abstract class Items extends Object {

    public static byte platForm = Byte.MIN_VALUE;
    protected byte id;
    public int x, y, width, height;

    public Items(byte id, int x, int y, int width, int height) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Items(byte id) {
        this.id  = id;
    }

    public abstract void render(Graphics graphics);
    public abstract void tick();

}
