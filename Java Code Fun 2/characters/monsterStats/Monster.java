package characters.monsterStats;

import misc_tools.RNG;
import characters.playerStats.Player;
import combat.damagePlus.Damage;

public class Monster extends characters.Character {
    


    private Integer level;
    private int meleeDamage;
    private int maxRangedDamage;

    private boolean isPresent;
    private int lastAttack;

    private String[] moveList = {"melee attack", "ranged attack"};


    public Monster (int healthPoints, int armorClass, int meleeDamage, int maxRangedDamage, String name) {
        super(name,(healthPoints/2+armorClass*2+meleeDamage+maxRangedDamage)/10,(healthPoints/2+armorClass*2+meleeDamage+maxRangedDamage)/2,healthPoints,armorClass);





        this.meleeDamage=meleeDamage;
        this.maxRangedDamage=maxRangedDamage;


        
    }
    public Monster (int level){
        super("monster",level);
        int randomModifier = RNG.RIG(2,4);


        if(RNG.RBG()){
        setMaxHealth((int)Math.pow(randomModifier, level));
        setArmorClass(level);
        }
        else{
        setMaxHealth(level*randomModifier);
        setMaxHealth(level+randomModifier+1);
        }
    }
        public Monster (int level, String[] moveList){
            super("monster",level);
            int randomModifier = RNG.RIG(2,4);
    
    
            if(RNG.RBG()){
            setMaxHealth((int)Math.pow(randomModifier, level));
            setArmorClass(level);
            }
            else{
            setMaxHealth(level*randomModifier);
            setMaxHealth(level+randomModifier+1);
            }
            this.moveList=moveList;
        




    }
    public Damage attack(){
        boolean meleeOrRange=false;
        lastAttack=RNG.RIG(0, 1);
        if(lastAttack==1){ meleeOrRange=true;
        return new Damage(countDamage(meleeOrRange),moveList[lastAttack]);}
        return new Damage(countDamage(meleeOrRange),moveList[lastAttack]);
    }

     //return methods

    /**@see quickDescription returns the Monster's melee damage. */
    public int getMonsterMeleeDamage(){
        return meleeDamage;
    }
    /**@see quickDescription returns the maximum possible ranged damage */
    public int getMonsterRangedDamageMax(){
        return maxRangedDamage;
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
