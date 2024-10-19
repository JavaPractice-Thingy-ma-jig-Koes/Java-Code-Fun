package PlayerStats;

import MonsterStats.Monster;
import java.util.HashMap;
import Equipment.Item;
import Equipment.Tools.*;

public class Player {
    
    private int healthPoints;
    //private int armorClass;
    //private int meleeDamage;
    //private int rangedDamgeMax;
    private int playerMaxHealth;
    private int xp;
    private int gold;
    private Swords meleeWeapon = new Swords("nothing", 0, 0, 0);
    private Armor armor = new Armor("clothes",0,0);
    private Bow rangedWeapon = new Bow("nothing", 0, 0);



/* 
    public Player(int healthPoints, int meleeDamage, int rangedDamgeMax, int gold)
    {
        this.healthPoints = healthPoints;
        this.meleeDamage = meleeDamage;
        this.rangedDamgeMax = rangedDamgeMax;
        playerMaxHealth = healthPoints;
        this.gold = gold;
        HashMap<String,Item> equipment = new HashMap<>();
        equipment.put("armor",null);
        equipment.put("sword",null);
        //equipment.put("potion",null);
        
        
        xp =0;

    }

    public Player(int healthPoints, int gold)
    {
        this.healthPoints = healthPoints;
        this.meleeDamage = 0;
        this.rangedDamgeMax = 0;
        playerMaxHealth = healthPoints;
        this.gold = gold;
        HashMap<String,Item> equipment = new HashMap<>();
        equipment.put("armor",null);
        equipment.put("sword",null);
        equipment.put("bow",null);
        
        
        xp =0;

    }
*/
        public Player(int healthPoints, int gold, Swords meleeWeapon, Armor armor, Bow rangedWeapon)
    {
        this.healthPoints = healthPoints;

        playerMaxHealth = healthPoints;
        this.gold = gold;
        this.meleeWeapon=meleeWeapon;
        this.armor=armor;
        this.rangedWeapon=rangedWeapon;

        
        
        xp =0;

    }
    public Player(){
        this.healthPoints = 5;
        this.gold=0;
        
    }
        public void equip (Swords other){
            this.meleeWeapon=other;
        }
        public void equip (Bow other){
            this.rangedWeapon=other;
        }
        public void equip (Armor other){
            this.armor=other;
        }

        public void printInventory(){

            System.out.println("Current Melee Weapon " + meleeWeapon.getName());
            System.out.println("Current Ranged Weapon " + rangedWeapon.getName());
            System.out.println("Current Armor " + armor.getName());
            System.out.println("Melee Damage Range : "+meleeWeapon.meleeDamage()+"-"+(meleeWeapon.meleeDamage()+meleeWeapon.meleeRange()-1));
            System.out.println("Ranged Damage Range : 0-"+rangedWeapon.getMaxRangedDamage());
            System.out.println("Armor Class : "+armor.getArmorClass());

        }

    
     //return methods
    /** @see quickDescription returns the player's current hitpoints*/
     public int getPlayerHealthPoints(){
        return healthPoints;
    }
    /** @see quickDescription returns the player's current hitpoints*/
     public int getPlayerGold(){
        return gold;
    }
    /**@see quickDescription returns the player's armor class */
    public int getPlayerArmorClass(){
        return armor.getArmorClass();
    }
    /**@see quickDescription returns the player's melee damage. */
    public int getPlayerMeleeDamage(){
        return meleeWeapon.meleeDamage();
    }
    /**@see quickDescription returns the maximum possible ranged damage */
    public int getPlayerRangedDamageMax(){
        return rangedWeapon.getMaxRangedDamage();
    }
    /**@see quickDescription sets the players health to the originally specified value in the initialization of the object. */
    public void fillPlayerHealth(){
        healthPoints=playerMaxHealth;
    }
    /** @see quickDescription decreases healthPoints by a given amount of damage. 
     * @see ArmorClassReduction includes the damage reduction from the armor class */
    public void givePlayerDamage(int damage){
        healthPoints+=armor.getArmorClass()-damage;
    }
    /**@see quickDescription increments experience value by an integral amount */
    public void giveXP(int increaseBy){
        if(increaseBy>=0){
        xp+=increaseBy;
        }
        }

        /**@see quickDescription returns a possible value for the sword damage. */
    public int swordAttack(){
        return (int)(Math.random()*meleeWeapon.meleeRange())+meleeWeapon.meleeDamage();
    }
        /** @see quickDescription decreases healthPoints by a given amount of damage. 
     * @see ArmorClassReduction includes the damage reduction from the armor class */
    public void takeDamage(int damage){
        if(armor.getArmorClass()-damage>0){
            healthPoints-=damage-armor.getArmorClass();
        }


    
}
}
