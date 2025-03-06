package game;

public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Mario jump!");
    }
    public void down(){
        System.out.println("Mario go into a hole");
    }
    public void left(){
        System.out.println("Mario go back");
    }
    public void right(){
        System.out.println("Mario accelerate");
    }
}
