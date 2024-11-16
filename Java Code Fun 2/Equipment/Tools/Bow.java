package equipment.Tools;

import equipment.Item;

public class Bow extends Item {

    private int maxRangedDamage;
    private double toHitChance;
    public Bow(String name, int value, int maxRangedDamage,int toHitChance) {
        
        super(name, value); //?
        this.maxRangedDamage = Math.abs(maxRangedDamage);
        this.toHitChance= Math.abs(toHitChance);
        //while(toHitChance>1){
        //    toHitChance/=10;
        //}

    }
        /**@see quickDescription returns the maximum damage value of the bow */
        public int getMaxRangedDamage(){
            return maxRangedDamage;
        }
        public double getToHitChance()
        {
            return toHitChance;
        }

}
