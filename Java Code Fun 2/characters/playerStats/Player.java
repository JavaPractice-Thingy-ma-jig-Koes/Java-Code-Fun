package characters.playerStats;

import equipment.Item;
import equipment.Tools.*;

import java.util.HashMap;

import characters.monsterStats.Monster;
import combat.damagePlus.Damage;

public class Player extends characters.Characters {
    
    private int healthPoints;
    private static final String p = "Player";
        //private int armorClass;
        //private int meleeDamage;
        //private int rangedDamgeMax;
        private int playerMaxHealth;
        private int xp;
        private int gold;
        private Swords meleeWeapon = new Swords("nothing", 0, 0, 0);
        private Armor armor = new Armor("clothes",0,0);
        private Bow rangedWeapon = new Bow("nothing", 0, 0,0);
    
    
    
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
            public Player(String name, int healthPoints, int gold, Swords meleeWeapon, Armor armor, Bow rangedWeapon)
        {super(name,healthPoints,gold,healthPoints,armor.getArmorClass());
            this.healthPoints = healthPoints;
    
            playerMaxHealth = healthPoints;
            this.gold = gold;
            this.meleeWeapon=meleeWeapon;
            this.armor=armor;
            this.rangedWeapon=rangedWeapon;
    
            
            
            xp =0;
    
        }
        public Player(String name, int healthPoints, int gold){
            super(name,0,gold,healthPoints,0);
        }
        public Player(int healthPoints, int gold){
            super(p, 0,gold,healthPoints,0);
    }
    public Player(int healthPoints){
        super(p,0,0,healthPoints,0);
    }
    public Player(){ super(p,0,0,5,0);
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

/**@deprecated does not work with the new GUI */
        public void printInventory(){

            System.out.println("Current Melee Weapon " + meleeWeapon.getName());
            System.out.println("Current Ranged Weapon " + rangedWeapon.getName());
            System.out.println("Current Armor " + armor.getName());
            System.out.println("Melee Damage Range : "+meleeWeapon.meleeDamage()+"-"+(meleeWeapon.meleeDamage()+meleeWeapon.meleeRange()-1));
            System.out.println("Ranged Damage Range : 0-"+rangedWeapon.getMaxRangedDamage());
            System.out.println("Armor Class : "+armor.getArmorClass());

        }

        public Bow getRanged(){
            return rangedWeapon;
        }
        public Swords getSwords(){
            return meleeWeapon;
        }
        public Armor getArmor(){
            return armor;
        }

    /**@see quickDescription returns the player's armor class */
    @Override
    public int getArmorClass(){
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

    /**@see quickDescription increments experience value by an integral amount */
    public void giveXP(int increaseBy){
        if(increaseBy>=0){
        xp+=increaseBy;
        }
        }

        /**@see quickDescription returns a possible value for the sword damage. */
    public Damage swordAttack(){
        return new Damage((int)(Math.random()*meleeWeapon.meleeRange())+meleeWeapon.meleeDamage(),meleeWeapon.getName());
    }
        /**@see quickDescription returns a possible value for the bow damage. */

    public Damage bowAttack(){
        return new Damage((int)(Math.random()*(rangedWeapon.getMaxRangedDamage()+1)),rangedWeapon.getName());
    }

    public void issueEquipment(int index)
        {
        switch (index) {
            case 1:
            equip(new Armor("leather armor", 15, 3));
            equip(new Bow("longbow", 20, 7,75));
equip(new Swords ("rusty knife", 0, 1,2));

                break;
            
            case 2:
equip(new Armor ("robes", 10, 0));
equip(new Bow ("magic missile", 30, 8,72));
equip(new Swords ("acid splash", 25,4,7));
                break;
        
            default:
equip(new Armor ("plate armor", 24, 5));
equip(new Bow ("tattered sling", 0,2,50));
equip(new Swords ("steel sword", 15, 3, 6));
                break;
            }

        }




    

}
