package MainFolder;

import Art.GeneralGUI;
import combat.Combat;
import monsterStats.Monster;
import monsterStats.presetMonsters.Dragon;
import playerStats.Player;

public class Main {




    public static void main(String[] args)  {

        Player toKill = new Player();
        Dragon toMurder = new Dragon(1);

        GeneralGUI gui = new GeneralGUI(toKill);


        System.out.println("Started!");

        gui.print("Hello World! ");

        Combat fight = new Combat(gui, toKill,toMurder);
        fight.fight();

        gui.clear();
        if(toKill.getPlayerHealthPoints()>0) gui.print("You win!");
        else gui.print("You Lose");



        //gui.print("Hello World!");
        
    }
    
}