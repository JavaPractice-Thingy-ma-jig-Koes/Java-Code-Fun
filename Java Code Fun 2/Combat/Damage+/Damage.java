

public class Damage {
    
    private int armorClassNegation;
    private int damage;
    private String damageType;
    private double toHitChance;
    private String damageSource;

    public Damage (){
        setZero();
    }

    public Damage (int damage, String damageSource){
        setZero();
        this.damage=damage;
        this.damageSource=damageSource;
    }
    public Damage (int damage, int armorClassNegation, String damageSource){
        setZero();
        this.damage=damage;
        this.armorClassNegation=armorClassNegation;
        this.damageSource=damageSource;
    }
    public Damage (int damage, int armorClassNegation, String damageSource, String damageType){
        setZero();
        this.damage=damage;
        this.armorClassNegation=armorClassNegation;
        this.damageSource=damageSource;
        this.damageType=damageType;
    }
    public Damage (int damage, int armorClassNegation, String damageSource, String damageType, double toHitChance){
        setZero();
        this.damage=damage;
        this.armorClassNegation=armorClassNegation;
        this.damageSource=damageSource;
        this.toHitChance=toHitChance;
    }
    

    private void setZero(){
        armorClassNegation=0;
        damage=0;
        damageType="no damage";
        toHitChance=100;

        damageSource="none";
    }
}
