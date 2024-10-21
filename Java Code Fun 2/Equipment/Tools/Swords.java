package equipment.Tools;

import equipment.Item;

public class Swords extends Item {

    private int meleeDamageMIN;
    private int meleeDamageMAX;
    public Swords(String name, int value, int meleeDamageMIN, int meleeDamageMAX) {
        super(name, value);
        this.meleeDamageMIN = Math.abs(meleeDamageMIN);
        this.meleeDamageMAX = Math.abs(meleeDamageMAX);
            if(meleeDamageMAX<meleeDamageMIN){
                int temp = meleeDamageMAX;
                meleeDamageMAX=meleeDamageMIN;
                meleeDamageMIN=temp;
            }
        
    }
    /**@see quickDescription returns the base melee damage of the sword. */
    public int meleeDamage(){
        return meleeDamageMIN;
    }
    /**@see quickDescription returns the range of the meleeDamageMAX and meleeDamageMIN+1, does NOT return the range of the melee weapon. */
    public int meleeRange(){

        return meleeDamageMAX-meleeDamageMIN+1;
    }

}
