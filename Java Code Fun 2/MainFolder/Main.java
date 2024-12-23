package MainFolder;

import java.io.File;


import Art.GeneralGUI;
import characters.playerStats.Player;
import combat.Combat;
import misc_tools.ColorPrint;


public class Main {

    private static int event;


    private static Player toKill = new Player( 10, 5);
    private static GeneralGUI gui = new GeneralGUI(toKill);
    private static Combat scuffle = new Combat(gui, toKill);


    public static void main(String[] args)  {


        ColorPrint.print("Started",46);

        ColorPrint.print(new File("").getAbsolutePath(),43);


        gui.print("Please Choose a Class");

        gui.chooseClass();



    }

    public static void onwards(){
        gui.clear();
        switch (event) {
            case 0:
            event++;
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

        gui.setPvis(true);
        onwards();
    }
    
}
/*        gui.clear();
        if(toKill.getHealth()>0) gui.print("You win!");
        else gui.print("You Lose"); */