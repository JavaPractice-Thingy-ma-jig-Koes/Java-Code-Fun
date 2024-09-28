package Equipment.Tools;

import Equipment.Item;

public class Armor extends Item{

    private int armorClass;
    public Armor(String name, int value, int armorClass) {
        super(name, value);

        this.armorClass = Math.abs(armorClass);
        
    }
    /**@see quickDescription returns the armor class given by the armor. */
    public int getArmorClass(){
        return armorClass;
    }
}
