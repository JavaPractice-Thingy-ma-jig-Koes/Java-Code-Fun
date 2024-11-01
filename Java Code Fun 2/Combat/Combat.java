package combat;



import Art.GeneralGUI;
import characters.monsterStats.*;
import characters.monsterStats.presetMonsters.Dragon;
import characters.playerStats.Player;
import combat.damagePlus.Damage;
import misc_tools.CleanUp;
import misc_tools.FunnyText;
import equipment.Tools.Armor;
import equipment.Tools.Bow;
import equipment.Tools.Swords;

public class Combat {
    private GeneralGUI gui;
    private Player p1;
    private Monster e1;
    private Damage dealth;
    private int event;


    public Combat(GeneralGUI gui, Player p1)  {
        e1 = new Dragon(1); //will become a method of its own class to create the enemies.
        this.gui= gui;
        this.p1=p1;

        gui.update();
        
    }

    public void fight() {
        if(event==0){
            System.out.println("Combat has started");
            gui.prepare();
            gui.println("are you ready?");
            event = 1;
        }
        else if (event == 1){
            brawl();
            event++;
            if(stillFighting())
            {
            gui.clear();
            gui.print("Choose a weapon and click READY.");}
        }
        else if ((event >=2)&&(stillFighting())){
            gui.clear();
            dealth = pAttack();
            gui.print("You attack and deal "+dealth.dealDamage(e1)+" damage to the enemy with your "+dealth.getDamageSource()+".");
            event++;
            if(stillFighting())
            {
            brawl();
            gui.prepare();
            }
        }





        }

        public void brawl(){
            dealth=e1.attack();
            
            
            gui.print("The "+e1.getName()+" attacks you with a "+e1.getLastAttack()+" dealing "+dealth.dealDamage(p1)+" damage.");
            gui.update();
            if(stillFighting()){
            gui.clear();
            
            if(stillFighting()){gui.prepare();
            gui.print("Click READY when ready.");}
            
            }

/*gui.clear();
            dealth = pAttack();

            gui.print("You attack and deal "+dealth.dealDamage(e1)+" damage to the enemy with your "+dealth.getDamageSource()+"."); */


        }

        
        
        public Damage pAttack(){
            if(gui.getSwordBow())
            return p1.swordAttack();
            return p1.bowAttack();
        }
        public boolean stillFighting(){

            return p1.getHealth()>0 && e1.getHealth()>0;
        }
        
        

    }