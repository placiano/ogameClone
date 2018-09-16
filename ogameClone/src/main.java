import java.util.Timer;
import java.util.TimerTask;
import game.*;

public class main {
    public static void main(String[] args) {
        Client c = new Client();
        c.run();
    }

    /**
     * Run tick once per second
     */
    public void tick(Player player){
        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                for(Planet x : player.planets){
                    x.tick();
                }
            }
        };
        Timer timer = new Timer("Timer");

        long delay  = 1000L;
        long period = 1000L;
        timer.scheduleAtFixedRate(repeatedTask, delay, period);
    }
}
