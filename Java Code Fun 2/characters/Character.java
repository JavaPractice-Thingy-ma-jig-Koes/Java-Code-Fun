package characters;

public class Character {

    private int healthPoints;
    private int level;
    private int gold;
    private String name;
    private int maxHealth;


    
    public Character ()
    {
        healthPoints = 0;
        level = 0;
        gold = 0;
        name = "";
        maxHealth = 9;
    }

    public Character (int level)
    {
        this.level=level;
        healthPoints=level*5;
        gold = level*10;
        name = "";
        maxHealth = healthPoints;
    }
    public Character (String name)
    {
        this.name = name;
        level = 0;
        healthPoints = 0;
        gold = 0;
        maxHealth = healthPoints;
    }
    public Character (String name, int level)
    {
        this.name = name;
        this.level = level;
        healthPoints = level*5;
        gold = level*10;
        maxHealth = healthPoints;
    }
    public Character (String name, int level, int gold, int healthPoints) 
    {
        this.name=name;
        this.level = level;
        this.gold = gold;
        this.healthPoints = healthPoints;
        maxHealth = healthPoints;
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
        /** @see quickDescription decreases the character's current hitpoints*/

    public void takeDamage ( int damage)
    {
        if(damage>0)
        healthPoints-=damage;
    }
    public int getXpGiven ()
    {
        return level*5;
    }

}
