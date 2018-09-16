package Mines;
import game.*;

public class DeutMine implements game.Building{
    int level;
    Planet location;

    public DeutMine(Planet location){
        level = 0;
        this.location = location;
    }

    @Override
    public void resourceTick() {
        location.addResources(0,0,2*level);
    }

    public void levelUp(){
        level++;
    }

    public Resource levelUpCost(){
        return new Resource(10*level*level,100 + (level*level),0);
    }
}
