package characters;

public class Character {

    private int healthPoints;
    private int level;
    private int gold;
    private String name;
    private int maxHealth;
    private int armorClass;

    
    public Character ()
    {
        healthPoints = 0;
        level = 0;
        gold = 0;
        name = "";
        maxHealth = 9;
        armorClass = 0;
    }

    public Character (int level)
    {
        this.level=level;
        healthPoints=level*5;
        gold = level*10;
        name = "";
        maxHealth = healthPoints;
        armorClass = level;
    }
    public Character (String name)
    {
        this.name = name;
        level = 0;
        healthPoints = 0;
        gold = 0;
        maxHealth = healthPoints;
        armorClass = 0;
    }
    public Character (String name, int level)
    {
        this.name = name;
        this.level = level;
        healthPoints = level*5;
        gold = level*10;
        maxHealth = healthPoints;
        armorClass = level;
    }
    public Character (String name, int level, int gold, int healthPoints, int armorClass) 
    {
        this.name=name;
        this.level = level;
        this.gold = gold;
        this.healthPoints = healthPoints;
        maxHealth = healthPoints;
        this.armorClass = armorClass;
    }
        /** @see quickDescription returns the character's current hitpoints*/
    public int getHealth()
    {
        return healthPoints;
    }
    /** @see quickDescription returns the character's current gold*/

    public int getGold()
    {
        return gold;
    }
        /** @see quickDescription returns the character's current level*/

    public int getLevel()
    {
        return level;
    }
        /** @see quickDescription returns the character's current maximum hitpoints*/

    public int getMaxHealth()
    {
        return maxHealth;
    }
    /** @see quickDescription returns the character's name*/

    public String getName ()
    {
        return name;
    }
    /** @see quickDescription returns the character's current hitpoints to their maximum hitpoints*/

    public void fillHealth()
    {
        healthPoints = maxHealth;
    }

        /** @see quickDescription decreases healthPoints by a given amount of damage. 
     * @see ArmorClassReduction includes the damage reduction from the armor class */
    public void takeDamage(int damage){
        if(damage-armorClass>0){
            healthPoints-=damage-armorClass;
        }
    }
    public int getXpGiven ()
    {
        return level*5;
    }
    public int getArmorClass(){
        return armorClass;
    }


    protected void setArmorClass(int armorClass)
    {
        if(armorClass>=0)
        this.armorClass = armorClass;
        else
        throw new IllegalArgumentException("ArmorClass cannot be negative");
    }

    protected void setMaxHealth(int newMaxHealth)
    {
        if(newMaxHealth>=1){
            healthPoints+=newMaxHealth-maxHealth;
            maxHealth=newMaxHealth;
        }
        else
        throw new IllegalArgumentException("newMaxHealth cannot be less than 1");
    }
    protected void setName(String name)
    {
        if(name!=null)
        this.name = name;

    }

}
