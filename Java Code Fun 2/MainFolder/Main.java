package MainFolder;

import java.io.File;

import Art.ClassPicker;
import Art.GeneralGUI;
import characters.playerStats.Player;
import combat.Combat;


public class Main {

    private static int event;

    private static Player toKill = new Player( 10, 5);
    private static GeneralGUI gui = new GeneralGUI(toKill);
    private static Combat scuffle = new Combat(gui, toKill);


    public static void main(String[] args)  {


        System.out.println("\u001b[46m"+"Started!"+"\u001b[0m");

        System.out.println("\u001b[42m"+new File("").getAbsolutePath()+"\u001b[0m");


        gui.print("Please Choose a Class");

        gui.chooseClass();



    }

    public static void onwards(){
        gui.clear();
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

        gui.setPvis(true);
        onwards();
    }
    
}
/*        gui.clear();
        if(toKill.getHealth()>0) gui.print("You win!");
        else gui.print("You Lose"); */