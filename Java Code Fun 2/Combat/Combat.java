package combat;



import Art.GeneralGUI;
import combat.damagePlus.Damage;
import monsterStats.*;
import misc_tools.CleanUp;
import misc_tools.FunnyText;
import playerStats.Player;

public class Combat {
    private GeneralGUI gui;
    private Player p1;
    private Monster e1;
    private Damage dealth;



    public Combat(GeneralGUI gui, Player p1, Monster e1)  {
        this.gui= gui;
        this.p1=p1;
        this.e1=e1;
        
    }

    public void fight() {
            System.out.println("Combat has started");
            gui.enter();
            gui.println("are you ready?");
            gui.prepare();
            

            waitTilReady();

            gui.clear();
            while(stillFighting())
            brawl();


        }

        public void brawl(){
            dealth=e1.attack();
            
            
            gui.print("The "+e1.getName()+" attacks you with a "+e1.getLastAttack()+" dealing "+dealth.dealDamage(p1)+" damage.");
            gui.update();
            if(stillFighting()){
            CleanUp.safeSleep(1500);
            gui.clear();
            gui.prepare();
            gui.print("Click READY when ready.");
            waitTilReady();
            gui.clear();
            dealth = pAttack();

            gui.print("You attack and deal "+dealth.dealDamage(e1)+" damage to the enemy with your "+dealth.getDamageSource()+".");
            }




        }

        public synchronized void waitTilReady(){
            while(!gui.getIsReady()){
                CleanUp.safeSleep(1000);
                
            }
        }
        public Damage pAttack(){
            if(gui.getSwordBow())
            return p1.swordAttack();
            return p1.bowAttack();
        }
        public boolean stillFighting(){

            return p1.getPlayerHealthPoints()>0 && e1.getMonsterHealthPoints()>0;
        }
        

        }

    

