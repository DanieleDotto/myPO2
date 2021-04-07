package Game;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game implements Runnable{
    private Display display;

    public int width, height;
    public String title;

    private boolean running = false;
    private Thread thread;

    private BufferStrategy bs;
    private Graphics g;

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;
        this.title = title;
    }

    private void init(){
        this.display = new Display(title, width, height);
    }

    private void tick(){

    }

    private void render(){
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null){
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        g = bs.getDrawGraphics();

        // Clear screen
        g.clearRect(0, 0, width, height);

        // draw here

        g.setColor(Color.red);
        g.fillRect(10, 50, 50, 70);

        g.setColor(Color.green);
        g.fillRect(0, 0, 10, 10);



        // end drawing
        bs.show();
        g.dispose();
    }

    @Override
    public void run() {
        init();

        while(running){
            tick();
            render();
        }

        stop();
    }

    public synchronized void start(){
        if(running) { return; } // don't do anything
        running = true;
        thread = new Thread(this);  // go to run of this
        thread.start();
    }

    public synchronized void stop(){
        if(!running) { return; }    // don't do anything
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
