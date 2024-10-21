package combat.damagePlus;

import playerStats.Player;

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

        this.damage=damage;
        this.armorClassNegation=armorClassNegation;
        this.damageSource=damageSource;
        this.toHitChance=toHitChance;
        this.damageType=damageType;
    }
    public Damage (int damage, int armorClassNegation, String damageSource, double toHitChance){
        setZero();
        this.damage=damage;
        this.armorClassNegation=armorClassNegation;
        this.damageSource=damageSource;
        this.toHitChance=toHitChance;
    }
    public Damage (int damage, int armorClassNegation, String damageSource, boolean ignoreArmorClass){
        setZero();
        this.damage=damage;
        this.armorClassNegation=armorClassNegation;
        this.damageSource=damageSource;
        if(ignoreArmorClass) armorClassNegation=Integer.MAX_VALUE-1;
    }
    

    private void setZero(){
        armorClassNegation=0;
        damage=0;
        damageType="no damage";
        toHitChance=100;
        damageSource="none";
    }
    public int dealDamage(Player toHurt){
        
        if(toHitChance<Math.random()*100){
        if(toHurt.getPlayerArmorClass()-armorClassNegation<0) armorClassNegation=toHurt.getPlayerArmorClass();
       toHurt.takeDamage(damage+armorClassNegation); 
       return damage+armorClassNegation;
    }
    return 0;
}
    
    public String getDamageSource(){
    return damageSource;}


}
