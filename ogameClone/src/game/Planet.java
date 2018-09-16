package game;

import Mines.*;

public class Planet {

    Player owner;
    int metal;
    int crystal;
    int deuterium;
    int powerCurrent, powerMax;

    MetalMine metalMine;
    CrystalMine crystalMine;
    DeutMine deutMine;
    PowerPlant powerPlant;

    public Planet(Player owner){
        this.owner = owner;
        metalMine = new MetalMine(this);
        crystalMine = new CrystalMine(this);
        deutMine = new DeutMine(this);
    }

    public void tick(){
        metalMine.resourceTick();
        crystalMine.resourceTick();
        deutMine.resourceTick();
        System.out.println("Metal: " + metal +
                            "| Crystal: " + crystal +
                            "| Deut: " + deuterium);
    }

    public void addResources(int metal, int crystal, int deut){
        this.metal += metal;
        this.crystal += crystal;
        this.deuterium += deut;
    }

    public boolean upgradeMetalMine(){
        boolean ret = false;
        int cost = metalMine.levelUpCost().metal;
        if(cost <= metal){
            metal -= cost;
            metalMine.levelUp();
            ret = true;
        }
        return ret;
    }

    public boolean upgradeCrystalMine(){
        boolean ret = false;
        int Metalcost = crystalMine.levelUpCost().metal;
        int CrystalCost = crystalMine.levelUpCost().crystal;
        if(Metalcost <= metal && CrystalCost <= crystal){
            metal -= Metalcost;
            crystal -= CrystalCost;
            crystalMine.levelUp();
            ret = true;
        }
        return ret;
    }

    public boolean upgradeDeutMine(){
        boolean ret = false;
        int Metalcost = deutMine.levelUpCost().metal;
        int CrystalCost = deutMine.levelUpCost().crystal;
        if(Metalcost <= metal && CrystalCost <= crystal){
            metal -= Metalcost;
            crystal -= CrystalCost;
            deutMine.levelUp();
            ret = true;
        }
        return ret;
    }

    public int getMetal() {
        return metal;
    }

    public int getCrystal(){
        return crystal;
    }

    public int getDeuterium(){
        return deuterium;
    }
}
