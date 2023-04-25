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

    /*levels[0] = new Level();
    levels[1] = new Level();
    levels[2] = new Level();
    levels[3] = new Level();
    levels[4] = new Level();

    // level 1
    levels[0].items.add(new Platforms(IDS.platForm,0,0,800,25, Color.pink)); // up
    levels[0].items.add(new Platforms(IDS.platForm,0,0,25,600, Color.black)); // left
    levels[0].items.add(new Platforms(IDS.platForm,759,0,25,600, Color.orange)); //right
    levels[0].items.add(new Platforms(IDS.platForm,0,540,800,25, Color.GREEN)); //
    levels[0].items.add(new Platforms(IDS.platForm,345,450,140,40, Color.black)); //

    // levels
    private int currentLevel = 1;
    private Level[] levels = new Level[5];

    public void render(Graphics graphics){
        levels[currentLevel - 1].r();
    }
    public void tick(){
        levels[currentLevel - 1].tick();
    }*/
}
