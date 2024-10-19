package MonsterStats;

import PlayerStats.Player;
import misc_tools.RNG;

public class Monster {
    
    private int healthPoints;
    private int armorClass;
    private int level;
    private int meleeDamage;
    private int maxRangedDamage;
    private int maxHealthPoints;


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
public void dealDamage(Player other, boolean meleeOrRange){
    if(meleeOrRange){
        other.takeDamage(RNG.RIG(meleeDamage,meleeDamage+level));
    }
    else{
        other.takeDamage(RNG.RIG(0,maxRangedDamage));
    }
}



}
