package monsterStats;

import PlayerStats.Player;
import misc_tools.RNG;
import playerStats.Player;
import combat.damagePlus.Damage;

public class Monster {
    
    private int healthPoints;
    private int armorClass;
    private int level;
    private int meleeDamage;
    private int maxRangedDamage;
    private int maxHealthPoints;
    private boolean isPresent;
    private int lastAttack;
    private final String[] moveList = {"melee attack", "ranged attack"};


    public Monster (int healthPoints, int armorClass, int meleeDamage, int maxRangedDamage) {
        this.healthPoints=healthPoints;
        this.armorClass=armorClass;


        this.meleeDamage=meleeDamage;
        this.maxRangedDamage=maxRangedDamage;
        this.maxHealthPoints=healthPoints;
        this.level = (healthPoints/2+armorClass*2+meleeDamage+maxRangedDamage)/10;
        
    }
    public Monster (int level){
        int randomModifier = RNG.RIG(2,4);
        this.level = level;
        if(RNG.RBG()){
        this.healthPoints= (int)Math.pow(randomModifier, level);
        this.armorClass = level;
        }
        else{
            this.healthPoints = level*randomModifier;
            this.armorClass = level+randomModifier+1;
        }



    }
    public Damage attack(){
        boolean meleeOrRange=false;
        lastAttack=RNG.RIG(0, 1);
        if(lastAttack==1){ meleeOrRange=true;
        return new Damage(countDamage(meleeOrRange),moveList[lastAttack]);}
        return new Damage(countDamage(meleeOrRange),moveList[lastAttack]);
    }

     //return methods
    /** @see quickDescription returns the Monster's current hitpoints*/
    public int getMonsterHealthPoints(){
        return healthPoints;
    }
    /**@see quickDescription returns the Monster's armor class */
    public int getMonsterArmorClass(){
        return armorClass;
    }
    /**@see quickDescription returns the Monster's melee damage. */
    public int getMonsterMeleeDamage(){
        return meleeDamage;
    }
    /**@see quickDescription returns the maximum possible ranged damage */
    public int getMonsterRangedDamageMax(){
        return maxRangedDamage;
    }
    /**@see quickDescription sets the Monsters health to the originally specified value in the initialization of the object. */
    public void fillHealth(){
        healthPoints=maxHealthPoints;
    }
    /** @see quickDescription decreases healthPoints by a given amount of damage. 
     * @see ArmorClassReduction includes the damage reduction from the armor class */
    public void takeDamage(int damage){
        if(armorClass-damage>0){
            healthPoints-=damage-armorClass;
        }

}
public int countDamage(boolean meleeOrRange){
    if(meleeOrRange){
        return (RNG.RIG(meleeDamage,meleeDamage+level));
    }
    else{
        return (RNG.RIG(0,maxRangedDamage));
    }
    
}
public String getLastAttack(){
    return moveList[lastAttack];
}
public int getLastAttackNum(){return lastAttack;}



}
