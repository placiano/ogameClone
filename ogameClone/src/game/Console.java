package game;

public class Console implements Runnable{
    Player player;

    public Console(Player player){
        this.player = player;
    }

    public void run(){
        System.out.println("Welcome to ogame clone!");
    }
}
