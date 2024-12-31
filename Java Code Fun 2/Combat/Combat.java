package combat;



import Art.GeneralGUI;
import MainFolder.Main;
import characters.monsterStats.*;
import characters.monsterStats.presetMonsters.Dragon;
import characters.playerStats.Player;
import combat.damagePlus.Damage;
import misc_tools.CleanUp;
import misc_tools.RNG;


public class Combat {
    private GeneralGUI gui;
    private Player p1;
    private Monster e1;
    private Damage dealth;
    private int event;


    public Combat()  {
        e1 = new Dragon(1); //will become a method of its own class to create the enemies.
        this.gui= Main.getGui();
        this.p1=Main.getPlayer();

        gui.update();
        
    }

    public void fight() {
        printHealths();
        CleanUp.safeSleep(3000);
        if(event==0){
            System.out.println("Combat has started");
            gui.prepare();
            gui.println("are you ready?");
            System.out.println("EVENT : "+event+ " waiting for initial READY press");

            event = 1;

        }
        else if (event == 1){
            if(RNG.RBG()){
                brawl();
            }
            event++;
            if(stillFighting())
            {
                System.out.println("Player is choosing a weapon");
            gui.clear();
            gui.print("Choose a weapon and click READY.");
            }
            gui.prepare();

        }
        else if ((event >=2)&&(stillFighting())){
            gui.clear();
            dealth = pAttack();
            System.out.println("EVENT : "+event+ " Player is attacking");
            gui.print("You attack and deal "+dealth.dealDamage(e1)+" damage to the enemy with your "+dealth.getDamageSource()+". ");
            event++;
            if(stillFighting()) brawl();
            if(stillFighting()) gui.prepare();
        }
        if(!stillFighting()){

                gui.clear();
                gui.print("Combat over");
                if(p1.getHealth()<=0){
                    System.out.println("Player lost");
                }
                else{
                    System.out.println("Player won");
                }
            }
        





        }

        public void brawl(){
            dealth=e1.attack();
            
            System.out.println("Enemy is attacking");
            gui.print("The "+e1.getName()+" attacks you with a "+e1.getLastAttack()+" dealing "+dealth.dealDamage(p1)+" damage. ");
            gui.update();
            if(stillFighting()){
            gui.prepare();
            gui.print("Click READY when ready. ");
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
            System.out.println("Event : "+event+" - Still Fighting");
            return p1.getHealth()>0 && e1.getHealth()>0;
        }
        
        private void printHealths()
        {
            System.out.println("Event "+event);
            System.out.println("Player Health : "+p1.getHealth());
            System.out.println("Enemy Health : "+e1.getHealth());
        }

    }