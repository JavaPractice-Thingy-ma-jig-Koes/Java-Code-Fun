package combat;



import Art.GeneralGUI;
import combat.damagePlus.Damage;
import monsterStats.*;
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
            brawl();


        }

        public void brawl(){
            gui.print("The enemy attacks you with a "+e1.getLastAttack());
        }

        public synchronized void waitTilReady(){
            while(!gui.getIsReady()){
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {

                }
                
            }
        }

        }

    

