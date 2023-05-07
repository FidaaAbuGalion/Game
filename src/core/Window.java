package core;

import inputs.AudioHandler;
import inputs.KeyboardHandler;
import level.LevelHandler;
import Menu.MenuHandler;
import Menu.OptionsHandler;
import Menu.InfoHandler;
import objects.Player;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;


public class Window extends Canvas implements Runnable{

    private Thread thread;
    private boolean running = false;
    public  Player player =  new Player(this, 20,20);
    private KeyboardHandler kListener = new KeyboardHandler(this);
    public GameState gs = GameState.Menu;
    public LevelHandler level = new LevelHandler(player.levelNum);
    public MenuHandler menu = new MenuHandler(this);
    public OptionsHandler options = new OptionsHandler(this);
    public InfoHandler info = new InfoHandler(this);
    // Final //
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;




    public Window(){
        JFrame frame = new JFrame();
        frame.setTitle("ThE-MaZe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); // b3den lazm a76h false
        frame.setVisible(true);
        frame.add(this);
        frame.setSize(WIDTH,HEIGHT);

    }
    public void start(){
        running = true;
        thread = new Thread(this);
        thread.start();

    }
    public void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        @Override
    public void run() {
        while (running){
            tick();
            render();
        }
    }
    //update window
    public void tick(){

        if (gs == GameState.Game){
        level.tick();
        player.tick();
        } else if (gs == GameState.Menu){
            menu.tick();
        }else if (gs == GameState.Options){
            options.tick();
        }
    }

    //paint the window
    public void render() {


        if (player.touchDoor) {
            player.touchDoor = false;
            player.touchKey = false;
            level.levels(player.levelNum);
        }

        BufferStrategy bufferStrategy = this.getBufferStrategy();
        if (bufferStrategy == null) {
            this.createBufferStrategy(2);
            System.out.println("------------------");
            bufferStrategy = this.getBufferStrategy();

        }


        Graphics g = bufferStrategy.getDrawGraphics();
        if (gs == GameState.Game) {
            if (player.levelNum < 6) {
                if (player.levelNum == 1) {
                    if (player.touchKey) {
                        LevelHandler.impediment1.setY(450);
                    }
                    ImageIcon icon = new ImageIcon("src/Files/backGroundLevel1.png");
                    g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);


                } else if (player.levelNum == 2) {
                    LevelHandler.impediment1.setY(480);
                    if (player.touchKey) {
                        LevelHandler.impediment2.setY(460);
                    }
                    ImageIcon icon = new ImageIcon("src/Files/backGroundLevel2.png");
                    g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
                    //g.setColor(Color.darkGray);
                } else if (player.levelNum == 3) {
                    LevelHandler.impediment2.setY(480);

                    if (player.touchKey) {
                        LevelHandler.impediment3.setY(460);
                    }
                    ImageIcon icon = new ImageIcon("src/Files/backGroundLevel3.png");
                    g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);

                } else if (player.levelNum == 4) {
                    LevelHandler.impediment3.setY(480);
                    if (player.touchKey) {
                        LevelHandler.impediment4.setX(545);
                    }
                    ImageIcon icon = new ImageIcon("src/Files/backGroundLevel4.png");
                    g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
                } else if (player.levelNum == 5) {
                    LevelHandler.impediment4.setX(600);
                    if (player.touchKey) {
                        LevelHandler.impediment5.setX(450);
                    }
                    ImageIcon icon = new ImageIcon("src/Files/backGroundLevel5.png");
                    g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
                }
                g.setColor(Color.BLACK);
                g.drawString("Level: " + player.levelNum, 30, 40);
                g.setColor(Color.BLACK);
                g.drawString("Keys: " + player.keysNum, 30, 60);
            }else if (player.levelNum > 5) {
                LevelHandler.impediment5.setX(500);
                endTheGame(g);
                player.x = 900;
            }
        }


        if (gs == GameState.Game) {
            level.render(g);
            player.render(g);
        } else if (gs == GameState.Menu){
            menu.render(g);
        } else if (gs == GameState.Options) {
          g.clearRect(0, 0, this.getWidth(), this.getHeight());
            options.render(g);
        } else if (gs == GameState.Info) {
            info.render(g);
        }

            bufferStrategy.show();
            g.dispose();
    }

    public void startTheGame() {
        LevelHandler.impediment1.setY(480);
        player.x = 600;
        player.y = 0;
        player.levelNum =1;
        player.keysNum = 0;


        new LevelHandler(player.levelNum);
        gs = GameState.Game;
        AudioHandler.RunMusic("src/Files/Music.wav");
    }
    public void endTheGame(Graphics g){

        String title = "ThE MaZe";
        String end = "------THE END ------";
        String thanks = "Thank you for playing -ThE MaZe- game <3";
        String back = "You can back to menu by pressing <ESC> key.";
        String backTM = "Back!";

        ImageIcon icon = new ImageIcon("src/Files/TheEnd.png");
        g.drawImage(icon.getImage(), 0, 0, this.getWidth(), this.getHeight(),this);

        g.setColor(Color.black);
        g.setFont(new Font("Times New Roman",Font.BOLD,48));
        FontMetrics fontMetrics = g.getFontMetrics(g.getFont());
        g.drawString(title,Window.WIDTH/2-(fontMetrics.stringWidth(title)/2) ,55);

        g.setFont(new Font("Times New Roman",Font.BOLD,24));
        g.drawString(end,300 ,100);
        g.drawString(thanks,170,200);
        g.drawString(back,170,250);
        g.drawString(backTM,380,410);

        g.setColor(Color.RED.darker());
        g.fillRect(360,400,16,16);

    }
}
