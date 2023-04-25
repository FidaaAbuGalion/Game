package level;

import objects.Items;

import java.awt.*;
import java.util.LinkedList;

public class Level {

    public LinkedList<Items> items = new LinkedList<Items>();

    public void tick(){

    }
    public void render(Graphics graphics){
        for (Items i : items){
            i.render(graphics);
        }
    }
}
