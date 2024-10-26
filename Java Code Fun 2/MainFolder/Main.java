package MainFolder;

import Art.GeneralGUI;
import combat.Combat;

public class Main {


    public static void main(String[] args)  {

        GeneralGUI gui = new GeneralGUI();

        System.out.println("Started!");

        gui.print("Hello World! ");
        Combat fight = new Combat(gui);
        fight.start();



        //gui.print("Hello World!");
        
    }
    
}