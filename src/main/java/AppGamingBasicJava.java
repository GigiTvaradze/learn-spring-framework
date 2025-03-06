import game.GameRunner;
import game.MarioGame;
import game.PacManGame;
import game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {

        var marioGame = new MarioGame();
        var superContra = new SuperContraGame();
        var pacMan = new PacManGame(); //create new object

        var gameRunner = new GameRunner(pacMan); //create new object + wiring of dependencies

        gameRunner.run();
    }
}
