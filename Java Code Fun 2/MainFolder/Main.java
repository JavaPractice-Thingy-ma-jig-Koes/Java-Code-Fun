package MainFolder;

import Art.ClassPicker;
import Art.GeneralGUI;
import characters.monsterStats.Monster;
import characters.monsterStats.presetMonsters.Dragon;
import characters.playerStats.Player;
import combat.Combat;
import misc_tools.CleanUp;

public class Main {

    private static int event;

    private static Player toKill = new Player();
    private static GeneralGUI gui = new GeneralGUI(toKill);
    private static Combat scuffle = new Combat(gui, toKill);


    public static void main(String[] args)  {



        System.out.println("Started!");

        gui.print("Hello World! ");
        gui.clear();

        ClassPicker chooseClass = new ClassPicker(toKill);

    }

    public static void onwards(){
        switch (event) {
            case 0:
                scuffle.fight();
                break;
        
            default:
            Combat scuffle = new Combat(gui, toKill);
            scuffle.fight();
                break;
        }

    }

    public static void commenceAdventure(int classNum)
    {
        toKill.issueEquipment(classNum);
        event = 0;
        onwards();
    }
    
}
/*        gui.clear();
        if(toKill.getHealth()>0) gui.print("You win!");
        else gui.print("You Lose"); */