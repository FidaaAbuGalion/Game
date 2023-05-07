package level;

import objects.*;


import java.awt.*;
import java.util.LinkedList;


public class LevelHandler {

    public static final double GRAVITY = 4;


    public static LinkedList<Items> items = new LinkedList<Items>();
    private static final Color brown = Color.getHSBColor(20f/360, 0.7f, 0.4f);

    public static Platforms impediment1 = new Platforms(IDS.platForm,340,480,10,50, Color.orange);
    public static Platforms impediment2 = new Platforms(IDS.platForm , 520 , 480 , 10 , 45 , brown);
    public static Platforms impediment3 = new Platforms(IDS.platForm , 520 , 480 , 10 , 45 , Color.orange);
    public static Platforms impediment4 = new Platforms(IDS.platForm , 600 , 500 , 70 , 10 , Color.orange);
    public static Platforms impediment5 = new Platforms(IDS.platForm , 500 , 510 , 60 , 10 , Color.orange);


    public LevelHandler(int levelNum){

        levels(levelNum);

    }

    public static void levels(int levelNum){
        if (levelNum == 1){
            initLevel1();
        } else if (levelNum == 2) {
            initLevel2();
        }else if (levelNum == 3) {
            initLevel3();
        }else if (levelNum == 4) {
            initLevel4();
        }else if (levelNum == 5) {
            initLevel5();
        }else {
            items.clear();

        }

    }


    private static void initLevel1() {
        items.clear();
        items.add(impediment1);
        items.add(new Door(IDS.door,160,565,150,50, Color.cyan));
        items.add(new Platforms(IDS.platForm,0,0,800,25, Color.darkGray)); // up
        items.add(new Platforms(IDS.platForm,0,0,25,600, Color.darkGray)); // left
        items.add(new Platforms(IDS.platForm,759,0,25,600, Color.darkGray)); //right
        items.add(new Platforms(IDS.platForm,0,530,170,35, Color.darkGray)); //down
        items.add(new Platforms(IDS.platForm,300,530,470,35, Color.darkGray)); //down

        items.add(new Platforms(IDS.platForm,200,100,140,30, Color.darkGray));
        items.add(new Platforms(IDS.platForm,430,110,120,30, Color.darkGray));
        items.add(new Platforms(IDS.platForm,640,180,160,30, Color.darkGray));
        items.add(new Platforms(IDS.platForm,130,160,110,30, Color.darkGray));
        items.add(new Platforms(IDS.platForm,200,260,560,50, Color.darkGray));
        items.add(new Platforms(IDS.platForm,0,360,200,45, Color.darkGray));
        items.add(new Platforms(IDS.platForm,0,470,70,20, Color.darkGray));
        items.add(new Platforms(IDS.platForm,500,400,70,20, Color.darkGray));
        items.add(new Platforms(IDS.platForm,690,450,30,20, Color.darkGray));
        items.add(new Platforms(IDS.platForm,100,440,280,20, Color.darkGray));
        items.add(new Platforms(IDS.platForm,360,480,300,20, Color.darkGray));
        items.add(new Platforms(IDS.platForm,200,100,40,170, Color.darkGray));
        items.add(new Platforms(IDS.platForm,500,300,40,140, Color.darkGray));
        items.add(new Platforms(IDS.platForm,250,390,20,120, Color.darkGray));
        items.add(new Platforms(IDS.platForm,150,460,20,60, Color.darkGray));
        items.add(new Platforms(IDS.platForm,360,460,20,30, Color.darkGray));
        items.add(new Platforms(IDS.platForm,640,370,20,120, Color.darkGray));
        items.add(new Platforms(IDS.platForm,710,300,20,200, Color.darkGray));
        items.add(new Platforms(IDS.platForm,360,300,20,100, Color.darkGray));
        items.add(new Key(IDS.key,100,480));

    }
    private static void initLevel2() {

        Color orange = Color.orange.darker();

    items.clear();
    items.add(new Door(IDS.door,400,565,150,50, Color.cyan));
    items.add(new Platforms(IDS.platForm, 0, 0, 800, 25, orange)); // top platform
    items.add(new Platforms(IDS.platForm, 0, 0, 25, 600, orange)); // left platform
    items.add(new Platforms(IDS.platForm, 759, 0, 25, 600, orange)); // right platform
    items.add(new Platforms(IDS.platForm, 0, 540, 420, 25, orange)); // bottom platform
    items.add(new Platforms(IDS.platForm, 500, 540, 420, 25, orange)); // bottom platform


    items.add(new Platforms(IDS.platForm , 25 , 320 , 130 , 20 , orange)) ;
    items.add(new Platforms(IDS.platForm , 77 , 75 , 20 , 160 , orange));
    items.add(new Platforms(IDS.platForm , 77 , 75 , 630 , 20 ,orange));
    items.add(new Platforms(IDS.platForm , 400 , 75 , 20 , 90 , orange));
    items.add(new Platforms(IDS.platForm ,150 , 165 , 270 , 20 , orange ));
    items.add(new Platforms(IDS.platForm , 150 , 165 , 20 , 250 , orange));
    items.add(new Platforms(IDS.platForm , 150 , 225 , 340 , 20 , orange));
    items.add(new Platforms(IDS.platForm , 490 , 165 , 217 , 20 ,orange));
    items.add(new Platforms(IDS.platForm , 480 , 225 , 20 , 120 ,orange));
    items.add(new Platforms(IDS.platForm , 250 , 345 , 250 , 20 , orange));
    items.add(new Platforms(IDS.platForm , 250 , 300 , 20 , 50 , orange));
    items.add(new Platforms(IDS.platForm , 690 , 165 , 20 , 330 , orange));
    items.add(new Platforms(IDS.platForm , 400 , 475 , 290 , 20 , orange));
    items.add(new Platforms(IDS.platForm , 400 , 475 , 20 , 65 , orange));

    items.add(new Platforms(IDS.platForm , 320 , 345 , 20 , 120 ,orange));
    items.add(new Platforms(IDS.platForm , 77, 465 , 263 , 20 ,orange));
    items.add(new Platforms(IDS.platForm , 340 , 405 , 260 , 20 ,orange));
    items.add(new Platforms(IDS.platForm , 600 , 225 , 20 , 200 , orange));
    items.add(new Platforms(IDS.platForm , 77 , 375 , 20 , 130 , orange));
    items.add(impediment2);
    items.add(new Key(IDS.key,408,283));
}
        private static void initLevel3() {
            items.clear();
            items.add(new Door(IDS.door,370,565,150,50, Color.cyan));
            items.add(new Platforms(IDS.platForm, 0, 0, 800, 25, Color.black)); // top platform
            items.add(new Platforms(IDS.platForm, 0, 0, 25, 600, Color.black)); // left platform
            items.add(new Platforms(IDS.platForm, 759, 0, 25, 600, Color.black)); // right platform
            items.add(new Platforms(IDS.platForm, 0, 540, 380, 25, Color.black)); // bottom platform
            items.add(new Platforms(IDS.platForm, 450, 540, 390, 25, Color.black)); // bottom platform

            //square 1
            items.add(new Platforms(IDS.platForm, 100, 80, 550, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 100, 80, 25, 400, Color.black));
            items.add(new Platforms(IDS.platForm, 650, 80, 25, 95, Color.black));
            items.add(new Platforms(IDS.platForm, 650, 250, 25, 230, Color.black));

            items.add(new Platforms(IDS.platForm, 100, 455, 80, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 240, 455, 430, 25, Color.black));
            //
            items.add(new Platforms(IDS.platForm, 650, 150, 150, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 60, 150, 50, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 60, 350, 50, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 0, 250, 50, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 0, 450, 50, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 100, 200, 50, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 160, 350, 50, 25, Color.black));
            //
            items.add(new Platforms(IDS.platForm, 720, 400, 45, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 670, 300, 45, 25, Color.black));


            items.add(new Platforms(IDS.platForm, 610, 430, 50, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 550, 300, 50, 25, Color.black));
            //
            items.add(new Platforms(IDS.platForm, 520, 80, 25, 60, Color.black));

            //square 2
            items.add(new Platforms(IDS.platForm, 190, 140, 150, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 400, 140, 170, 25, Color.black));

            items.add(new Platforms(IDS.platForm, 190, 140, 25, 250, Color.black));
            items.add(new Platforms(IDS.platForm, 550, 140, 25, 250, Color.black));
            items.add(new Platforms(IDS.platForm, 190, 390, 200, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 470, 390, 105, 25, Color.black));
            //
            items.add(new Platforms(IDS.platForm, 190, 300, 100, 25, Color.black));


            //square 3
            items.add(new Platforms(IDS.platForm, 280, 200, 200, 25, Color.black));
            items.add(new Platforms(IDS.platForm, 280, 300, 25, 50, Color.black));
            items.add(new Platforms(IDS.platForm, 280, 200, 25, 50, Color.black));

            items.add(new Platforms(IDS.platForm, 470, 200, 25, 130, Color.black));
            items.add(new Platforms(IDS.platForm, 280, 330, 215, 25, Color.black));
            //
            items.add(new Platforms(IDS.platForm, 300, 400, 25, 150, Color.black));

            items.add(impediment3);
            items.add(new Key(IDS.key,375,265));


        }
        private static void initLevel4() {

            items.clear();
            Color cyan = Color.cyan.darker();

            items.add(new Door(IDS.door,580,565,150,50, Color.cyan));
            items.add(new Platforms(IDS.platForm,0,0,800,25, cyan)); // up
            items.add(new Platforms(IDS.platForm,0,0,25,600, cyan)); // left
            items.add(new Platforms(IDS.platForm,759,0,25,600, cyan)); //right
            items.add(new Platforms(IDS.platForm,0,540,630,25, cyan)); //
            items.add(new Platforms(IDS.platForm,670,540,100,25, cyan)); //
            //b al 6ol
            items.add(new Platforms(IDS.platForm,400,0,50,150, cyan));
            items.add(new Platforms(IDS.platForm,420,120,30,360, cyan));
            items.add(new Platforms(IDS.platForm,100,120,300,30, cyan));
            items.add(new Platforms(IDS.platForm,100,120,30,365, cyan));
            items.add(new Platforms(IDS.platForm,260,200,30,365, cyan));
            items.add(new Platforms(IDS.platForm,580,100,30,550, cyan));
            //b al 3rd almsar-1
            items.add(new Platforms(IDS.platForm, 110, 300, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 110, 430, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 200, 490, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 200, 370, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 200, 220, 80, 25, cyan));
            //b al 3rd almsar-2
            items.add(new Platforms(IDS.platForm, 290, 230, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 290, 350, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 290, 480, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 350, 290, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 350, 420, 80, 25, cyan));
            //b al 3rd almsar-3
            items.add(new Platforms(IDS.platForm, 420, 260, 100, 25, cyan));
            items.add(new Platforms(IDS.platForm, 420, 100, 100, 25, cyan));
            items.add(new Platforms(IDS.platForm, 420, 420, 100, 25, cyan));
            items.add(new Platforms(IDS.platForm, 500, 490, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 500, 340, 80, 25, cyan));
            items.add(new Platforms(IDS.platForm, 500, 180, 80, 25, cyan));
            //b al 3rd almsar-4
            items.add(new Platforms(IDS.platForm, 580, 260, 140, 25, cyan));
            items.add(new Platforms(IDS.platForm, 580, 420, 140, 25, cyan));
            items.add(new Platforms(IDS.platForm, 580, 100, 140, 25, cyan));
            items.add(new Platforms(IDS.platForm, 680, 490, 100, 25, cyan));
            items.add(new Platforms(IDS.platForm, 680, 340, 100, 25, cyan));
            items.add(new Platforms(IDS.platForm, 680, 180, 100, 25, cyan));

            items.add(impediment4);
            items.add(new Key(IDS.key,475,50));
        }


        private static void initLevel5() {
            items.clear();

            items.add(new Door(IDS.door,580,565,150,50, Color.cyan));
            items.add(new Platforms(IDS.platForm, 0, 0, 800, 25, Color.black)); // top platform
            items.add(new Platforms(IDS.platForm, 0, 0, 25, 600, Color.black)); // left platform
            items.add(new Platforms(IDS.platForm, 759, 0, 25, 600, Color.black)); // right platform
            items.add(new Platforms(IDS.platForm, 0, 540, 600, 25, Color.black)); // bottom platform
            items.add(new Platforms(IDS.platForm, 660, 540, 200, 25, Color.black)); // bottom platform


            items.add(new Platforms(IDS.platForm, 25, 300, 60, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 25, 400, 60, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 85, 350, 60, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 145, 200, 10, 160, Color.black));
            items.add(new Platforms(IDS.platForm, 145, 300, 120, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 205, 300, 10, 110, Color.black));
            items.add(new Platforms(IDS.platForm, 85, 250, 60, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 85, 200, 10, 50, Color.black));
            items.add(new Platforms(IDS.platForm, 145, 400, 120, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 145, 400, 10, 90, Color.black));
            items.add(new Platforms(IDS.platForm, 85, 490, 70, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 85, 450, 10, 40, Color.black));
            items.add(new Platforms(IDS.platForm, 225, 460, 10, 115, Color.black));
            items.add(new Platforms(IDS.platForm, 275, 500, 70, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 345, 460, 10, 50, Color.black));
            items.add(new Platforms(IDS.platForm, 273, 460, 132, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 263, 400, 10, 70, Color.black));
            items.add(new Platforms(IDS.platForm, 405, 250, 10, 220, Color.black));
            items.add(new Platforms(IDS.platForm, 405, 250, 60, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 255, 255, 10, 45, Color.black));
            items.add(new Platforms(IDS.platForm, 205, 255, 105, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 310, 200, 10, 65, Color.black));
            items.add(new Platforms(IDS.platForm, 205, 75, 10, 180, Color.black));
            items.add(new Platforms(IDS.platForm, 205, 75, 50, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 85, 125, 120, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 85, 75, 10, 50, Color.black));
            items.add(new Platforms(IDS.platForm, 145, 25, 10, 50, Color.black));
            items.add(new Platforms(IDS.platForm, 310, 300, 390, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 310, 300, 10, 120, Color.black));
            items.add(new Platforms(IDS.platForm, 250, 360, 60, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 570, 300, 10, 120, Color.black));
            items.add(new Platforms(IDS.platForm, 690, 250, 10, 50, Color.black));
            items.add(new Platforms(IDS.platForm, 690, 250, 70, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 690, 360, 70, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 690, 360, 10, 60, Color.black));
            items.add(new Platforms(IDS.platForm, 500, 460, 260, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 500, 360, 10, 100, Color.black));
            items.add(new Platforms(IDS.platForm, 560, 460, 10, 30, Color.black));
            items.add(new Platforms(IDS.platForm, 560, 490, 70, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 500, 500, 10, 50, Color.black));
            items.add(new Platforms(IDS.platForm, 410, 500, 90, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 580, 180, 180, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 580, 75, 10, 115, Color.black));
            items.add(new Platforms(IDS.platForm, 580, 180, 10, 60, Color.black));
            items.add(new Platforms(IDS.platForm, 580, 75, 80, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 660, 75, 10, 50, Color.black));
            items.add(new Platforms(IDS.platForm, 465, 25, 10, 110, Color.black));
            items.add(new Platforms(IDS.platForm, 405, 75, 60, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 345, 25, 10, 100, Color.black));
            items.add(new Platforms(IDS.platForm, 260, 125, 160, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 410, 125, 10, 60, Color.black));
            items.add(new Platforms(IDS.platForm, 410, 185, 60, 10, Color.black));
            items.add(new Platforms(IDS.platForm, 260, 125, 10, 60, Color.black));
            items.add(new Platforms(IDS.platForm, 520, 25, 10, 230, Color.black));

            items.add(impediment5);
            items.add(new Key(IDS.key,615,342));

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
