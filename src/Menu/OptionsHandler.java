package Menu;

import core.GameState;
import core.Window;
import inputs.AudioHandler;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class OptionsHandler {

    private Window w;
    private byte selector = 0;
    private static final int SELECTOR_WIDTH =16;
    private static final int SELECTOR_LEFT = 16;

    public OptionsHandler(Window w) {
        this.w = w;
    }

    public void render(Graphics g){

        ImageIcon icon = new ImageIcon("src/Files/options (2).png");
        g.drawImage(icon.getImage(), 0, 0, w.getWidth(), w.getHeight(),null);

        // draw the text
        g.setColor(Color.black);

        String title = "ThE MaZe";
        String sound = "Music --- " + ((AudioHandler.off) ? "Off" : "On"); // if true - off, if false - on
        String back = "Back";

        g.setFont(new Font("Times New Roman",Font.BOLD,48));
        FontMetrics fontMetrics = g.getFontMetrics(g.getFont());
        g.drawString(title,Window.WIDTH/2-(fontMetrics.stringWidth(title)/2) ,55);

        g.setFont(new Font("Times New Roman",Font.BOLD,24));
        fontMetrics = g.getFontMetrics(g.getFont());
        g.drawString(sound,Window.WIDTH/2-(fontMetrics.stringWidth(sound)/2) ,255);
        g.drawString(back,Window.WIDTH/2-(fontMetrics.stringWidth(back)/2) , 355);


        g.setColor(Color.RED.darker());
        int selectorX = w.WIDTH/2 - (fontMetrics.stringWidth(sound)/2) - SELECTOR_WIDTH - SELECTOR_LEFT;
        int selectorY = 255 - SELECTOR_WIDTH/2 + selector * 100;
        g.fillRect(selectorX, selectorY, SELECTOR_WIDTH, SELECTOR_WIDTH);
    }

    public void tick(){

    }


    public void KeyPress(int key) {
        if ((key == KeyEvent.VK_S ||key == KeyEvent.VK_DOWN) && selector < 1){
            selector++;
        }else if ((key == KeyEvent.VK_W || key == KeyEvent.VK_UP) && selector > 0){
            selector--;
        } else if (key == KeyEvent.VK_ENTER) {
            if (selector == 0){
                AudioHandler.off = !AudioHandler.off;
                if (AudioHandler.off && AudioHandler.clip != null){
                    AudioHandler.clip.stop();
                }
            }else if (selector == 1){
                w.gs = GameState.Menu;

            }
        }
    }
}

