import game.GameRunner;
import game.MarioGame;
import game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContra = new SuperContraGame();

        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
