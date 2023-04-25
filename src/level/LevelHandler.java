package level;

import objects.Door;
import objects.IDS;
import objects.Items;
import objects.Platforms;


import java.awt.*;
import java.util.LinkedList;
import java.util.Random;

public class LevelHandler {

    public double Gravity = 4;
    private int seed;
    public static LinkedList<Items> items = new LinkedList<Items>();
    private Double door;


    public LevelHandler(int levelNum){

        Random r = new Random();
        seed = r.nextInt();
        levels(levelNum);

    }

    public static void levels(int levelNum){
        switch (levelNum) {
            case 1:
                initLevel1();
                break;
            case 2:
                initLevel2();
                break;
            case 3:
                initLevel3();
                break;
            case 4:
                initLevel4();
                break;
            case 5:
                initLevel5();
                break;
            default:
                throw new IllegalArgumentException("Invalid level number: " + levelNum);

        }

    }

    private static void initLevel1() {
        items.add(new Platforms(IDS.platForm,0,0,800,25, Color.pink)); // up
        items.add(new Platforms(IDS.platForm,0,0,25,600, Color.black)); // left
        items.add(new Platforms(IDS.platForm,759,0,25,600, Color.orange)); //right
        items.add(new Platforms(IDS.platForm,0,540,800,25, Color.GREEN)); //
        items.add(new Platforms(IDS.platForm,345,450,140,40, Color.black));
        items.add(new Platforms(IDS.door,500,300,40,40, Color.cyan));

    }
    private static void initLevel2() {
        items.add(new Platforms(IDS.platForm, 0, 0, 800, 25, Color.pink)); // top platform
        items.add(new Platforms(IDS.platForm, 0, 0, 25, 600, Color.black)); // left platform
        items.add(new Platforms(IDS.platForm, 759, 0, 25, 600, Color.orange)); // right platform
        items.add(new Platforms(IDS.platForm, 0, 540, 800, 25, Color.green)); // bottom platform
        items.add(new Platforms(IDS.platForm, 345, 450, 140, 40, Color.black)); // middle platform
        items.add(new Platforms(IDS.platForm, 306, 124, 416, 40, Color.black)); // middle platform
    }private static void initLevel3() {

    }private static void initLevel4() {

    }private static void initLevel5() {

    }



    public void render(Graphics graphics){
        for (Items item : items){
            item.render(graphics);

        }
    }
    public void tick(){
        for (Items item : items){
            item.tick();
        }

    }
}
