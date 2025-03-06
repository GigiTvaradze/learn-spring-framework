package game;

public class GameRunner {

    private MarioGame game;

    public GameRunner(MarioGame game) {
    this.game = game;
    }

    public void run() {
        System.out.println(game + " running...");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}