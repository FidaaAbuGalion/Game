package objects;

import level.LevelHandler;

import java.awt.*;
import java.util.LinkedList;
import java.util.Objects;

public class Player {

    public core.Window window;
    public double x, y;
    public int width, height;
    public double velX, velY;
    public double speed = 0.5;
    public double jumpVelocity = 0.30;
    public boolean falling = false;
    public boolean touchDoor = false;
    public int levelNum = 1;



    public Player(core.Window window, double x, double y, int width, int height) {
        this.window = window;
        this.y = y;
        this.x = x;
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
            } /*else if (i.id == IDS.door ) {
                Door d = (Door) i;
                Rectangle playerRect = new Rectangle((int) x, (int) y, width, height);
                Rectangle door = new Rectangle(d.x, d.y, d.width, d.height);
                if(playerRect.intersects(door)){
                    touchDoor = true;
                }*/
        }



    }


    public void render(Graphics g){
        g.setColor(Color.RED);
        g.fillRect((int)x,(int)y,width,height);

    }


}
