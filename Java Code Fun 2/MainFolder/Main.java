package MainFolder;

import java.io.File;


import Art.GeneralGUI;
import characters.playerStats.Player;
import combat.Combat;
import misc_tools.ColorPrint;


public class Main {

    private static int event;


    private static Player toKill = new Player( 10, 5);
    private static GeneralGUI gui = new GeneralGUI();
    private static Combat scuffle = new Combat();

    public static Player getPlayer(){return toKill;}
    public static GeneralGUI getGui(){return gui;}

    public static void main(String[] args)  {


        ColorPrint.print("Started",46);

        ColorPrint.print(new File("").getAbsolutePath(),43);


        gui.print("Please Choose a Class");

        gui.chooseClass();



    }

    public static void onwards(int event){
        gui.clear();
        ColorPrint.print("Event "+event+ " triggered",31);
        switch (event) {
            case 1:
            
                break;

            default:
            ColorPrint.print("Default event triggered",31);
            scuffle.fight();
                break;
        }

    }
    public static void onwards(){onwards(event);}

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