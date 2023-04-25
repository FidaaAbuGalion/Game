package inputs;

import core.Window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardHandler implements KeyListener {

    private Window window;
    private boolean movingLeft = false;


    public KeyboardHandler(Window window) {
        this.window = window;
        window.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            window.player.velX = window.player.speed;
            movingLeft = false;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            window.player.velX = -window.player.speed;
            movingLeft = true;
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
               window.player.velY = -window.player.jumpVelocity;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT && !movingLeft){
            window.player.velX = 0;
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT && movingLeft){
            window.player.velX = 0;
        }
    }
}
