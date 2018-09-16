package Mines;
import game.*;

public class CrystalMine implements game.Building{
    int level;
    Planet location;

    public CrystalMine(Planet location){
        level = 0;
        this.location = location;
    }

    @Override
    public void resourceTick() {
        location.addResources(0,5*level,0);
    }

    public void levelUp(){
        level++;
    }

    public Resource levelUpCost(){
        return new Resource(10 * level,30 + (level*level),0);
    }
}
