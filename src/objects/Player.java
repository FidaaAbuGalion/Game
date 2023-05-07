package objects;

import core.GameState;
import level.LevelHandler;

import java.awt.*;
import java.util.LinkedList;
import java.util.Objects;

import static level.LevelHandler.levels;

public class Player {

    public core.Window window;
    public double x = 400;
    public double y = 0;
    public int width, height;
    public double velX, velY;
    public double speed = 0.2;
    public double jumpVelocity = 0.45;
    public boolean falling = false;
    public boolean touchDoor = false;
    public static boolean touchKey = false;
    public int levelNum  = 1;
    public static int keysNum = 0;



    public Player(core.Window window, int width, int height) {
        this.window = window;
        this.width = width;
        this.height = height;
    }


    public void tick() {
        x += velX;
        y += velY;
        if (velY < window.level.Gravity && falling) {
            velY += 0.001;
        } else if (!falling && velY > 0) {
            velY = 0;
        }


        collisions();

    }

    public void collisions() {
        falling = true;

        for (Items i : window.level.items) {
            if (i.id == IDS.platForm) {
                Platforms p = (Platforms) i;
                Rectangle playerRect = new Rectangle((int) x, (int) y, width, height);
                Rectangle platformRect = new Rectangle(p.x, p.y, p.width, p.height);


                if (playerRect.intersects(platformRect)) {
                    double overlapX = Math.min(x + width, p.x + p.width) - Math.max(x, p.x);
                    double overlapY = Math.min(y + height, p.y + p.height) - Math.max(y, p.y);

                    if (overlapX < overlapY) {
                        // adjust player X position and velocity
                        if (x < p.x) {
                            x = p.x - width;
                            velX = 0;
                        } else {
                            x = p.x + p.width;
                            velX = 0;
                        }
                    } else {
                        // adjust player Y position and velocity
                        if (y < p.y) {
                            y = p.y - height;
                            velY = 0;
                            falling = false;
                        } else {
                            y = p.y + p.height;
                            velY = 0;
                        }
                    }
                }
            } else if (i.id == IDS.door) {
                Door d = (Door) i;
                Rectangle playerRect = new Rectangle((int) x, (int) y, width, height);
                Rectangle door = new Rectangle(d.x, d.y, d.width, d.height);
                if (playerRect.intersects(door)) {
                    this.x = 350;
                    this.y = 0;
                    touchDoor = true;
                    levelNum++;
                }
            } else if (i.id == IDS.key) {
                Key k = (Key) i;
                Rectangle playerRect = new Rectangle((int) x, (int) y, width, height);
                Rectangle keyRect = new Rectangle(k.x, k.y, 30, 30);
                if (playerRect.intersects(keyRect)) {
                    touchKey = true;
                    keysNum++;
                    k.x = 900;
                    k.y = 0;
                }
            }
        }
    }


    public void render(Graphics g){

        g.setColor(Color.RED);
        g.fillRect((int)x,(int)y,width,height);
        g.setColor(Color.white);
        g.fillOval((int)x+3, (int)y+3, width-7,height-7 );
        g.setColor(Color.black);
        g.fillOval((int)x+5, (int)y+5, width-10,height-10 );


    }



    }
