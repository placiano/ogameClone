package Mines;
import game.*;

public class MetalMine implements Building {

    int level;
    Planet location;

    public MetalMine(Planet location){
        level = 0;
        this.location = location;
    }

    @Override
    public void resourceTick() {
       location.addResources(10*level,0,0);
    }

    public void levelUp(){
        level++;
    }

    public Resource levelUpCost(){
        return new Resource(50 + (level*level),0,0);
    }
}
