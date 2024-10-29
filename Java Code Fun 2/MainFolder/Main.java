package MainFolder;

import Art.GeneralGUI;
import characters.monsterStats.Monster;
import characters.monsterStats.presetMonsters.Dragon;
import characters.playerStats.Player;
import combat.Combat;
import misc_tools.CleanUp;

public class Main {




    public static void main(String[] args)  {

        Player toKill = new Player();
        Dragon toMurder = new Dragon(1);

        GeneralGUI gui = new GeneralGUI(toKill);


        System.out.println("Started!");

        gui.print("Hello World! ");
        gui.clear();

        gui.chooseClass();



        Combat fight = new Combat(gui, toKill,toMurder);
        fight.fight();

        gui.clear();
        if(toKill.getHealth()>0) gui.print("You win!");
        else gui.print("You Lose");



        //gui.print("Hello World!");
        
    }
    
}