package combat;



import Art.GeneralGUI;
import combat.damagePlus.Damage;
import monsterStats.*;
import misc_tools.CleanUp;
import misc_tools.FunnyText;
import playerStats.Player;

public class Combat extends Thread{
    private GeneralGUI gui;
    private Player p1;
    private Monster e1;



    public Combat(GeneralGUI gui, Player p1, Monster e1)  {
        this.gui= gui;
        this.p1=p1;
        this.e1=e1;
        
    }
    @Override
    public synchronized void run() {
            System.out.println("Combat has started");
            gui.print("ARE \nYOU \nREADY?");
            gui.prepare();

            waitTilReady();

            gui.clear();
            while(p1.getPlayerHealthPoints()>0 && e1.getMonsterHealthPoints()>0)
            brawl();


        }

        public void brawl(){
            e1.attack().dealDamage(p1);
            gui.print("The "+e1.getName()+" attacks you with a "+e1.getLastAttack());
            CleanUp.safeSleep(1500);
            gui.clear();
            gui.prepare();
            gui.print("Click READY when ready.");
            waitTilReady();
            gui.clear();
            Damage dealth = pAttack();

            gui.print("You attack and deal "+dealth.dealDamage(e1)+" to the enemy with your "+dealth.getDamageSource()+".");





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
        

        }

    

