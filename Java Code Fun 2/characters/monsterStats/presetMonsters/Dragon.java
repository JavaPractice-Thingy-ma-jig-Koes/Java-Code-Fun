package characters.monsterStats.presetMonsters;


import characters.monsterStats.Monster;
import combat.damagePlus.Damage;
import misc_tools.RNG;

public class Dragon extends Monster {
    /** Represents : wing, claw, double claw, tail, breath, and waiting/doing nothing. */
    private double[] moveWeights = {12.5,30,12.5,25,15,5};
    private int lastAttack = -1;
    private int level;
    private boolean isPresent = true;
    private final String[] moveList = {"wing","claw swipe","double claw attack","tail whack", "breath attack","majestic beauty"};

    public Dragon(int level) {
        
        super(((level+1)*5),((int)Math.pow(level,2)/3+level%3+1),(int)(level*1.35),0,"dragon");
        this.level=level;
        
    }
@Override
    public Damage attack(){
        int acNeg=0;
        switch (lastAttack) {
            case 1:
                acNeg=(level/2)+1;
                break;
            case 2:
                acNeg=level+2;
                break;
            case 4:
                acNeg=Integer.MAX_VALUE;
                break;
            default:
                
                break;
        }
        return new Damage(findDamage(),acNeg,getLastAttack(),false);
    }
    private int findDamage()
    {
        lastAttack=RNG.WIG(moveWeights);
        if(lastAttack==0){
            isPresent=false;
            return 0;
        }
        else if(lastAttack==1){
            return RNG.RIG(getMonsterMeleeDamage(),getMonsterMeleeDamage()+level);
        }
        else if(lastAttack==2){
            return RNG.RIG(getMonsterMeleeDamage(),getMonsterMeleeDamage()+level)+RNG.RIG(getMonsterMeleeDamage(),getMonsterMeleeDamage()+level);
        }
        else if(lastAttack==3){
            return RNG.RIG(getMonsterMeleeDamage(),getMonsterMeleeDamage()+level);
        }
        else if(lastAttack==4){
            if(Math.random()>0.4)
            return RNG.RIG(level*2,(int)Math.pow(level,2)+2);
            return 0;
        }
        else{
            return 0;
        }
        
}
//TO DO - utilize these methods in the parent class Monster.java
@Override
    public String getLastAttack(){
        return moveList[lastAttack];
    }
    @Override
    public int getLastAttackNum(){return lastAttack;}
    

}
