package Game;

public class Game {
    private Display display;

    public int width, height;

    public Game(String title, int width, int height){
        this.width = width;
        this.height = height;

        this.display = new Display(title, width, height);
    }
}