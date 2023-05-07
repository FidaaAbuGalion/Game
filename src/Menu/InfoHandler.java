package Menu;

import core.GameState;
import core.Window;
import inputs.AudioHandler;

import java.awt.*;
import java.awt.event.KeyEvent;

public class InfoHandler {
    private Window w;
    private byte selector = 0;
    private int selectorWidth =16;
    private int selectorLeft = 16;

    public InfoHandler(Window w) {
        this.w = w;
    }

    public void render(Graphics g){

        g.setColor(Color.orange.darker());
        g.fillRect(0, 0, w.WIDTH, w.HEIGHT);

        // draw the text
        g.setColor(Color.black);

        String title = "ThE MaZe";
        String welcome =  "Welcome To The MaZe Game :) ";
        String madeBy = "This game made by - Fidaa - Noor";
        String forWhat = "Its a task in - Programming Workshop Course - ";
        String hTPlay = "How to Play :";
        String move = "You can use the < left and right Arrows > to Move and <Space> to Jump.";
        String jump = "To Move to the next level you have to collect the key to move the obstacle.";
        String backWhilePlaying = "While playing you can return to the the Menu by pressing <ESC> ";
        String bakeTm = "Press -Enter- to back to the menu";
        String back = "Back";

        g.setFont(new Font("Times New Roman",Font.BOLD,48));
        FontMetrics fontMetrics = g.getFontMetrics(g.getFont());
        g.drawString(title,Window.WIDTH/2-(fontMetrics.stringWidth(title)/2) ,55);

        g.setFont(new Font("Times New Roman",Font.BOLD,18));
        fontMetrics = g.getFontMetrics(g.getFont());
        g.drawString(welcome ,25 ,140);
        g.drawString(madeBy ,25 ,200);
        g.drawString(forWhat ,25 ,225);
        g.drawString(hTPlay ,25 ,260);
        g.drawString(move ,25 ,285);
        g.drawString(jump ,25 ,305);
        g.drawString(backWhilePlaying ,25 ,325);
        g.drawString(bakeTm ,25 ,375);
        g.drawString(back,Window.WIDTH/2-(fontMetrics.stringWidth(back)/2) , 455);


        g.setColor(Color.RED.darker());
        int selectorX = w.WIDTH/2 - (fontMetrics.stringWidth(back)/2) - selectorWidth - selectorLeft;
        int selectorY = 455 - selectorWidth/2 + selector * 100;
        g.fillRect(selectorX, selectorY, selectorWidth, selectorWidth);
    }

    public void tick(){

    }


    public void KeyPress(int key) {
       if (key == KeyEvent.VK_ENTER) {
                w.gs = GameState.Menu;
            }
        }

}
