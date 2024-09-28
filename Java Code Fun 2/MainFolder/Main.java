package MainFolder;

import PlayerStats.Player;
import PlayerStats.SeeInventory;

import java.util.Scanner;

import Art.PrintArt;
import Equipment.Tools.Swords;
import misc_tools.*;

public class Main
{
    public static void main(String[] args) throws Exception{

        //PrintArt.printArt(PrintArt.playerArt);



        PlayerStats.Player p1 = new Player();

        System.out.println(p1.swordAttack());
        Thread x = new Thread(new SeeInventory());
        x.start();
        
        
    }
}