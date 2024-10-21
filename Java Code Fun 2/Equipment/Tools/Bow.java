package equipment.Tools;

import equipment.Item;

public class Bow extends Item {

    private int maxRangedDamage;
    public Bow(String name, int value, int maxRangedDamage) {
        
        super(name, value); //?
        this.maxRangedDamage = Math.abs(maxRangedDamage);

    }
        /**@see quickDescription returns the maximum damage value of the bow */
        public int getMaxRangedDamage(){
            return maxRangedDamage;
        }

}
