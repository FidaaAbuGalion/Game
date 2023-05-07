package Menu;

import core.GameState;
import core.Window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class MenuHandler {

    private Window w;
    private byte selector = 0;
    private int selectorX = 0;
    private int selectorY = 0;
    private int selectorWidth =16;
    private int selectorLeft = 16;

    public MenuHandler(Window w) {
        this.w = w;
    }

    public void render(Graphics g){

        ImageIcon icon = new ImageIcon("src/Files/Menu.png");
        g.drawImage(icon.getImage(), 0, 0, w.getWidth(), w.getHeight(),null);

        // draw the text
        g.setColor(Color.black);

        String title = "ThE MaZe";
        String startGame = "New Game";
        String info = "Info";
        String options = "Options";
        String exit = "Exit";

        g.setFont(new Font("Times New Roman",Font.BOLD,48));
        FontMetrics fontMetrics = g.getFontMetrics(g.getFont());
        g.drawString(title,Window.WIDTH/2-(fontMetrics.stringWidth(title)/2) ,55);

        g.setFont(new Font("Times New Roman",Font.BOLD,24));
        fontMetrics = g.getFontMetrics(g.getFont());
        g.drawString(startGame,Window.WIDTH/2-(fontMetrics.stringWidth(startGame)/2) ,155);
        g.drawString(info,Window.WIDTH/2-(fontMetrics.stringWidth(info)/2) ,255);
        g.drawString(options,Window.WIDTH/2-(fontMetrics.stringWidth(options)/2) ,355);
        g.drawString(exit,Window.WIDTH/2-(fontMetrics.stringWidth(exit)/2) , 455);


        g.setColor(Color.RED.darker());
        int selectorX = w.WIDTH/2 - (fontMetrics.stringWidth(startGame)/2) - selectorWidth - selectorLeft;
        int selectorY = 155 - selectorWidth/2 + selector * 100;
        g.fillRect(selectorX, selectorY, selectorWidth, selectorWidth);
    }

    public void tick(){

    }


    public void KeyPress(int key) {
        if ((key == KeyEvent.VK_S ||key == KeyEvent.VK_DOWN) && selector < 3){
         selector++;
        }else if ((key == KeyEvent.VK_W || key == KeyEvent.VK_UP) && selector > 0){
            selector--;
        } else if (key == KeyEvent.VK_ENTER) {
            if (selector == 0){
                w.startTheGame();
            }else if (selector == 1){
                w.gs = GameState.Info;
            }else if (selector == 2){
                w.gs = GameState.Options;
            } else if (selector == 3) {
                System.exit(0);
            }
        }
    }
}
