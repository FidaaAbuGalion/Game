package core;

import inputs.KeyboardHandler;
import level.LevelHandler;
import objects.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;

public class Window extends Canvas implements Runnable{

    private Thread thread;
    private boolean running = false;
    public  Player player =  new Player(this, 100,100,20,20);
    private KeyboardHandler kListener = new KeyboardHandler(this);
    public LevelHandler level = new LevelHandler(player.levelNum);

    public Window(){
        JFrame frame = new JFrame();
        frame.setTitle("ThE-MaZe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false); // b3den lazm a76h false
        frame.setVisible(true);
        frame.add(this);
        frame.setSize(800,600);
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
        player.tick();
        level.tick();
    }
    //paint the window
    public void render(){
        BufferStrategy bufferStrategy = this.getBufferStrategy();
        if(bufferStrategy == null){
            this.createBufferStrategy(2);
            bufferStrategy = this.getBufferStrategy();
       /* while (player.levelNum <= 5){
            if (player.touchDoor){
                player.levelNum++;
                level.levels(player.levelNum);
            }*/
        }
        Graphics g = bufferStrategy.getDrawGraphics();
        if (player.levelNum == 1) {
            g.setColor(Color.darkGray);
          //  new Player(this, 200,100,20,20);
        } else if (player.levelNum == 2) {
            g.setColor(Color.green);
        }
        g.fillRect(0,0,this.getWidth(),this.getHeight());

        player.render(g);
        level.render(g);

        bufferStrategy.show();
        g.dispose();
    }
}
