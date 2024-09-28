package MonsterStats;

public class Monster {
    
    private int healthPoints;
    private int armorClass;
    private int level;
    private int meleeDamage;
    private int maxRangedDamage;
    private int maxHealthPoints;

    public Monster (int healthPoints, int armorClass, int level, int meleeDamage, int maxRangedDamage) {
        this.healthPoints=healthPoints;
        this.armorClass=armorClass;
        this.level=level;
        this.meleeDamage=meleeDamage;
        this.maxRangedDamage=maxRangedDamage;
        this.maxHealthPoints=healthPoints;
        
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
}
