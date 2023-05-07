package inputs;

import core.GameState;
import core.Window;
import level.LevelHandler;

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

        int key = e.getKeyCode();

        if (window.gs == GameState.Game) {

            if (key == KeyEvent.VK_RIGHT) {
                window.player.velX = window.player.speed;
                movingLeft = false;
            } else if (key == KeyEvent.VK_LEFT) {
                window.player.velX = -window.player.speed;
                movingLeft = true;
            } else if (key == KeyEvent.VK_SPACE) {
                window.player.velY = -window.player.jumpVelocity;
            }else if (key == KeyEvent.VK_ESCAPE && AudioHandler.clip != null){
                LevelHandler.impediment1.setY(480);
                window.gs = GameState.Menu;
                AudioHandler.clip.stop();
            }

        }else if (window.gs == GameState.Menu ) {
            window.menu.KeyPress(key);

        } else if (window.gs == GameState.Options) {
            window.options.KeyPress(key);
        } else if (window.gs == GameState.Info) {
            window.info.KeyPress(key);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (window.gs == GameState.Game) {
            if (e.getKeyCode() == KeyEvent.VK_RIGHT && !movingLeft) {
                window.player.velX = 0;
            } else if (e.getKeyCode() == KeyEvent.VK_LEFT && movingLeft) {
                window.player.velX = 0;
            }
        } else if (window.gs == GameState.Menu) {

        }
    }
}
