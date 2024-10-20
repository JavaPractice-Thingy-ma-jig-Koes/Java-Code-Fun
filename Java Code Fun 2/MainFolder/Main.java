package MainFolder;

import PlayerStats.Player;
import PlayerStats.SeeInventory;
import Combat.Combat;

import java.util.Scanner;

import Art.PrintArt;
import Equipment.Tools.Swords;
import MonsterStats.Preset_Monsters.Dragon;
import misc_tools.*;

public class Main
{
    public static void main(String[] args) throws Exception{

        //PrintArt.printArt(PrintArt.playerArt);


//need to use buffered reader instead of scanner

        PlayerStats.Player p1 = new Player();

        //System.out.println(p1.swordAttack());
        Thread x = new Thread(new SeeInventory());
        x.start();
        Dragon e1 = new Dragon(1);
        Combat.fight(p1,e1);
        
        
    }
}